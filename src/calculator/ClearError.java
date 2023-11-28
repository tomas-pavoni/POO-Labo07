package calculator;

public class ClearError extends Operator{
    ClearError(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setError("");
        state.setCurrentValue("");
    }
}
