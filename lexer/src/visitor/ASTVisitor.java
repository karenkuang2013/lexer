package visitor;

import ast.*;

/**
 *  ASTVisitor class is the root of the Visitor hierarchy for visiting
 *  various AST's; each visitor asks each node in the AST it is given
 *  to <i>accept</i> its visit; <br>
 *  each subclass <b>must</b> provide all of the visitors mentioned
 *  in this class; <br>
 *  after visiting a tree the visitor can return any Object of interest<br>
 *  e.g. when the constrainer visits an expression tree it will return
 *  a reference to the type tree representing the type of the expression
*/
public abstract class ASTVisitor {

    /**
     *
     * @param t
     */
    public void visitKids(AST t) {
        for (AST kid : t.getKids()) {
            kid.accept(this);
        }
        return;
    }

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitProgramTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitBlockTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitFunctionDeclTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitCallTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitDeclTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitIntTypeTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitBoolTypeTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitFormalsTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitActualArgsTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitIfTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitWhileTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitReturnTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitAssignTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitIntTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitIdTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitRelOpTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitAddOpTree(AST t);

    /**
     *
     * @param t
     * @return
     */
    public abstract Object visitMultOpTree(AST t);
}