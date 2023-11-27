package calculator;

public class ClearError extends Operator{

    @Override
    void execute() {
        state.setError("");
        state.setCurrentValue(0);
    }
}
