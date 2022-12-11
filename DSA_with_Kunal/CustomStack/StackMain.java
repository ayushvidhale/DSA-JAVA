package DSA_with_Kunal.CustomStack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        // DSA_with_Kunal.CustomStack.CustomStack stack = new DSA_with_Kunal.CustomStack.CustomStack(6);
        CustomStack stack = new CustomStack(6);

        stack.push(34);
        stack.push(44);
        stack.push(12);
        stack.push(13);
        stack.push(2313);
        stack.push(90);
        stack.push(1231);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
