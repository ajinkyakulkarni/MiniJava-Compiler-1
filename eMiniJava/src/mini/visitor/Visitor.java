//
// Generated by JTB 1.3.2
//

package mini.visitor;
import mini.syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public @SuppressWarnings("all") interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

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
   public void visit(Program n);

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
   public void visit(MainClass n);

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
   public void visit(DrawClass n);

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
   public void visit(MessageHandler n);

   /**
    * nodeChoice -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public void visit(ClassDecl n);

   /**
    * nodeToken -> "class"
    * identifier -> Identifier()
    * nodeToken1 -> "{"
    * nodeListOptional -> ( VarDecl() )*
    * nodeListOptional1 -> ( MethodDecl() )*
    * nodeToken2 -> "}"
    */
   public void visit(ClassDeclaration n);

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
   public void visit(ClassExtendsDeclaration n);

   /**
    * type -> Type()
    * identifier -> Identifier()
    * nodeToken -> ";"
    */
   public void visit(VarDecl n);

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
   public void visit(MethodDecl n);

   /**
    * formalParameter -> FormalParameter()
    * nodeListOptional -> ( FormalRest() )*
    */
   public void visit(FormalList n);

   /**
    * type -> Type()
    * identifier -> Identifier()
    */
   public void visit(FormalParameter n);

   /**
    * nodeToken -> ","
    * formalParameter -> FormalParameter()
    */
   public void visit(FormalRest n);

   /**
    * nodeChoice -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public void visit(Type n);

   /**
    * nodeToken -> "int"
    * nodeToken1 -> "["
    * nodeToken2 -> "]"
    */
   public void visit(ArrayType n);

   /**
    * nodeToken -> "boolean"
    */
   public void visit(BooleanType n);

   /**
    * nodeToken -> "int"
    */
   public void visit(IntegerType n);

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
   public void visit(Statement n);

   /**
    * exp -> Exp()
    * nodeToken -> ";"
    */
   public void visit(ExpStatement n);

   /**
    * nodeToken -> "{"
    * nodeListOptional -> ( Statement() )*
    * nodeToken1 -> "}"
    */
   public void visit(Block n);

   /**
    * identifier -> Identifier()
    * nodeToken -> "="
    * exp -> Exp()
    * nodeToken1 -> ";"
    */
   public void visit(AssignmentStatement n);

   /**
    * identifier -> Identifier()
    * nodeToken -> "["
    * exp -> Exp()
    * nodeToken1 -> "]"
    * nodeToken2 -> "="
    * exp1 -> Exp()
    * nodeToken3 -> ";"
    */
   public void visit(ArrayAssignmentStatement n);

   /**
    * nodeToken -> "if"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * statement -> Statement()
    * nodeOptional -> [ ElseStatement() ]
    */
   public void visit(IfStatement n);

   /**
    * nodeToken -> "else"
    * statement -> Statement()
    */
   public void visit(ElseStatement n);

   /**
    * nodeToken -> "while"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * statement -> Statement()
    */
   public void visit(WhileStatement n);

   /**
    * nodeChoice -> Println()
    *       | Print()
    *       | Read()
    */
   public void visit(IoStatement n);

   /**
    * nodeToken -> "System.out.println"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(Println n);

   /**
    * nodeToken -> "Minijava.print"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(Print n);

   /**
    * nodeToken -> "Minijava.scanf"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(Read n);

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
   public void visit(GuiStatement n);

   /**
    * nodeToken -> "Minijava.present"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ","
    * exp1 -> Exp()
    * nodeToken3 -> ")"
    * nodeToken4 -> ";"
    */
   public void visit(Present n);

   /**
    * nodeToken -> "Minijava.srand"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(Srand n);

   /**
    * nodeToken -> "Minijava.rand"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(Rand n);

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
   public void visit(Window n);

   /**
    * nodeToken -> "Minijava.wait"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(Wait n);

   /**
    * nodeToken -> "Minijava.getkey"
    * nodeToken1 -> "("
    * exp -> Exp()
    * nodeToken2 -> ","
    * identifier -> Identifier()
    * nodeToken3 -> ")"
    * nodeToken4 -> ";"
    */
   public void visit(GetKeyState n);

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
   public void visit(Color n);

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
   public void visit(Bitblt n);

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
   public void visit(Exp n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "/"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(DivExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "%"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(ModExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> ">"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(CompareBigExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "=="
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(CompareEquExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "!="
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(CompareNotEquExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> ">="
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(CompareBigEquExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "<="
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(CompareSmallEquExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "||"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(OrExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "&&"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(AndExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "<"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(CompareExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "+"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(PlusExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "-"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(MinusExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "*"
    * primaryExpression1 -> PrimaryExpression()
    */
   public void visit(TimesExpression n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "["
    * primaryExpression1 -> PrimaryExpression()
    * nodeToken1 -> "]"
    */
   public void visit(ArrayLookup n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "."
    * nodeToken1 -> "length"
    */
   public void visit(ArrayLength n);

   /**
    * primaryExpression -> PrimaryExpression()
    * nodeToken -> "."
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeOptional -> ( ExpList() )?
    * nodeToken2 -> ")"
    */
   public void visit(MessageSend n);

   /**
    * exp -> Exp()
    * nodeListOptional -> ( ExpRest() )*
    */
   public void visit(ExpList n);

   /**
    * nodeToken -> ","
    * exp -> Exp()
    */
   public void visit(ExpRest n);

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
   public void visit(PrimaryExpression n);

   /**
    * nodeToken -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n);

   /**
    * nodeToken -> <CHAR_LITERAL>
    */
   public void visit(CharLiteral n);

   /**
    * nodeToken -> "true"
    */
   public void visit(TrueLiteral n);

   /**
    * nodeToken -> "false"
    */
   public void visit(FalseLiteral n);

   /**
    * nodeToken -> <IDENTIFIER>
    */
   public void visit(Identifier n);

   /**
    * nodeToken -> "this"
    */
   public void visit(ThisExpression n);

   /**
    * nodeToken -> "new"
    * nodeToken1 -> "int"
    * nodeToken2 -> "["
    * exp -> Exp()
    * nodeToken3 -> "]"
    */
   public void visit(ArrayAllocationExpression n);

   /**
    * nodeToken -> "new"
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeToken2 -> ")"
    */
   public void visit(AllocationExpression n);

   /**
    * nodeToken -> "!"
    * exp -> Exp()
    */
   public void visit(NotExpression n);

   /**
    * nodeToken -> "("
    * exp -> Exp()
    * nodeToken1 -> ")"
    */
   public void visit(BracketExpression n);

}

