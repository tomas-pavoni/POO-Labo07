package calculator;

public class DivXOperator extends Operator{
    DivXOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if (Double.parseDouble(state.getCurrentValue()) == 0) {
            state.setError("Div 0");
        } else {
            state.setCurrentValue(String.valueOf(1 / Double.parseDouble(state.getCurrentValue())));
        }
        state.nextNumberPushesToStack = true;
    }
}
