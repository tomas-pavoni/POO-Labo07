package calculator;

public class MemoryRecall extends Operator{

    @Override
    void execute() {
        state.setCurrentValue(state.getCurrentMemory());
    }
}
