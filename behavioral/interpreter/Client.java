package behavioral.interpreter;

import behavioral.interpreter.abstract_expression.Expression;
import behavioral.interpreter.abstract_expression.implementations.non_terminal_expression.AndExpression;
import behavioral.interpreter.abstract_expression.implementations.non_terminal_expression.OrExpression;
import behavioral.interpreter.abstract_expression.implementations.terminal_expression.TerminalExpression;

public class Client {
    public static void main(String[] args){
        final Expression person1 = new TerminalExpression("Hello");
        final Expression person2 = new TerminalExpression("Test");
        final Expression hasEither = new OrExpression(person1, person2);

        System.out.println(hasEither.interpreter("xyz"));
        System.out.println(hasEither.interpreter("Hello"));
        System.out.println(hasEither.interpreter("Test"));
        System.out.println(hasEither.interpreter("Tes"));

        final Expression space = new TerminalExpression("");
        final Expression nul = new TerminalExpression("NULL");
        final Expression hasSubset = new AndExpression(space, nul);

        System.out.println(hasSubset.interpreter("NULL"));
        System.out.println(hasSubset.interpreter(""));
    }
}