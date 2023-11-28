package calculator;

import util.Stack;

public class State {
    private String currentValue;
    private String error = "";
    private double currentMemory;
    public boolean isMemorySet;
    public boolean nextNumberPushesToStack;
    private Stack<Double> stack;

    public State() {
        this.currentValue = "";
        this.stack = new Stack<>();
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

/*    public void add() {
        if (!stack.isEmpty()) {
            currentValue += stack.pop();
        }
    }

    public void subtract() {
        if (!stack.isEmpty()) {
            currentValue -= stack.pop();
        }
    }

    public void multiply() {
        if (!stack.isEmpty()) {
            currentValue *= stack.pop();
        }
    }

    public void divide() {
        if (!stack.isEmpty()) {
            double divisor = stack.pop();
            if (divisor != 0) {
                currentValue /= divisor;
            } else {
                // Handle division by zero
                // For now, we'll set the result to 0; you may want to handle this differently
                currentValue = 0;
            }
        }
    }*/
    // Add more operations as needed
}

