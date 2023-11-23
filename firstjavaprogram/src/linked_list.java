import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> S = new LinkedList<>();
        S.add(0,"apple");
        S.addFirst("hello");
        S.addLast("banana");
        S.add("hi");

        System.out.println(S);
    }
}
