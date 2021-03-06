//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * mainClass -> MainClass()
 * nodeListOptional -> ( ClassDecl() )*
 * nodeOptional -> ( DrawClass() )?
 * nodeListOptional1 -> ( ClassDecl() )*
 * nodeToken -> <EOF>
 */
public @SuppressWarnings("all") class Program implements Node {
   private Node parent;
   public MainClass mainClass;
   public NodeListOptional nodeListOptional;
   public NodeOptional nodeOptional;
   public NodeListOptional nodeListOptional1;
   public NodeToken nodeToken;

   public Program(MainClass n0, NodeListOptional n1, NodeOptional n2, NodeListOptional n3, NodeToken n4) {
      mainClass = n0;
      if ( mainClass != null ) mainClass.setParent(this);
      nodeListOptional = n1;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeOptional = n2;
      if ( nodeOptional != null ) nodeOptional.setParent(this);
      nodeListOptional1 = n3;
      if ( nodeListOptional1 != null ) nodeListOptional1.setParent(this);
      nodeToken = n4;
      if ( nodeToken != null ) nodeToken.setParent(this);
   }

   public Program(MainClass n0, NodeListOptional n1, NodeOptional n2, NodeListOptional n3) {
      mainClass = n0;
      if ( mainClass != null ) mainClass.setParent(this);
      nodeListOptional = n1;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeOptional = n2;
      if ( nodeOptional != null ) nodeOptional.setParent(this);
      nodeListOptional1 = n3;
      if ( nodeListOptional1 != null ) nodeListOptional1.setParent(this);
      nodeToken = new NodeToken("");
      if ( nodeToken != null ) nodeToken.setParent(this);
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

