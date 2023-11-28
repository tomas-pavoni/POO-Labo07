package calculator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Power2Operator extends Operator {
    Power2Operator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setCurrentValue(String.valueOf(pow(Double.parseDouble(state.getCurrentValue()), 2)));
        state.nextNumberPushesToStack = true;
    }
}
