package calculator;

public class AddNumberOperator extends Operator {
    private final int number;

    AddNumberOperator(int number, State state) {
        this.number = number;
        this.state = state;
    }

    @Override
    void execute() {
        //state.setCurrentValue(Double.parseDouble(state.getCurrentValue() + number));
        state.setCurrentValue(state.getCurrentValue()*10 + number);
    }
}
