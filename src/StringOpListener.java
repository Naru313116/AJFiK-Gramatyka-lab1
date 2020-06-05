// Generated from StringOp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StringOpParser}.
 */
public interface StringOpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code operacja}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterOperacja(StringOpParser.OperacjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operacja}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitOperacja(StringOpParser.OperacjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code przesun}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterPrzesun(StringOpParser.PrzesunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code przesun}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitPrzesun(StringOpParser.PrzesunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wielkosc}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWielkosc(StringOpParser.WielkoscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wielkosc}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWielkosc(StringOpParser.WielkoscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyjmij}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyjmij(StringOpParser.WyjmijContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyjmij}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyjmij(StringOpParser.WyjmijContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ciag}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterCiag(StringOpParser.CiagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ciag}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitCiag(StringOpParser.CiagContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringOpParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(StringOpParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringOpParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(StringOpParser.ProgContext ctx);
}