import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleCalculatorClient {
    public static void main(String[] args) {
        try {
            System.out.println("client started");
            Socket soc = new Socket("localhost", 9808);

            //for one number
            BufferedReader UserInput1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter a: ");
            String  a1 = UserInput1.readLine();
            int a = Integer.parseInt(a1);

            //passing num a
            PrintWriter out_a = new PrintWriter(soc.getOutputStream(),true);
            out_a.println(a);

            //using scanner
//            Scanner ui = new Scanner(System.in);
//            System.out.println("enter a: ");
//            int a = ui.nextInt();

            //for second number
            BufferedReader UserInput2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter b: ");
            String  b1 = UserInput1.readLine();
            int b = Integer.parseInt(b1);

            //passing num b
            PrintWriter out_b = new PrintWriter(soc.getOutputStream(),true);
            out_b.println(b);

            //choice
            BufferedReader UserInput3 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter our choice \nadd for addition \nsub for substraction \nmul for multiplication \ndiv for dividion \n");
            String  choice = UserInput3.readLine();

            //passing choice
            PrintWriter out_choice = new PrintWriter(soc.getOutputStream(),true);
            out_choice.println(choice);

            //reading from server
            Scanner in = new Scanner(soc.getInputStream());
            System.out.println("your answer of " + choice +" is: " + in.nextDouble());



        }catch (Exception e)
        {

            e.printStackTrace();
        }
    }
}

