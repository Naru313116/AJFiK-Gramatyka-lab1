// Generated from StringOp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StringOpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StringOpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code operacja}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacja(StringOpParser.OperacjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code przesun}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzesun(StringOpParser.PrzesunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wielkosc}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWielkosc(StringOpParser.WielkoscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyjmij}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyjmij(StringOpParser.WyjmijContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ciag}
	 * labeled alternative in {@link StringOpParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiag(StringOpParser.CiagContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringOpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(StringOpParser.ProgContext ctx);
}