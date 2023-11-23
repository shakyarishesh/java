import com.sun.jdi.InconsistentDebugInfoException;

import java.util.Random;
import java.util.Scanner;
public class testrps {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt();
       // System.out.println("random number is: " + randomNumber);

        int minRange=1;
        int maxRange=3;
        int randomInrange = random.nextInt(maxRange - minRange +1) + minRange ;
       // System.out.println(randomInrange);
        //1=a=scissor , 2=b=paper , 3=c=rock
        Scanner scan = new Scanner(System.in);
        System.out.println("choose a for scissor ,b for paper and c for rock");
        char alpha = scan.next().charAt(0);
        switch (alpha)
        {
            case 'a':
                if(1>2 && 2>3 && 3>1)
                {
                    System.out.println("");
                }

        }


    }

}
