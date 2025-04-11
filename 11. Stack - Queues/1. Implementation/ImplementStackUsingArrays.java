class ArrayStack {
    int[] arr;
    int capacity;
    int topIdx;

    public ArrayStack() {
        this(1000);
    }

    public ArrayStack(int size) {
        this.capacity = size;
        this.topIdx = -1;
        this.arr = new int[capacity];
    }

    public void push(int x) {
        if (topIdx >= capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        this.arr[++topIdx] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.arr[topIdx--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.arr[topIdx];
    }

    public boolean isEmpty() {
        return topIdx == -1;
    }
}


public class ImplementStackUsingArrays {

    
}