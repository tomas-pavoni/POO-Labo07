package calculator;

public class SubtractionOperator extends Operator {
    SubtractionOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if (!state.getStack().isEmpty() && state.getError().isEmpty()) {
            state.setCurrentValue(Double.toString(state.getStack().pop() -
                    Double.parseDouble(state.getCurrentValue())));
            state.nextNumberPushesToStack = true;
        }
    }
}