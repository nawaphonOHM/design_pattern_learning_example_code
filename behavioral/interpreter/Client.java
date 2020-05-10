package behavioral.interpreter;

import behavioral.interpreter.abstract_expression.Expression;
import behavioral.interpreter.non_terminal_expression.AndExpression;
import behavioral.interpreter.non_terminal_expression.OrExpression;
import behavioral.interpreter.terminal_expression.TerminalExpression;

public class Client {
    public static void main(String[] args){
        final Expression person1 = new TerminalExpression("Kushagra");
        final Expression person2 = new TerminalExpression("Lokesh");
        final Expression isSingle = new OrExpression(person1, person2);

        final Expression vikram = new TerminalExpression("Vikram");
        final Expression committed = new TerminalExpression("Committed");
        final Expression isCommited = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpreter("Kushagra"));
        System.out.println(isSingle.interpreter("Lokesh"));
        System.out.println(isSingle.interpreter("Achint"));

        System.out.println(isCommited.interpreter("Committed, Vikram"));
        System.out.println(isCommited.interpreter("Single, Vikram"));
    }
}