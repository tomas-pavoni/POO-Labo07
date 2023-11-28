package calculator;

public class EnterOperator extends Operator {
    EnterOperator(State state) {
        this.state = state;
    }
    @Override
    void execute() {
        if(!state.getCurrentValue().isEmpty() && state.getError().isEmpty()){
            state.getStack().push(Double.parseDouble(state.getCurrentValue()));
            state.setCurrentValue("");
            state.nextNumberPushesToStack = false;
        }
    }
}
