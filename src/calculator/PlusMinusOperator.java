package calculator;

public class PlusMinusOperator extends Operator {
    PlusMinusOperator(State state) {
        this.state = state;
    }
    @Override
    void execute() {
        state.getStack().push((-1) * (state.getStack().pop()));
    }
}
