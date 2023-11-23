import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class factorialClient {
    public static void main(String[] args) {
        try {
            System.out.println("client started");
            Socket soc = new Socket("localhost", 9807);

            //By using Scanner
            Scanner UserInput = new Scanner(System.in);
            System.out.println("enter any number");
            Integer num = UserInput.nextInt();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(num);

            //reading for the server
            Scanner in = new Scanner(soc.getInputStream());
            System.out.println("the factorial is: " + in.nextInt());


        }catch (Exception e)
        {

            e.printStackTrace();
        }
    }
}

