import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;



public class marVM {

    public static class ByteCodeInterpreter {
        private byte[] bytecode;
        private Object[] stack;
        private int stackSize;

        private String[] debugCompile = new String[1000];
        private String[] StackDebugCompile = new String[1000];
        public Object[] constant =new Object[1000];

        private int indexs = 0;
        private int indexss = 0;
        private int indexsss = 0;
        private boolean debug;

        public ByteCodeInterpreter(byte[] bytecode) {
            this.bytecode = bytecode;
            this.stack = new Object[1000];
            this.stackSize = 0;
        }

        public Object[] getStack(){
            return stack;
        }

        public int getStackSize(){
            return stackSize;
        }
        public void setDebug(boolean debug) {
            this.debug = debug;
        }

        public void run() {
            int pos = 0;
            while (pos < bytecode.length) {
                byte opCode = bytecode[pos];
                pos++;

                switch (opCode) {
                    case 7: // double literal
                        double value = ByteBuffer.wrap(bytecode, pos, 8).order(ByteOrder.BIG_ENDIAN).getDouble();
                        pos += 8;
                        push(value);
                        debugCompile[indexs++] = "CONST";
                        constant[indexss++] = "<NUMBER:" + value + ">";
                        break;
                    case 0: // addition
                        Object op2 = pop();
                        Object op1 = pop();

                        if (op1 instanceof Number && op2 instanceof Number) {
                            binaryOp1(op1, op2, (a, b) -> a + b);
                            debugCompile[indexs++] = "ADD";
                        } else if (op1 instanceof String && op2 instanceof String) {
                            push((String) op1 + (String) op2);
                            debugCompile[indexs++] = "CONCAT";
                        }
                        break;
                    case 1: // subtraction
                        binaryOp((a, b) -> a - b);
                        debugCompile[indexs++] = "SUB";
                        break;
                    case 2: // multiplication
                        binaryOp((a, b) -> a * b);
                        debugCompile[indexs++] = "MULT";
                        break;
                    case 3: // division
                        binaryOp((a, b) -> a / b);
                        debugCompile[indexs++] = "DIV";
                        break;
                    case 4: // unary minus
                        push(-(double) pop());
                        debugCompile[indexs++] = "UMINUS";
                        break;
                    case 5: // print
                        Object val = pop();
                        if (val instanceof String && !val.equals("nil") && !val.equals("true") && !val.equals("false")) {
                            debugCompile[indexs++] = "PRINT_S";
                        } else if (val.equals("true") || val.equals("false")) {
                            debugCompile[indexs++] = "PRINT_B";
                        } else if (val == "nil") {
                            debugCompile[indexs++] = "PRINT_NIL";
                        } else {
                            debugCompile[indexs++] = "PRINT_N";
                        }
                        if (!debug) {
                            System.out.println(val);
                        }
                        break;
                    case 8: // string literal
                        int strLength = ByteBuffer.wrap(bytecode, pos, 4).order(ByteOrder.BIG_ENDIAN).getInt();
                        pos += 4;
                        byte[] strBytes = Arrays.copyOfRange(bytecode, pos, pos + strLength);
                        String strValue = new String(strBytes, StandardCharsets.UTF_8);
                        pos += strLength;
                        push(strValue);
                        debugCompile[indexs++] = "CONST";
                        constant[indexss++] = "<STRING:\"" + strValue + "\">";
                        break;
                    case 9: // not
                        Object x = pop();
                        if (x.equals("true")) {
                            push("false");
                        } else if (x.equals("false")) {
                            push("true");
                        } else if (x instanceof Double) {
                            push((double) x == 0.0 ? 1.0 : 0.0);
                        } else {
                            throw new RuntimeException("Invalid operand type for not: " + x.getClass().getName());
                        }
                        debugCompile[indexs++] = "NOT";
                        break;

                    case 10: // push true
                        push("true");
                        debugCompile[indexs++] = "TRUE";
                        break;
                    case 11: // push false
                        push("false");
                        debugCompile[indexs++] = "FALSE";
                        break;
                    case 12: // push nil
                        push("nil");
                        debugCompile[indexs++] = "NIL";
                        break;
                    case 13: // greater than
                        Object rightOperand = pop();
                        Object leftOperand = pop();
                        if ((double) leftOperand > (double) rightOperand){
                            push("true");
                        }
                        else
                            push("false");
                        debugCompile[indexs++] = "GT";
                        break;
                    case 14: // greater than or equal
                        double rightOp = (double) pop();
                        double leftOp = (double) pop();
                        push(leftOp >= rightOp ? "true": "false");
                        debugCompile[indexs++] = "GEQ";
                        break;
                    case 15: // less than
                        double right = (double) pop();
                        double left = (double) pop();
                        push(left < right ? "true": "false");
                        debugCompile[indexs++] = "LT";
                        break;
                    case 16: // less than or equal
                        double rightValue = (double) pop();
                        double leftValue =(double) pop();
                        push(leftValue <= rightValue ? "true": "false");
                        debugCompile[indexs++] = "LEQ";
                        break;
                    case 17: // equal
                        Object operand1 = pop();
                        Object operand2 = pop();
                        push(operand1.equals(operand2) ? "true" : "false");
                        if(operand1 instanceof String && !operand1.equals("nil") && !operand1.equals("true") && !operand1.equals("false")) {
                            debugCompile[indexs++] = "EQ_S";
                        }
                        else if(operand1.equals("true") || operand1.equals("false")) {
                            debugCompile[indexs++] = "EQ_B";
                        }
                        else if(operand1.equals("nil")) {
                            debugCompile[indexs++] = "EQ_NIL";
                        }
                        else {
                            debugCompile[indexs++] = "EQ_N";
                        }
                        break;
                    case 18: // not equal
                        Object operand3 = pop();
                        Object operand4 = pop();
                        push(!operand3.equals(operand4) ? "true": "false");
                        if(operand3 instanceof String && !operand3.equals("nil") && !operand3.equals("true") && !operand3.equals("false")) {
                            debugCompile[indexs++] = "NEQ_S";
                        }
                        else if(operand3 == "nil") {
                            debugCompile[indexs++] = "NEQ_NIL";
                        }
                        else if(operand3 == "true" || operand3 == "false") {
                            debugCompile[indexs++] = "NEQ_B";
                        }
                        else {
                            debugCompile[indexs++] = "NEQ_N";
                        }
                        break;
                    case 19: // and
                        Object right1 = pop();
                        Object left2 = pop();
                        push((left2.equals("true") && right1.equals("true")) ? "true" : "false");
                        debugCompile[indexs++] = "AND";
                        break;
                    case 20: // or
                        Object right2 = pop();
                        Object left1 = pop();
                        push((left1.equals("true") || right2.equals("true")) ? "true" : "false");
                        debugCompile[indexs++] = "OR";
                        break;
                    case 6: // exit
                        debugCompile[indexs++] = "HALT";
                        return;
                }
                if (debug) {
                    StackDebugCompile[indexsss++] = Arrays.toString(Arrays.copyOfRange(stack, 0, stackSize));
                }
            }
        }

        private void push(Object value) {
            stack[stackSize++] = value;
        }

        private Object pop() {
            return stack[--stackSize];
        }

        private void binaryOp1(Object op1, Object op2, DoubleBinaryOperator op) {
            double a = ((Number) op1).doubleValue();
            double b = ((Number) op2).doubleValue();
            push(op.applyAsDouble(a, b));
        }

        private void binaryOp(DoubleBinaryOperator op) {
            double b =  (double) pop();
            double a = (double) pop();
            push(op.applyAsDouble(a, b));
        }

        public String[] getDebugCompile() {
            return Arrays.copyOf(debugCompile, indexs);
        }

        public String[] getStackDebugCompile() {
            return Arrays.copyOf(StackDebugCompile, indexsss);
        }

        public int getIndex() {
            return indexs;
        }
        public int getIndexss() {
            return indexss;
        }
        public int getIndexsss() {
            return indexsss;
        }
    }

    public static void main(String[] args) {
        String inputFileName = "../input/tes.marbc"; // Nome do arquivo gerado pela outra main
        boolean debug = false;
        if (args.length > 0) inputFileName = args[0];
        if (args.length > 1 && args[1].equals("-debug")) debug = true;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFileName))) {
            byte[] bytes = dis.readAllBytes();
            ByteCodeInterpreter interpreter = new ByteCodeInterpreter(bytes);
            if (debug) {
                interpreter.setDebug(debug);
                interpreter.run();
                String [] stackDebug = interpreter.getStackDebugCompile();
                String[] debugCompile = interpreter.getDebugCompile();
                Object[] constant = interpreter.constant;
                System.out.println("Constant pool:");
                for (int i = 0; i < interpreter.getIndexss(); i++) {
                    if (debugCompile[i] != null) {
                        System.out.println(i + ": " + constant[i]);
                    }
                }
                System.out.println("Instructions");
                int j = 0;
                for (int i = 0; i < interpreter.getIndex(); i++) {
                    if (debugCompile[i] != null) {
                        if (debugCompile[i].equals("CONST")){
                            System.out.println(i + ": " + "Stack: " + debugCompile[i] + " " + j);
                            j++;
                        }
                        else{
                            System.out.println(i + ": " + "Stack: "  + debugCompile[i]);
                        }
                    }
                }
                System.out.println("Trace while running the code:");
                int i = 0;
                int k = i;
                for (i = 0; i < interpreter.getIndexsss(); i++) {
                    if (stackDebug[i] != null) {
                            if (debugCompile[i].equals("CONST")) {
                                System.out.println(debugCompile[i] + " " + k + " " + constant[k++] + " " + "Stack: "  + stackDebug[i]);
                            } else if (debugCompile[i].equals("PRINT_N")) {
                                System.out.println(debugCompile[i] + " " + stackDebug[i-1] + " " + "Stack: "  + stackDebug[i]);
                            } else if (debugCompile[i].equals("PRINT_NIL")) {
                                System.out.println(debugCompile[i] + " " + stackDebug[i-1] + " " + "Stack: " +  stackDebug[i]);
                            } else if (debugCompile[i].equals("PRINT_B")) {
                                System.out.println(debugCompile[i] + " " + stackDebug[i-1] + " " + "Stack: "  + stackDebug[i]);
                            } else if (debugCompile[i].equals("PRINT_S")) {
                                System.out.println(debugCompile[i] + " " + stackDebug[i-1] + " " + "Stack: " + stackDebug[i]);
                            } else
                                System.out.println(debugCompile[i] + " " + "Stack: " + stackDebug[i]);
                    }
                }
                return;
            }
            interpreter.setDebug(debug);
            interpreter.run();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
