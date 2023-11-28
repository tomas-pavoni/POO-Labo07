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
        ;
    }
}