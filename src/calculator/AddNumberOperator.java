package calculator;

public class AddNumberOperator extends Operator {
    private final double number;

    AddNumberOperator(double number, State state) {
        this.number = number;
    }

    @Override
    void execute() {
        state.getStack().push(number);
    }
}
