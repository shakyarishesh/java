import java.util.*;
public class iterator_demo {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        //getting iterator from arraylist to traverse elements
        Iterator<Integer> i = a1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
