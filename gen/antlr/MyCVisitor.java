// Generated from /home/az/IdeaProjects/TYaP_ANTLR/src/main/java/antlr/MyC.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MyCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#one_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_desc(MyCParser.One_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#classStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStr(MyCParser.ClassStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#desc_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc_class(MyCParser.Desc_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(MyCParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MyCParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList1(MyCParser.List1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MyCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#size_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_array(MyCParser.Size_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#array_size_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_size_num(MyCParser.Array_size_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#may_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMay_assign(MyCParser.May_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#many_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMany_expression(MyCParser.Many_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#constStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStr(MyCParser.ConstStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#a1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA1(MyCParser.A1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#a2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA2(MyCParser.A2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#a3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA3(MyCParser.A3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#a4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA4(MyCParser.A4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#a5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA5(MyCParser.A5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#desc_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc_fun(MyCParser.Desc_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#content_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_desc(MyCParser.Content_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(MyCParser.DescContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(MyCParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MyCParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#id_intern_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_intern_elem(MyCParser.Id_intern_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#elem_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_array(MyCParser.Elem_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#ifGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfGrammar(MyCParser.IfGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCParser#may_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMay_else(MyCParser.May_elseContext ctx);
}