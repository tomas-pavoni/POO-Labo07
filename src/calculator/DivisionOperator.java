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
        //TODO OR SIMPLY CALL DIVIDE IN STATE??
        if (!state.getStack().isEmpty()) {
            double divisor = state.getStack().pop();
            if (divisor != 0) {
                state.setCurrentValue(state.getCurrentValue() / divisor);
            } else {
                // Handle division by zero
                // For now, we'll set the result to 0; you may want to handle this differently
                state.setCurrentValue(0);
            }
        }
    }
}