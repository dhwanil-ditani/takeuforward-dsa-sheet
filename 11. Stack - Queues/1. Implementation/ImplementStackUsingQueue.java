import java.util.LinkedList;
import java.util.Queue;

class QueueStack {
    Queue<Integer> q;

    public QueueStack() {
        this.q = new LinkedList<>();
    }

    public void push(int x) {
        int s = q.size();
        q.add(x);
        for (int i=0; i<s; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}


public class ImplementStackUsingQueue {
    
}
