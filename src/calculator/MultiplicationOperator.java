package calculator;

public class MultiplicationOperator extends Operator {
    String op;
    MultiplicationOperator(String op){
        this.op = op;
    }
    public double mul(double operand1, double operand2) {
        return operand1 * operand2;
    }
    public double add(double operand1, double operand2) {
        return operand1 + operand2;
    }
    public double sub(double operand1, double operand2) {
        return operand1 - operand2;
    }

    @Override
    void execute() {
        if (!state.getStack().isEmpty()) {
            switch(op){
                case "add" :
                    state.setCurrentValue(add(state.getCurrentValue(), state.getStack().pop()));
                    break;
                case "sub" :
                    state.setCurrentValue(sub(state.getCurrentValue(), state.getStack().pop()));
                    break;
                case "mul" :
                    state.setCurrentValue(mul(state.getCurrentValue(), state.getStack().pop()));
                    break;
                default :
                    break; //TODO QQCH?
            }
        }
    }
}