package calculator;

public class AddNumberOperator extends Operator {
    private final String number;

    AddNumberOperator(String number, State state) {
        this.number = number;
        this.state = state;
    }

    @Override
    void execute() {
        //state.setCurrentValue(Double.parseDouble(state.getCurrentValue() + number));
        if(!state.nextNumberPushesToStack){
            state.setCurrentValue(state.getCurrentValue() + number);
        }
        else {
            state.getStack().push(Double.parseDouble(state.getCurrentValue()));
            state.setCurrentValue(number);
            state.nextNumberPushesToStack = false;
        }
    }
}
