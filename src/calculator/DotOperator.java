package calculator;

public class DotOperator extends Operator {
    DotOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.getStack().push(state.getStack().pop());
    }
}
