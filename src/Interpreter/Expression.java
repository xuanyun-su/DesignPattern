package Interpreter;

import java.util.Map;

// 抽象表达式
public interface Expression {
    int interpret(Map<String,Integer> context);
}
