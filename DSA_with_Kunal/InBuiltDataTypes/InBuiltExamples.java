package DSA_with_Kunal.InBuiltDataTypes;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltExamples {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(44);
        // stack.push(12);
        // stack.push(13);
        // stack.push(90);
        // stack.push(1231);


        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(10);
        // queue.add(24);
        // queue.add(456);
        // queue.add(32);
        // queue.add(652);
        // queue.add(43);
        // queue.add(521);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(34);
        deque.addFirst(24);
        deque.add(2234);
        deque.addLast(534);
        deque.add(3774);
        deque.remove();


    }
}
