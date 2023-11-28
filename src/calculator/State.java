package calculator;

import util.Stack;

public class State {
    private String currentValue;
    private String error;
    private double currentMemory;
    public boolean isMemorySet;
    public boolean nextNumberPushesToStack;
    private Stack<Double> stack;

    public State() {
        currentValue = "";
        error = "";
        isMemorySet = false;
        nextNumberPushesToStack = false;
        stack = new Stack<>();
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public String getError(){
        return error;
    }

    public double getCurrentMemory(){
        return currentMemory;
    }

    public Stack<Double> getStack() {
        return stack;
    }

    public void setCurrentValue(String value) {
        this.currentValue = value;
    }

    public void setError(String error){
        this.error = error;
    }

    public void setCurrentMemory(double value){
        this.currentMemory = value;
    }

}

