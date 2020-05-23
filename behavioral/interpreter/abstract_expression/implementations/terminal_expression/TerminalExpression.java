package behavioral.interpreter.abstract_expression.implementations.terminal_expression;

import behavioral.interpreter.abstract_expression.Expression;

public class TerminalExpression implements Expression{
    final String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        return context.contains(data);
    }
    
}