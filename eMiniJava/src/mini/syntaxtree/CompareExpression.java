//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * primaryExpression -> PrimaryExpression()
 * nodeToken -> "<"
 * primaryExpression1 -> PrimaryExpression()
 */
public @SuppressWarnings("all") class CompareExpression implements Node {
   private Node parent;
   public PrimaryExpression primaryExpression;
   public NodeToken nodeToken;
   public PrimaryExpression primaryExpression1;

   public CompareExpression(PrimaryExpression n0, NodeToken n1, PrimaryExpression n2) {
      primaryExpression = n0;
      if ( primaryExpression != null ) primaryExpression.setParent(this);
      nodeToken = n1;
      if ( nodeToken != null ) nodeToken.setParent(this);
      primaryExpression1 = n2;
      if ( primaryExpression1 != null ) primaryExpression1.setParent(this);
   }

   public CompareExpression(PrimaryExpression n0, PrimaryExpression n1) {
      primaryExpression = n0;
      if ( primaryExpression != null ) primaryExpression.setParent(this);
      nodeToken = new NodeToken("<");
      if ( nodeToken != null ) nodeToken.setParent(this);
      primaryExpression1 = n1;
      if ( primaryExpression1 != null ) primaryExpression1.setParent(this);
   }

   public void accept(mini.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(mini.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(mini.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(mini.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
   public void setParent(Node n) { parent = n; }
   public Node getParent()       { return parent; }
}

