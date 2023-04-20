// Generated from java-escape by ANTLR 4.11.1
package mar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link marParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface marVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(marParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#printExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExp(marParser.PrintExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARE}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARE(marParser.PAREContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(marParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(marParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUM(marParser.NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNAR}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNAR(marParser.UNARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMINUS(marParser.MINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NIL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIL(marParser.NILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMP(marParser.COMPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOL(marParser.BOOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(marParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVMULT}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVMULT(marParser.DIVMULTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code REL}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitREL(marParser.RELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link marParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING(marParser.STRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(marParser.NumberContext ctx);
}