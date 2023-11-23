import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Collection;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> P = new PriorityQueue<>();
        P.add(20);
        P.add(4);
        P.add(8);
        P.add(6);
        P.add(5);
        P.add(7);

        while(!P.isEmpty())
        {
            System.out.print(P.poll());
            System.out.print(", ");
        }
        System.out.println("\n");

        PriorityQueue<String> P1 = new PriorityQueue<>(Collections.reverseOrder());
        //PriorityQueue<String> P1 = new PriorityQueue<>((s1,s2)-> s2.length() - s1.length());

        P1.add("apple");
        P1.add("apple3");
        P1.add("apple33");
        P1.add("appl");
        while(!P1.isEmpty())
        {
            System.out.println(P1.poll());
        }

    }
}
