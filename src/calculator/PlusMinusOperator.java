package calculator;

public class PlusMinusOperator extends Operator {
    PlusMinusOperator(State state) {
        this.state = state;
    }
    @Override
    void execute() {
        state.setCurrentValue(Double.toString(Double.parseDouble(state.getCurrentValue()) * (-1)));
    }
}
