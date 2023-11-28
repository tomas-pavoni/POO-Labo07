package calculator;

public class DivXOperator extends Operator{
    DivXOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if (state.getStack().pop() == 0) {
            state.setError("Div 0");
        } else {
            state.getStack().push(1/(state.getStack().pop()));
        }
    }
}
