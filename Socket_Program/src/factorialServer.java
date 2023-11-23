import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class factorialServer {
    static int Facto(int num)
        {
            int f=1;
            for(int i=1;i<=num;i++)
            {
                f=f*i;
            }
            return f;
        }
    public static void main(String[] args) {
        try {
            System.out.println("waiting for clients");
            ServerSocket ss = new ServerSocket(9807);
            Socket soc = ss.accept();
            System.out.println("connection established");

            //By using Scanner
            Scanner in = new Scanner(soc.getInputStream());
            int S_num = in.nextInt();
            int n = Facto(S_num);
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(n);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
