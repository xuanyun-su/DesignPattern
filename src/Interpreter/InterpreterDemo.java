package Interpreter;


 // 经常用在sql等
public class InterpreterDemo {
     public static void main(String[] args) {
         Expression expression = new PlusExpression(new NumberExpression((5)),new NumberExpression(3));
         int result = expression.interpret(null);
         System.out.println(result);
     }
}
