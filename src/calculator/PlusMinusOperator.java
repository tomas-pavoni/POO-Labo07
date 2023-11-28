package calculator;

public class PlusMinusOperator extends Operator {
    @Override
    void execute() {
        state.getStack().push((-1) * (state.getStack().pop()));
    }
}
