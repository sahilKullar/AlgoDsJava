package ds.stack;

public class App {

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(100);
        stack.push(50);
        stack.push(30);
        stack.push(20);
        System.out.println(stack.toString());
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());
        System.out.println(stack.pop());
    }
}
