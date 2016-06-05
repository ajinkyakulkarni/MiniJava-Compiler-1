//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * formalParameter -> FormalParameter()
 * nodeListOptional -> ( FormalRest() )*
 */
public @SuppressWarnings("all") class FormalList implements Node {
   private Node parent;
   public FormalParameter formalParameter;
   public NodeListOptional nodeListOptional;

   public FormalList(FormalParameter n0, NodeListOptional n1) {
      formalParameter = n0;
      if ( formalParameter != null ) formalParameter.setParent(this);
      nodeListOptional = n1;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
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
