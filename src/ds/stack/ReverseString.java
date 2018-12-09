package ds.stack;

public class ReverseString {
    private int maxSize;
    private char[] charArray;
    private int top;

    public ReverseString(int size) {
        this.maxSize = size;
        this.charArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char c) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            charArray[top] = c;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '0';
        } else {
            int temp = top;
            top--;
            return charArray[temp];
        }
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static String reverseString(String str) {
        int stackSize = str.length();
        ReverseString reverseString = new ReverseString(stackSize);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reverseString.push(ch);
        }

        String resultedSring = "";
        while (!reverseString.isEmpty()) {
            char ch = reverseString.pop();
            resultedSring = resultedSring + ch;
        }
        return resultedSring;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("sahil"));
    }
}


