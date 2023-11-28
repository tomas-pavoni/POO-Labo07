package calculator;

public class DotOperator extends Operator {
    @Override
    void execute() {
        state.getStack().push(state.getStack().pop());
    }
}
