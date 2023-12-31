package calculator;

public class AddNumberOperator extends Operator {
    private final String number;

    AddNumberOperator(String number, State state) {
        this.number = number;
        this.state = state;
    }

    @Override
    void execute() {
        if(state.getError().isEmpty()){
            if(!state.nextNumberPushesToStack){
                state.setCurrentValue(state.getCurrentValue() + number);
                if(Double.parseDouble(state.getCurrentValue()) > 9999999 ||
                        Double.parseDouble(state.getCurrentValue()) < -9999999){
                    state.setError("Nombre trop grand");
                }
            }
            else {
                state.getStack().push(Double.parseDouble(state.getCurrentValue()));
                state.setCurrentValue(number);
                state.nextNumberPushesToStack = false;
            }
        }
    }
}
