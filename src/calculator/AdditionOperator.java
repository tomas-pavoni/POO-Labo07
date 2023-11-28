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
        if (!state.getStack().isEmpty() && state.getError().isEmpty()) {
            state.setCurrentValue(Double.toString(state.getStack().pop() +
                            Double.parseDouble(state.getCurrentValue())));
            state.nextNumberPushesToStack = true;

        }
    }
}