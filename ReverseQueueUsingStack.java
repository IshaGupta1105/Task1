import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue 5 numbers
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Original Queue: " + queue);

        Stack<Integer> stack = new Stack<>();

        // Move elements from queue to stack (reverses order)
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Move elements back to queue (now reversed)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println("Reversed Queue: " + queue);
    }
}
