import mar.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import mar.marBaseListener;
import java.util.Arrays;
import java.nio.ByteBuffer;


public class marCompiler {

    public static class Translate extends marBaseListener {

        private byte[] bytecode = new byte[1000];
        private String[] debugCompile = new String[1000];

        private int stackSize = 0;
        public String[] stack =new String[1000];
        public Object[] constant =new Object[1000];
        private int index = 0;
        private int indexs = 0;
        private int indexss = 0;
        private int countErros = 0;

        private void push(String value) {
            stack[stackSize++] = value;
        }

        private String pop() {
            return stack[--stackSize];
        }

        public void exitADD(marParser.ADDContext ctx) {
            String leftType = pop();
            String rightType = pop();
            if (leftType.equals("bool") || rightType.equals("bool") || leftType.equals("nil") || rightType.equals("nil") || !leftType.equals(rightType) ) {
                System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                        " error: operator + is invalid between " + rightType + " and " + leftType);
                this.countErros++;
                push("number");
            } else if (leftType.equals("string")) {
                bytecode[index++] = 0; // código para instrução "ADD"
                debugCompile[indexs++] = "CONCAT";
                push("string");
            } else if ((leftType.equals("number"))){
                bytecode[index++] = 0; // código para instrução "ADD"
                debugCompile[indexs++] = "ADD";
                push("number");
            }
        }


        public void exitMINUS(marParser.MINUSContext ctx) {
            String leftType = pop();
            String rightType = pop();
            if (!leftType.equals("number")) {
                System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                        " error: operator - is invalid between " + leftType + " and " + rightType);
                this.countErros++;
            } else {
                bytecode[index++] = 1; // codigo para instrucao "MINUS"
                debugCompile[indexs++] = "SUB";
            }
            push("number");
        }

        public void exitUNAR(marParser.UNARContext ctx) {
            String rightType = pop();
            if (ctx.UNAR.getText().equals("not")) {
                if (!rightType.equals("bool")){
                    System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                            " error: unary operator not is invalid for " + rightType);
                    this.countErros++;
                } else {
                    bytecode[index++] = 9; // código para in)strução "NOT"
                    debugCompile[indexs++] = "NOT";
                }
                push("bool");
            } else if (ctx.UNAR.getText().equals("-")) {
                if (!rightType.equals("number")){
                    System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                            " error: unary operator - is invalid for " + rightType);
                    this.countErros++;
                } else {
                    bytecode[index++] = 4; // código para instrução "UMINUS"
                    debugCompile[indexs++] = "UMINUS";
                }
                push("number");
            }
        }



        public void exitDIVMULT(marParser.DIVMULTContext ctx) {
            String leftType = pop();
            String rightType = pop();
            if (leftType.equals("bool") || rightType.equals("bool") || leftType.equals("nil") || rightType.equals("nil") ||  leftType.equals("string") || rightType.equals("string")  ) {
                System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                        " error: operator * is invalid between " + rightType + " and " + leftType);
                this.countErros++;
            }else {
                if (ctx.OPERADOR.getText().equals("/")) {
                    bytecode[index++] = 3; // codigo para instrucao "DIV"
                    debugCompile[indexs++] = "DIV";
                } else {
                    bytecode[index++] = 2;
                    debugCompile[indexs++] = "MULT";

                }
            }
            push("number");
        }

        public void exitNUM(marParser.NUMContext ctx) {
            bytecode[index++] = 7;
            double value = Double.parseDouble(ctx.getText());
            byte[] doubleBytes = ByteBuffer.allocate(8).putDouble(Double.parseDouble(ctx.getText())).array();
            System.arraycopy(doubleBytes, 0, bytecode, index, Double.BYTES);
            index += Double.BYTES;
            debugCompile[indexs++] = "CONST";
            constant[indexss++] = "<NUMBER:" + value + ">";
            push("number");
        }


        public void exitPrintExp(marParser.PrintExpContext ctx) {
            String leftType = pop();
            bytecode[index++] = 5; // codigo para instrucao "PRINT"
            if (leftType.equals("number")) {
                debugCompile[indexs++] = "PRINT_N";
            }
            if (leftType.equals("bool")) {
                debugCompile[indexs++] = "PRINT_B";
            }
            if (leftType.equals("string")) {
                debugCompile[indexs++] = "PRINT_S";
            }
            if (leftType.equals("nil")) {
                debugCompile[indexs++] = "PRINT_NIL";
            }
        }

        public void exitProg(marParser.ProgContext ctx) {
            bytecode[index++] = 6; // codigo para instrucao "HALT"
            debugCompile[indexs++] = "HALT";
        }

        public void exitSTRING(marParser.STRINGContext ctx) {
            String str = ctx.getText();
            // Remove as aspas duplas do início e do fim da string
            str = str.substring(1, str.length() - 1);
            // Obtem o tamanho da string
            int strLength = str.length();
            // Adiciona a string ao bytecode
            bytecode[index++] = 8;
            // Adiciona o tamanho da string em caracteres (4 bytes)
            byte[] sizeBytes = ByteBuffer.allocate(4).putInt(strLength).array();
            System.arraycopy(sizeBytes, 0, bytecode, index, 4);
            index += 4;
            // Adiciona a string
            for (int i = 0; i < strLength; i++) {
                bytecode[index++] = (byte) str.charAt(i);
            }
            // Atualiza o array de debug
            debugCompile[indexs++] = "CONST";
            constant[indexss++] = "<STRING:" + ctx.getText() + ">";
            push("string");
        }


        public void exitBOOL(marParser.BOOLContext ctx) {
            if (ctx.getText().equals("true")) {
                bytecode[index++] = 10; // codigo para instrucao "BCONST_1"
                debugCompile[indexs++] = "TRUE";
                push("bool");
            } else {
                bytecode[index++] = 11; // codigo para instrucao "BCONST_0"
                debugCompile[indexs++] = "FALSE";
                push("bool");
            }
        }
        public void exitNIL(marParser.NILContext ctx) {
            bytecode[index++] = 12; // codigo para instrucao "NIL"
            debugCompile[indexs++] = "NIL";
            push("nil");
        }

        public void exitREL(marParser.RELContext ctx) {
            String leftType = pop();
            String rightType = pop();
            switch (ctx.RELACIONAL.getText()) {
                case ">":
                    if (!leftType.equals("number")) {
                        System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                                " error: operator > is invalid between " + rightType + " and " + leftType);
                    } else {
                        bytecode[index++] = 13; // codigo para instrucao "GT"
                        debugCompile[indexs++] = "GT";
                    }
                    break;
                case ">=":
                    if (!leftType.equals("number")) {
                        System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                                " error: operator >= is invalid between " + rightType + " and " + leftType);
                    } else {
                        bytecode[index++] = 14; // codigo para instrucao "GE"
                        debugCompile[indexs++] = "GEQ";
                    }
                    break;
                case "<":
                    if (!leftType.equals("number")) {
                        System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                                " error: operator < is invalid between " + rightType + " and " + leftType);
                    } else {
                        bytecode[index++] = 15; // codigo para instrucao "LT"
                        debugCompile[indexs++] = "LT";
                    }
                    break;
                case "<=":
                    if (!leftType.equals("number")) {
                        System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                                " error: operator <= is invalid between " + rightType + " and " + leftType);
                    } else {
                        bytecode[index++] = 16; // codigo para instrucao "LE"
                        debugCompile[indexs++] = "LEQ";
                    }
                    break;
                default:
                    throw new RuntimeException("Operador relacional desconhecido: " + ctx.RELACIONAL.getText());
            }
            push("bool");
        }

        public void exitCOMP(marParser.COMPContext ctx) {
            String leftType = pop();
            String rightType = pop();
            if (ctx.COMP.getText().equals("==")) {
                if (!leftType.equals(rightType)) {
                    System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                            " error: operator == is invalid between " + rightType + " and " + leftType);
                } else {
                    bytecode[index++] = 17; // codigo para instrucao "AND"
                    if(leftType.equals("number")) {
                        debugCompile[indexs++] = "EQ_N";
                    }
                    if(leftType.equals("bool")) {
                        debugCompile[indexs++] = "EQ_B";
                    }
                    if(leftType.equals("string")) {
                        debugCompile[indexs++] = "EQ_S";
                    }
                    if(leftType.equals("nil")) {
                        debugCompile[indexs++] = "EQ_NIL";
                    }
                }
            } else {
                if (!leftType.equals(rightType)) {
                    System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                            " error: operator != is invalid between " + rightType + " and " + leftType);
                } else {
                    bytecode[index++] = 18; // codigo para instrucao "OR"
                    if(leftType.equals("number")) {
                        debugCompile[indexs++] = "NEQ_N";
                    }
                    if(leftType.equals("bool")) {
                        debugCompile[indexs++] = "NEQ_B";
                    }
                    if(leftType.equals("string")) {
                        debugCompile[indexs++] = "NEQ_S";
                    }
                    if(leftType.equals("nil")) {
                        debugCompile[indexs++] = "NEQ_NIL";
                    }
                }
            }
            push("bool");
        }

        public void exitAND(marParser.ANDContext ctx) {
            String leftType = pop();
            String rightType = pop();
            if (!leftType.equals("bool") || !rightType.equals("bool")) {
                System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                        " error: operator and is invalid between " + rightType + " and " + leftType);
                this.countErros++;
            } else{
                bytecode[index++] = 19; // codigo para instrucao "AND"
                debugCompile[indexs++] = "AND";
            }
            push("bool");
        }

        public void exitOR(marParser.ORContext ctx) {
            String leftType = pop();
            String rightType = pop();
            if (!leftType.equals("bool") || !rightType.equals("bool")) {
                System.out.println("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() +
                        " error: operator or is invalid between " + rightType + " and " + leftType);
                this.countErros++;
            } else{
                bytecode[index++] = 20; // codigo para instrucao "or"
                debugCompile[indexs++] = "OR";
            }
            push("bool");
        }


        public byte[] getBytecode() {
            // Cria um novo array com o tamanho exato do bytecode
            byte[] result = new byte[index];
            System.arraycopy(bytecode, 0, result, 0, index);
            return result;
        }
        public String[] getDebugCompile() {
            return Arrays.copyOf(debugCompile, index);
        }
        public int getIndex() {
            return index;
        }
        public int getIndexss() {
            return indexss;
        }

        public int getCountErros() {
            return this.countErros;
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFileName = args.length > 0 ? args[0] : "../input/tes.mar";
        boolean debug = args.length > 1 && args[1].equals("-debug");
        InputStream is = System.in;
        if (inputFileName != null) {
            is = new FileInputStream(inputFileName);
        }
        try {
            CharStream input = CharStreams.fromStream(is);
            marLexer lexer = new marLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            marParser parser = new marParser(tokens);
            ParseTree tree = parser.prog();
            if (parser.getNumberOfSyntaxErrors() == 0 ) {
                ParseTreeWalker walker = new ParseTreeWalker();
                Translate eval = new Translate();
                walker.walk(eval, tree);
                int erros = eval.getCountErros();
                if (erros > 0) {
                    System.exit(0);
                }
                byte[] bytecode = eval.getBytecode();
                File inputFile = new File(inputFileName);
                String outputFileName = inputFile.getName().replace(".mar", ".marbc");
                String outputFolderPath = "../input/";
                File outputFile = new File(outputFolderPath + outputFileName);
                if (debug) {
                    String[] debugCompile = eval.getDebugCompile();
                    Object[] constant = eval.constant;
                    if (erros == 0) System.out.println("... no parsing errors\n... no type errors\n... code generation");
                    else System.out.println("\n" + erros + " parsing errors\n");
                    System.out.println("Constant pool:");
                    for (int i = 0; i < eval.getIndexss(); i++) {
                        if (debugCompile[i] != null) {
                            System.out.println(i + ": " + constant[i]);
                        }
                    }
                    System.out.println("Generated assembly code:");
                    int j = 0;
                    for (int i = 0; i < eval.getIndex(); i++) {
                        if (debugCompile[i] != null) {
                            if (debugCompile[i].equals("CONST")){
                                System.out.println(i + ": " + debugCompile[i] + " " + j);
                                j++;
                            }
                            else{
                                System.out.println(i + ": " + debugCompile[i]);
                            }
                        }
                    }
                    System.out.println("\nSaving bytecodes to " + outputFolderPath + outputFileName);
                }
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile));
                dos.write(bytecode);
            }
        } catch (Exception e) {
            System.err.println("Compilation failed: " + e.getMessage());
        }
    }

}