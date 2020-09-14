package app.patterns.behavioral.interpreter;

public class InterpreterMain {

  public static void main(String[] args) {

    Expression isJavaDeveloper = getJavaExpression();
    Expression isJavaEEDeveloper = getJavaEEExpression();

    System.out.println(isJavaDeveloper.interpret("Java Core"));
    System.out.println(isJavaEEDeveloper.interpret("Java Spring"));

  }

  public static Expression getJavaExpression(){
    Expression java = new TerminalExpression("Java");
    Expression javaCore = new TerminalExpression("Java Core");

    return new OrExpression(java,javaCore);
  }
  public static Expression getJavaEEExpression(){
    Expression java = new TerminalExpression("Java");
    Expression spring = new TerminalExpression("Spring");

    return new AndExpression(java,spring);
  }
}
