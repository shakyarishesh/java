import java.util.ArrayList;
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(5);
        arr2.add(23);
        arr2.add(2);
        arr2.add(22);

        arr.add(5);
        arr.add(50);
        arr.add(55);
        arr.add(56);
        arr.add(57);
        arr.addAll(arr2);
        arr.add(3 , 44);
        //checking if the elements exists or not
        System.out.println(arr.contains(60));
        System.out.println(arr.contains(57));
        System.out.println(arr.indexOf(57));
        arr.set(3,333);
        arr.remove(3);
        for (int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i));
            System.out.print(" ,");
        }
    }
}
