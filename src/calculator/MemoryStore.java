package calculator;

public class MemoryStore extends Operator {
    MemoryStore(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setCurrentMemory(state.getCurrentValue());
    }
}
