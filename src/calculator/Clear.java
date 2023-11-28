package calculator;

public class Clear extends Operator{
    Clear(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setError("");
        state.setCurrentValue(0);
        state.getStack().clear();
    }
}
