//import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("client started");
            Socket soc = new Socket("localhost", 9806);
            BufferedReader UserInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the string: ");
            String C_str = UserInput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(C_str);
            //reading form the server
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }catch (Exception e)
        {

            e.printStackTrace();
        }
    }
}
