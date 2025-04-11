class ArrayQueue {
    int[] arr;
    int start, end, size, maxSize;

    public ArrayQueue() {
        start = -1;
        end = -1;
        size = 0;
        maxSize = 1000;
        arr = new int[maxSize];
    }

    public void push(int x) {
        if (this.isEmpty()) {
            start = 0;
        }
        arr[++end] = x;
        size++;
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        size--;
        return arr[start++];
    }

    public int peek() {
        return arr[start];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}


public class ImplementQueueUsingArrays {
    
}
