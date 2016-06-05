//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "{"
 * nodeListOptional -> ( Statement() )*
 * nodeToken1 -> "}"
 */
public @SuppressWarnings("all") class Block implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public NodeListOptional nodeListOptional;
   public NodeToken nodeToken1;

   public Block(NodeToken n0, NodeListOptional n1, NodeToken n2) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeListOptional = n1;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeToken1 = n2;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
   }

   public Block(NodeListOptional n0) {
      nodeToken = new NodeToken("{");
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeListOptional = n0;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeToken1 = new NodeToken("}");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
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

