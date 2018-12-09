package ds.stack;

import java.util.Arrays;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[size];
        this.top = -1;
    }

    public void push(long val) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            stackArray[top] = val;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int temp = top;
            top--;
            return stackArray[temp];
        }
    }

    public long peak() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}
