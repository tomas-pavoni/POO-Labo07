package calculator;

public class DivisionOperator extends Operator {
    DivisionOperator(State state){
        this.state = state;
    }

    @Override
    void execute() {
        if (!state.getStack().isEmpty() && state.getError().isEmpty()) {
            double dividend = state.getStack().pop();
            double divisor = Double.parseDouble(state.getCurrentValue());
            if (divisor != 0) {
                state.setCurrentValue(Double.toString(dividend / divisor));
            } else {
                state.setError("Division par 0");
            }
            state.nextNumberPushesToStack = true;
        }
    }
}