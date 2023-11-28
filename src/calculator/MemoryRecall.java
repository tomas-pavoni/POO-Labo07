package calculator;

public class MemoryRecall extends Operator{
    MemoryRecall(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if(state.isMemorySet){
            state.setCurrentValue(Double.toString(state.getCurrentMemory()));
        }
    }
}
