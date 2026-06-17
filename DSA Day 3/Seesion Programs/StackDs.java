import java.util.Stack;

public class StackDs{

    public static void main(String a[]){

        Stack<Integer> stack1 = new Stack<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        for(Integer s1:stack1){
            System.out.println(s1);
        }

        System.out.println(stack1.peek());
        stack1.pop();
        stack1.pop();
        
        System.out.println(stack1);

    }
}