package calculator;

public class EnterOperator extends Operator {
    EnterOperator(State state) {
        this.state = state;
    }
    @Override
    void execute() {
        state.getStack().push(Double.parseDouble(state.getCurrentValue()));
        state.setCurrentValue("");
    }
}
