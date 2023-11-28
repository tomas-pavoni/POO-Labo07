package calculator;

public class MemoryStore extends Operator {
    MemoryStore(State state){
        this.state = state;
    }
    @Override
    void execute() {
        if(state.getCurrentValue().isEmpty()){
            state.setCurrentMemory(0);
        }
        else{
            state.setCurrentMemory(Double.parseDouble(state.getCurrentValue()));
        }
        state.isMemorySet = true;
    }
}
