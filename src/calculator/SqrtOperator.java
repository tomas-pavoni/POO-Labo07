package calculator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SqrtOperator extends Operator {
    SqrtOperator(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if(!state.getCurrentValue().isEmpty() && state.getError().isEmpty()){
            if(Double.parseDouble(state.getCurrentValue()) < 0){
                state.setError("racine de nombre négatif");
            }
            else{
                state.setCurrentValue(String.valueOf(sqrt(Double.parseDouble(state.getCurrentValue()))));
                state.nextNumberPushesToStack = true;
            }
        }
    }
}