import java.util.Scanner;
public class UserInput {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number");;

        int num = obj.nextInt();
        System.out.println("the entered number is:" + num);

        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter the string");;

        String str = obj1.nextLine();
        System.out.println("the entered string is:" + str);
    }
}
