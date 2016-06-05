//
// Generated by JTB 1.3.2
//

package mini.visitor;
import mini.syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public @SuppressWarnings("all") class GJNoArguDepthFirst<R> implements GJNoArguVisitor<R> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public R visit(NodeList n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n) {
      if ( n.present() )
         return n.node.accept(this);
      else
         return null;
   }

   public R visit(NodeSequence n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * mainClass -> MainClass()
    * nodeListOptional -> ( ClassDecl() )*
    * nodeOptional -> ( DrawClass() )?
    * nodeListOptional1 -> ( ClassDecl() )*
    * nodeToken -> <EOF>
    */
   public R visit(Program n) {
      R _ret=null;
      n.mainClass.accept(this);
      n.nodeListOptional.accept(this);
      n.nodeOptional.accept(this);
      n.nodeListOptional1.accept(this);
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "class"
    * identifier -> Identifier()
    * nodeToken1 -> "{"
    * nodeToken2 -> "public"
    * nodeToken3 -> "static"
    * nodeToken4 -> "void"
    * nodeToken5 -> "main"
    * nodeToken6 -> "("
    * nodeToken7 -> "String"
    * nodeToken8 -> "["
    * nodeToken9 -> "]"
    * identifier1 -> Identifier()
    * nodeToken10 -> ")"
    * nodeToken11 -> "{"
    * ioStatement -> IoStatement()
    * nodeToken12 -> "}"
    * nodeToken13 -> "}"
    */
   public R visit(MainClass n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.identifier.accept(this);
      n.nodeToken1.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      n.nodeToken4.accept(this);
      n.nodeToken5.accept(this);
      n.nodeToken6.accept(this);
      n.nodeToken7.accept(this);
      n.nodeToken8.accept(this);
      n.nodeToken9.accept(this);
      n.identifier1.accept(this);
      n.nodeToken10.accept(this);
      n.nodeToken11.accept(this);
      n.ioStatement.accept(this);
      n.nodeToken12.accept(this);
      n.nodeToken13.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "class"
    * identifier -> Identifier()
    * nodeToken1 -> "extends"
    * nodeToken2 -> "MiniDraw"
    * nodeToken3 -> "{"
    * nodeListOptional -> ( VarDecl() )*
    * nodeListOptional1 -> ( MethodDecl() )*
    * messageHandler -> MessageHandler()
    * nodeListOptional2 -> ( MethodDecl() )*
    * nodeToken4 -> "}"
    */
   public R visit(DrawClass n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.identifier.accept(this);
      n.nodeToken1.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      n.nodeListOptional.accept(this);
      n.nodeListOptional1.accept(this);
      n.messageHandler.accept(this);
      n.nodeListOptional2.accept(this);
      n.nodeToken4.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "public"
    * nodeToken1 -> "final"
    * nodeToken2 -> "int"
    * nodeToken3 -> "MessageHandler"
    * nodeToken4 -> "("
    * arrayType -> ArrayType()
    * identifier -> Identifier()
    * nodeToken5 -> ","
    * integerType -> IntegerType()
    * identifier1 -> Identifier()
    * nodeToken6 -> ")"
    * nodeToken7 -> "{"
    * nodeListOptional -> ( VarDecl() )*
    * nodeListOptional1 -> ( Statement() )*
    * nodeToken8 -> "return"
    * exp -> Exp()
    * nodeToken9 -> ";"
    * nodeToken10 -> "}"
    */
   public R visit(MessageHandler n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      n.nodeToken4.accept(this);
      n.arrayType.accept(this);
      n.identifier.accept(this);
      n.nodeToken5.accept(this);
      n.integerType.accept(this);
      n.identifier1.accept(this);
      n.nodeToken6.accept(this);
      n.nodeToken7.accept(this);
      n.nodeListOptional.accept(this);
      n.nodeListOptional1.accept(this);
      n.nodeToken8.accept(this);
      n.exp.accept(this);
      n.nodeToken9.accept(this);
      n.nodeToken10.accept(this);
      return _ret;
   }

   /**
    * nodeChoice -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public R visit(ClassDecl n) {
      R _ret=null;
      n.nodeChoice.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "class"
    * identifier -> Identifier()
    * nodeToken1 -> "{"
    * nodeListOptional -> ( VarDecl() )*
    * nodeListOptional1 -> ( MethodDecl() )*
    * nodeToken2 -> "}"
    */
   public R visit(ClassDeclaration n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.identifier.accept(this);
      n.nodeToken1.accept(this);
      n.nodeListOptional.accept(this);
      n.nodeListOptional1.accept(this);
      n.nodeToken2.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "class"
    * identifier -> Identifier()
    * nodeToken1 -> "extends"
    * identifier1 -> Identifier()
    * nodeToken2 -> "{"
    * nodeListOptional -> ( VarDecl() )*
    * nodeListOptional1 -> ( MethodDecl() )*
    * nodeToken3 -> "}"
    */
   public R visit(ClassExtendsDeclaration n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.identifier.accept(this);
      n.nodeToken1.accept(this);
      n.identifier1.accept(this);
      n.nodeToken2.accept(this);
      n.nodeListOptional.accept(this);
      n.nodeListOptional1.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * type -> Type()
    * identifier -> Identifier()
    * nodeToken -> ";"
    */
   public R visit(VarDecl n) {
      R _ret=null;
      n.type.accept(this);
      n.identifier.accept(this);
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "public"
    * type -> Type()
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeOptional -> ( FormalList() )?
    * nodeToken2 -> ")"
    * nodeToken3 -> "{"
    * nodeListOptional -> ( VarDecl() )*
    * nodeListOptional1 -> ( Statement() )*
    * nodeToken4 -> "return"
    * exp -> Exp()
    * nodeToken5 -> ";"
    * nodeToken6 -> "}"
    */
   public R visit(MethodDecl n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.type.accept(this);
      n.identifier.accept(this);
      n.nodeToken1.accept(this);
      n.nodeOptional.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      n.nodeListOptional.accept(this);
      n.nodeListOptional1.accept(this);
      n.nodeToken4.accept(this);
      n.exp.accept(this);
      n.nodeToken5.accept(this);
      n.nodeToken6.accept(this);
      return _ret;
   }

   /**
    * formalParameter -> FormalParameter()
    * nodeListOptional -> ( FormalRest() )*
    */
   public R visit(FormalList n) {
      R _ret=null;
      n.formalParameter.accept(this);
      n.nodeListOptional.accept(this);
      return _ret;
   }

   /**
    * type -> Type()
    * identifier -> Identifier()
    */
   public R visit(FormalParameter n) {
      R _ret=null;
      n.type.accept(this);
      n.identifier.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> ","
    * formalParameter -> FormalParameter()
    */
   public R visit(FormalRest n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.formalParameter.accept(this);
      return _ret;
   }

   /**
    * nodeChoice -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public R visit(Type n) {
      R _ret=null;
      n.nodeChoice.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "int"
    * nodeToken1 -> "["
    * nodeToken2 -> "]"
    */
   public R visit(ArrayType n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.nodeToken2.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "boolean"
    */
   public R visit(BooleanType n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "int"
    */
   public R visit(IntegerType n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeChoice -> Block()
    *       | AssignmentStatement()
    *       | ArrayAssignmentStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | ExpStatement()
    *       | IoStatement()
    *       | GuiStatement()
    */
   public R visit(Statement n) {
      R _ret=null;
      n.nodeChoice.accept(this);
      return _ret;
   }

   /**
    * exp -> Exp()
    * nodeToken -> ";"
    */
   public R visit(ExpStatement n) {
      R _ret=null;
      n.exp.accept(this);
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "{"
    * nodeListOptional -> ( Statement() )*
    * nodeToken1 -> "}"
    */
   public R visit(Block n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeListOptional.accept(this);
      n.nodeToken1.accept(this);
      return _ret;
   }

   /**
    * identifier -> Identifier()
    * nodeToken -> "="
    * exp -> Exp()
    * nodeToken1 -> ";"
    */
   public R visit(AssignmentStatement n) {
      R _ret=null;
      n.identifier.accept(this);
      n.nodeToken.accept(this);
      n.exp.accept(this);
      n.nodeToken1.accept(this);
      return _ret;
   }

   /**
    * identifier -> Identifier()
    * nodeToken -> "["
    * exp -> Exp()
    * nodeToken1 -> "]"
    * nodeToken2 -> "="
    * exp1 -> Exp()
    * nodeToken3 -> ";"
    */
   public R visit(ArrayAssignmentStatement n) {
      R _ret=null;
      n.identifier.accept(this);
      n.nodeToken.accept(this);
      n.exp.accept(this);
      n.nodeToken1.accept(this);
      n.nodeToken2.accept(this);
      n.exp1.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "if"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * statement -> Statement()
    * nodeOptional -> [ ElseStatement() ]
    */
   public R visit(IfStatement n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.statement.accept(this);
      n.nodeOptional.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "else"
    * statement -> Statement()
    */
   public R visit(ElseStatement n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.statement.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "while"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * statement -> Statement()
    */
   public R visit(WhileStatement n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.statement.accept(this);
      return _ret;
   }

   /**
    * nodeChoice -> Println()
    *       | Print()
    *       | Read()
    */
   public R visit(IoStatement n) {
      R _ret=null;
      n.nodeChoice.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "System.out.println"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public R visit(Println n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.print"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public R visit(Print n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.scanf"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public R visit(Read n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.identifier.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * nodeChoice -> Window()
    *       | Wait()
    *       | GetKeyState()
    *       | Color()
    *       | Bitblt()
    *       | Present()
    *       | Srand()
    *       | Rand()
    */
   public R visit(GuiStatement n) {
      R _ret=null;
      n.nodeChoice.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.present"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ","
    * exp1 -> Exp()
    * nodeToken3 -> ")"
    * nodeToken4 -> ";"
    */
   public R visit(Present n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.exp1.accept(this);
      n.nodeToken3.accept(this);
      n.nodeToken4.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.srand"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public R visit(Srand n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.rand"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public R visit(Rand n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.identifier.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
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
   public R visit(Window n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.exp1.accept(this);
      n.nodeToken3.accept(this);
      n.exp2.accept(this);
      n.nodeToken4.accept(this);
      n.exp3.accept(this);
      n.nodeToken5.accept(this);
      n.nodeToken6.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.wait"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public R visit(Wait n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.getkey"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ","
    * identifier -> Identifier()
    * nodeToken3 -> ")"
    * nodeToken4 -> ";"
    */
   public R visit(GetKeyState n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.identifier.accept(this);
      n.nodeToken3.accept(this);
      n.nodeToken4.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.color"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ","
    * exp1 -> Exp()
    * nodeToken3 -> ","
    * exp2 -> Exp()
    * nodeToken4 -> ","
    * exp3 -> Exp()
    * nodeToken5 -> ","
    * identifier -> Identifier()
    * nodeToken6 -> ")"
    * nodeToken7 -> ";"
    */
   public R visit(Color n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.exp1.accept(this);
      n.nodeToken3.accept(this);
      n.exp2.accept(this);
      n.nodeToken4.accept(this);
      n.exp3.accept(this);
      n.nodeToken5.accept(this);
      n.identifier.accept(this);
      n.nodeToken6.accept(this);
      n.nodeToken7.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "Minijava.bitblt"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ","
    * exp1 -> Exp()
    * nodeToken3 -> ","
    * exp2 -> Exp()
    * nodeToken4 -> ","
    * exp3 -> Exp()
    * nodeToken5 -> ","
    * exp4 -> Exp()
    * nodeToken6 -> ")"
    * nodeToken7 -> ";"
    */
   public R visit(Bitblt n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.exp.accept(this);
      n.nodeToken2.accept(this);
      n.exp1.accept(this);
      n.nodeToken3.accept(this);
      n.exp2.accept(this);
      n.nodeToken4.accept(this);
      n.exp3.accept(this);
      n.nodeToken5.accept(this);
      n.exp4.accept(this);
      n.nodeToken6.accept(this);
      n.nodeToken7.accept(this);
      return _ret;
   }

   /**
    * nodeChoice -> AndExpression()
    *       | OrExpression()
    *       | CompareExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | DivExpression()
    *       | ModExpression()
    *       | CompareBigExpression()
    *       | CompareEquExpression()
    *       | CompareNotEquExpression()
    *       | CompareBigEquExpression()
    *       | CompareSmallEquExpression()
    *       | ArrayLookup()
    *       | ArrayLength()
    *       | MessageSend()
    *       | PrimaryExpression()
    */
   public R visit(Exp n) {
      R _ret=null;
      n.nodeChoice.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "/"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(DivExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "%"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(ModExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> ">"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(CompareBigExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "=="
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(CompareEquExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "!="
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(CompareNotEquExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> ">="
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(CompareBigEquExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "<="
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(CompareSmallEquExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "||"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(OrExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "&&"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(AndExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "<"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(CompareExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "+"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(PlusExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "-"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(MinusExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "*"
    * primaryExpression1 -> PrimaryExpression()
    */
   public R visit(TimesExpression n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "["
    * primaryExpression1 -> PrimaryExpression()
    * nodeToken1 -> "]"
    */
   public R visit(ArrayLookup n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.primaryExpression1.accept(this);
      n.nodeToken1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "."
    * nodeToken1 -> "length"
    */
   public R visit(ArrayLength n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      return _ret;
   }

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "."
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeOptional -> ( ExpList() )?
    * nodeToken2 -> ")"
    */
   public R visit(MessageSend n) {
      R _ret=null;
      n.primaryExpression.accept(this);
      n.nodeToken.accept(this);
      n.identifier.accept(this);
      n.nodeToken1.accept(this);
      n.nodeOptional.accept(this);
      n.nodeToken2.accept(this);
      return _ret;
   }

   /**
    * exp -> Exp()
    * nodeListOptional -> ( ExpRest() )*
    */
   public R visit(ExpList n) {
      R _ret=null;
      n.exp.accept(this);
      n.nodeListOptional.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> ","
    * exp -> Exp()
    */
   public R visit(ExpRest n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.exp.accept(this);
      return _ret;
   }

   /**
    * nodeChoice -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ThisExpression()
    *       | ArrayAllocationExpression()
    *       | AllocationExpression()
    *       | NotExpression()
    *       | BracketExpression()
    *       | CharLiteral()
    */
   public R visit(PrimaryExpression n) {
      R _ret=null;
      n.nodeChoice.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> <CHAR_LITERAL>
    */
   public R visit(CharLiteral n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "true"
    */
   public R visit(TrueLiteral n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "false"
    */
   public R visit(FalseLiteral n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> <IDENTIFIER>
    */
   public R visit(Identifier n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "this"
    */
   public R visit(ThisExpression n) {
      R _ret=null;
      n.nodeToken.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "new"
    * nodeToken1 -> "int"
    * nodeToken2 -> "["
    * exp -> Exp()
    * nodeToken3 -> "]"
    */
   public R visit(ArrayAllocationExpression n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.nodeToken1.accept(this);
      n.nodeToken2.accept(this);
      n.exp.accept(this);
      n.nodeToken3.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "new"
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeToken2 -> ")"
    */
   public R visit(AllocationExpression n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.identifier.accept(this);
      n.nodeToken1.accept(this);
      n.nodeToken2.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "!"
    * exp -> Exp()
    */
   public R visit(NotExpression n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.exp.accept(this);
      return _ret;
   }

   /**
    * nodeToken -> "("
    * exp -> Exp()
    * nodeToken1 -> ")"
    */
   public R visit(BracketExpression n) {
      R _ret=null;
      n.nodeToken.accept(this);
      n.exp.accept(this);
      n.nodeToken1.accept(this);
      return _ret;
   }

}
