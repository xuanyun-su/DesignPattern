package Interpreter;

import java.util.Map;

// 非终结符表达式类
public class PlusExpression implements Expression {
    private Expression leftExpression,rightExpression;

    public PlusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return leftExpression.interpret(context) +rightExpression.interpret(context);
    }
}
