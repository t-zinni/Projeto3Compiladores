// Generated from java-escape by ANTLR 4.11.1
package mar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link marParser}.
 */
public interface marListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(marParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(marParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#printExp}.
	 * @param ctx the parse tree
	 */
	void enterPrintExp(marParser.PrintExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#printExp}.
	 * @param ctx the parse tree
	 */
	void exitPrintExp(marParser.PrintExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARE}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPARE(marParser.PAREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARE}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPARE(marParser.PAREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterADD(marParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitADD(marParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOR(marParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOR(marParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNUM(marParser.NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNUM(marParser.NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNAR}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUNAR(marParser.UNARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNAR}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUNAR(marParser.UNARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMINUS(marParser.MINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMINUS(marParser.MINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NIL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNIL(marParser.NILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NIL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNIL(marParser.NILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCOMP(marParser.COMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCOMP(marParser.COMPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBOOL(marParser.BOOLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBOOL(marParser.BOOLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAND(marParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAND(marParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVMULT}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDIVMULT(marParser.DIVMULTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVMULT}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDIVMULT(marParser.DIVMULTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code REL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterREL(marParser.RELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code REL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitREL(marParser.RELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSTRING(marParser.STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSTRING(marParser.STRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(marParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(marParser.NumberContext ctx);
}