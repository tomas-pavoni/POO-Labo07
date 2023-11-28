package calculator;

import static java.lang.Math.pow;

public class Power2Operator extends Operator {
    Power2Operator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.getStack().push(pow(state.getStack().pop(), 2));
    }
}
