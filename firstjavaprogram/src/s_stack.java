import java.util.Stack;
public class s_stack {
    public static void main(String[] args) {
        Stack<Integer> S1 =new Stack<>();
        S1.push(23);
        S1.push(3);
        S1.push(3);
        S1.push(43);
        S1.push(5);
        while(!S1.isEmpty())
        {
            int element = S1.pop();
            System.out.println("popped: " + element);
        }

    }
}
