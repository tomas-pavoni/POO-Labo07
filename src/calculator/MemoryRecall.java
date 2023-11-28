package calculator;

public class MemoryRecall extends Operator{
    MemoryRecall(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setCurrentValue(state.getCurrentMemory());
    }
}
