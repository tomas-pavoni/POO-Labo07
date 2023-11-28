package calculator;

public class SubtractionOperator extends Operator {
    public double operate(double operand1, double operand2) {
        return operand1 - operand2;
    }
    SubtractionOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if (!state.getStack().isEmpty()) {
            state.setCurrentValue(Double.toString(state.getStack().pop() -
                    Double.parseDouble(state.getCurrentValue())));
        }
        state.nextNumberPushesToStack = true;
    }
}