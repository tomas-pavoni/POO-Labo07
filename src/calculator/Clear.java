package calculator;

public class Clear extends Operator{

    @Override
    void execute() {
        state.setError("");
        state.setCurrentValue(0);
        state.getStack().clear();
    }
}
