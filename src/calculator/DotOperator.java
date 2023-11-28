package calculator;

public class DotOperator extends Operator {
    DotOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if (!state.getCurrentValue().contains(".")) {
            state.setCurrentValue(state.getCurrentValue() + ".");
        }
    }
}
