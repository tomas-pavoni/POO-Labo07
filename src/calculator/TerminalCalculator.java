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
        Operator operator = null;
        String input = "";
        while (!input.equals("exit")) {
            // Create the console object
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }
            try {;
                state.getStack().push(Double.parseDouble(input));
                state.setCurrentValue(input);
            } catch (NumberFormatException nfe) {
                if (input.equals("+")) {
                    operator = new MultiplicationOperator("+", state);
                } else if (input.equals("-")) {
                    operator = new MultiplicationOperator("-", state);
                } else if (input.equals("*")) {
                    operator = new MultiplicationOperator("*", state);
                } else if (input.equals("/")) {
                    operator = new DivisionOperator(state);
                } else if (input.equals("sqrt")) {
                    operator = new SqrtOperator(state);
                } else if (input.equals("pow2")) {
                    operator = new Power2Operator(state);
                } else if (input.equals("divx")) {
                    operator = new DivXOperator(state);
                } else if (input.equals("MR")) {
                    operator = new MemoryRecall(state);
                } else if (input.equals("MS")) {
                    operator = new MemoryStore(state);
                } else if (input.equals("C")) {
                    operator = new Clear(state);
                } else if (input.equals("CE")) {
                    operator = new ClearError(state);
                } else if (input.equals("back")) {
                    operator = new Backspace(state);
                } else if (input.equals("+/-")) {
                    operator = new PlusMinusOperator(state);
                } else if (input.equals("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
                operator.execute();
            }
            System.out.println(state.getStack());
        }
    }
}






