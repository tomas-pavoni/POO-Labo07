package calculator;

public class Clear extends Operator{
    Clear(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setError("");
        state.setCurrentValue("");
        state.getStack().clear();
    }
}
