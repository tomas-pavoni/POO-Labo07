package calculator;

public class MemoryStore extends Operator {
    MemoryStore(State state){
        this.state = state;
    }
    @Override
    void execute() {
        state.setCurrentMemory(Double.parseDouble(state.getCurrentValue()));
        state.isMemorySet = true;
    }
}
