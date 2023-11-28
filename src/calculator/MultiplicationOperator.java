package calculator;

public class MultiplicationOperator extends Operator {
    String op;
    MultiplicationOperator(String op, State state){
        this.op = op;
        this.state = state;
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
                    state.setCurrentValue(Double.toString(add(Double.parseDouble(state.getCurrentValue()), state.getStack().pop())));
                    break;
                case "sub" :
                    state.setCurrentValue(Double.toString(sub(Double.parseDouble(state.getCurrentValue()), state.getStack().pop())));
                    break;
                case "mul" :
                    state.setCurrentValue(Double.toString(mul(Double.parseDouble(state.getCurrentValue()), state.getStack().pop())));
                    break;
                default :
                    break; //TODO QQCH?
            }
        }
        state.nextNumberPushesToStack = true;
    }
}