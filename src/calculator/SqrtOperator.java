package calculator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SqrtOperator extends Operator {
    SqrtOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setCurrentValue(String.valueOf(sqrt(Double.parseDouble(state.getCurrentValue()))));
        state.nextNumberPushesToStack = true;
    }
}