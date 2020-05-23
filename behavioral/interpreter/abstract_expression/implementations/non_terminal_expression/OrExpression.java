package behavioral.interpreter.abstract_expression.implementations.non_terminal_expression;

import behavioral.interpreter.abstract_expression.Expression;

public class OrExpression implements Expression {
    final Expression expr1;
    final Expression expr2;

    public OrExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String context) {
        return expr1.interpreter(context) || expr2.interpreter(context);
    }
    
}