public class StackDemo {
    int top = -1;
    int size = 5;
    int[] stack = new int[size];

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}