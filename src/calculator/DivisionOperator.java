package calculator;

public class DivisionOperator extends Operator {
    public double operate(double operand1, double operand2) {
        return operand1 / operand2;
    } //Useless?

    DivisionOperator(State state){
        this.state = state;
    }

    @Override
    void execute() {
        if (!state.getStack().isEmpty()) {
            double dividend = state.getStack().pop();
            double divisor = Double.parseDouble(state.getCurrentValue());
            if (divisor != 0) {
                state.setCurrentValue(Double.toString(dividend / divisor));
            } else {
                // Handle division by zero
                // For now, we'll set the result to 0; you may want to handle this differently
                state.setCurrentValue("0");
            }
            state.nextNumberPushesToStack = true;
        }
    }
}