package calculator;

import static java.lang.Math.sqrt;

public class SqrtOperator extends Operator {
    @Override
    void execute() {
        state.getStack().push(sqrt(state.getStack().pop()));
    }
}
