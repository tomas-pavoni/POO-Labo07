package calculator;

public class MultiplicationOperator extends Operator {
    MultiplicationOperator(State state){
        this.state = state;
    }

    @Override
    void execute() {
        if (!state.getStack().isEmpty() && !state.getCurrentValue().isEmpty() && state.getError().isEmpty()) {
            state.setCurrentValue(Double.toString(state.getStack().pop() *
                    Double.parseDouble(state.getCurrentValue())));
            state.nextNumberPushesToStack = true;
        }
    }
}