//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "Minijava.window"
 * nodeToken1 -> "("
 * exp -> Exp()
 * nodeToken2 -> ","
 * exp1 -> Exp()
 * nodeToken3 -> ","
 * exp2 -> Exp()
 * nodeToken4 -> ","
 * exp3 -> Exp()
 * nodeToken5 -> ")"
 * nodeToken6 -> ";"
 */
public @SuppressWarnings("all") class Window implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Exp exp;
   public NodeToken nodeToken2;
   public Exp exp1;
   public NodeToken nodeToken3;
   public Exp exp2;
   public NodeToken nodeToken4;
   public Exp exp3;
   public NodeToken nodeToken5;
   public NodeToken nodeToken6;

   public Window(NodeToken n0, NodeToken n1, Exp n2, NodeToken n3, Exp n4, NodeToken n5, Exp n6, NodeToken n7, Exp n8, NodeToken n9, NodeToken n10) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = n1;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      exp = n2;
      if ( exp != null ) exp.setParent(this);
      nodeToken2 = n3;
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      exp1 = n4;
      if ( exp1 != null ) exp1.setParent(this);
      nodeToken3 = n5;
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
      exp2 = n6;
      if ( exp2 != null ) exp2.setParent(this);
      nodeToken4 = n7;
      if ( nodeToken4 != null ) nodeToken4.setParent(this);
      exp3 = n8;
      if ( exp3 != null ) exp3.setParent(this);
      nodeToken5 = n9;
      if ( nodeToken5 != null ) nodeToken5.setParent(this);
      nodeToken6 = n10;
      if ( nodeToken6 != null ) nodeToken6.setParent(this);
   }

   public Window(Exp n0, Exp n1, Exp n2, Exp n3) {
      nodeToken = new NodeToken("Minijava.window");
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = new NodeToken("(");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      exp = n0;
      if ( exp != null ) exp.setParent(this);
      nodeToken2 = new NodeToken(",");
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      exp1 = n1;
      if ( exp1 != null ) exp1.setParent(this);
      nodeToken3 = new NodeToken(",");
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
      exp2 = n2;
      if ( exp2 != null ) exp2.setParent(this);
      nodeToken4 = new NodeToken(",");
      if ( nodeToken4 != null ) nodeToken4.setParent(this);
      exp3 = n3;
      if ( exp3 != null ) exp3.setParent(this);
      nodeToken5 = new NodeToken(")");
      if ( nodeToken5 != null ) nodeToken5.setParent(this);
      nodeToken6 = new NodeToken(";");
      if ( nodeToken6 != null ) nodeToken6.setParent(this);
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

