import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleCalculatorServer {
//    static void calculator(int a, int b, String choice)
//    {
//
//
//    }
    public static void main(String[] args) {
        try {
            System.out.println("waiting for clients");
            ServerSocket ss = new ServerSocket(9808);
            Socket soc = ss.accept();
            System.out.println("connection established");


            //using scanner
            //for a
            Scanner in_a = new Scanner(soc.getInputStream());
            int a = in_a.nextInt();

            //for b
            Scanner in_b = new Scanner(soc.getInputStream());
            int b = in_b.nextInt();

            //for choice
            Scanner in_choice = new Scanner(soc.getInputStream());
            String choice = in_choice.nextLine();

            double c ;
            switch(choice)
            {
                case "add":
                    c = a + b;

                    break;

                case "sub":
                    c = a - b;
                    break;

                case "mul":
                    c = a * b;
                    break;

                case "div":
                    c = (double) a / b;
                    break;


                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(c);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
