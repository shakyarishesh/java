import java.sql.*;
import java.util.Scanner;


public class test {
    public static void main(String[] args)
    {
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the id: ");
            int id= scanner.nextInt();

            System.out.println("enter the name of the student");
            String name = scanner.nextLine();

            String district="kathmandu";

            System.out.println("enter your age: ");
            int age = scanner.nextInt();

            String url = "jdbc:mysql://localhost:330/";
            String db = "exam";
            String username = "root";
            String pw = "";

            conn = DriverManager.getConnection(url+db,username,pw);
            String query = "INSERT into Student(id, name, district, age) VALUES (?,?,?,?)";
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, id);
            pstm.setString(2, name);
            pstm.setString(3, district);
            pstm.setInt(4, age);
            pstm.execute();



        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                pstm.close();
            } catch (SQLException e) {
                System.out.println("error closing resources: "+e.getMessage());
            }

        }
    }
}
