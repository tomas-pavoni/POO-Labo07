//TemrinalCalculator is a class who uses only State and Operator classes that do the same as JCalculator but in terminal
// Here is an example of how to use it:
//java Calculator
//> 1 <enter>
//1.0
//> 2 <enter>
//2.0 1.0
//> 3 <enter>
//3.0 2.0 1.0
//> + <enter>
//5.0 1.0
//> sqrt <enter>
//2.23606797749979 1.0
//> + <enter>
//3.23606797749979
//> exit <enter>
package calculator;

import java.util.Scanner;
public class TerminalCalculator {
    public static void main(String ... args) {
        State state = new State();
        Operator operator;
        String input = "";
        while (!input.equals("exit")) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            try {
                state.setCurrentValue(input);
                operator = new AddNumberOperator(input, state);
            } catch (NumberFormatException nfe) {
                if (input.equals("+")) {
                    operator = new AdditionOperator(state);
                } else if (input.equals("-")) {
                    operator = new SubtractionOperator(state);
                } else if (input.equals("*")) {
                    operator = new MultiplicationOperator(state);
                } else if (input.equals("/")) {
                    operator = new DivisionOperator(state);
                } else if (input.equals("sqrt")) {
                    operator = new SqrtOperator(state);
                } else if (input.equals("x^2")) {
                    operator = new Power2Operator(state);
                } else if (input.equals("1/x")) {
                    operator = new DivXOperator(state);
                } else {
                    System.out.println("Invalid input try again :");
                    continue;
                }
            }
            operator.execute();
            state.getStack().push(Double.parseDouble(state.getStack().pop().toString()));
            System.out.println(state.getStack());
        }
    }
}






