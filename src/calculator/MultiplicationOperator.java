package calculator;

public class MultiplicationOperator extends Operator {
    MultiplicationOperator(State state){
        this.state = state;
    }

    @Override
    void execute() {
        if (!state.getStack().isEmpty()) {
            state.setCurrentValue(Double.toString((Double.parseDouble(state.getCurrentValue())
                    * state.getStack().pop())));
        }
        state.nextNumberPushesToStack = true;
    }
}