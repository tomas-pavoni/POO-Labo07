package util;

public class Stack<T> {

    private LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    public void push(T element) {
        linkedList.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop from an empty stack.");
        }
        T toPop = linkedList.get(0);
        linkedList.remove(toPop);
        return toPop;
    }

    public T getTopElement() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek into an empty stack.");
        }
        return linkedList.get(linkedList.size() - 1);
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    public int size() {
        return linkedList.size();
    }

    public void clear() {
        linkedList.clear();
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < linkedList.size(); i++) {
            result.append(linkedList.get(i));
            if (i < linkedList.size() - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public Object[] toArray() {
        Object[] reversedArray = new Object[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            reversedArray[i] = linkedList.get(i);
        }
        return reversedArray;
    }



    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Original Stack: " + stack.toString());

            Object[] reversedArray = stack.toArray();

            System.out.println("Reversed Array: " + arrayToString(reversedArray));
        }

        private static String arrayToString(Object[] array) {
            StringBuilder result = new StringBuilder("[");
            for (int i = 0; i < array.length; i++) {
                result.append(array[i]);
                if (i < array.length - 1) {
                    result.append(", ");
                }
            }
            result.append("]");
            return result.toString();
        }

}

