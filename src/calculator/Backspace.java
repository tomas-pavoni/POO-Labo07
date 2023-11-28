package calculator;

import java.math.BigDecimal;

public class Backspace extends Operator{

    Backspace(State state){
        this.state = state;
    }
    @Override
    void execute() {
        String numberStr = state.getCurrentValue();

        if(!numberStr.isEmpty()){
            // Remove the last character (including the decimal point, if present)
            numberStr = numberStr.substring(0, numberStr.length() - 1);
            state.setCurrentValue(numberStr);
        }
    }
}