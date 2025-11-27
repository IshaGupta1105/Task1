import java.util.Stack;

public class CountEvenOddInStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Pushing elements into the stack
        stack.push(10);
        stack.push(21);
        stack.push(32);
        stack.push(43);
        stack.push(54);

        int evenCount = 0;
        int oddCount = 0;

        // Counting even and odd numbers
        for (int num : stack) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Stack elements: " + stack);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
