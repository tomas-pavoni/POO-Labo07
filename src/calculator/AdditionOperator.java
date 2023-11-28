package calculator;

public class AdditionOperator extends Operator {
    public double operate(double operand1, double operand2) {
        return operand1 + operand2;
    }

    AdditionOperator(State state){
        this.state = state;
    }

    @Override
    void execute() {
        if (!state.getStack().isEmpty()) {
            state.setCurrentValue(Double.toString((Double.parseDouble(state.getCurrentValue())
                    + state.getStack().pop())));
        }
        state.nextNumberPushesToStack = true;
    }
}