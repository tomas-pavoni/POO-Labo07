package calculator;

public class MemoryStore extends Operator {

    @Override
    void execute() {
        state.setCurrentMemory(state.getCurrentValue());
    }
}
