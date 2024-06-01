package package_Database;

import javax.sound.midi.Soundbank;
import java.sql.*;

public class student {

    public void createDatabase()
    {
        //conn establish
        //statement creation
        //query
        //close the database

        try {
            String url = "jdbc:mysql://localhost:3307/";
            String userName = "root";
            String password = "risheshmysql";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();
            String query = "create database javaFirstDatabase1";
            stm.execute(query);
            System.out.println("Connection successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void createTable()
    {
        try {
            String url = "jdbc:mysql://localhost:3307/"; //+javafirstdatabase
            String database = "javafirstdatabase";
            String userName = "root";
            String password = "risheshmysql";

            Connection conn = DriverManager.getConnection(url+database, userName, password);
            Statement stm = conn.createStatement();
            String query1 = "create table risheshTable(sid int(10), sname varchar(255))";
            stm.execute(query1);
            System.out.println("Table created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createData()
    {
        try {
        String url = "jdbc:mysql://localhost:3307/"; //+javafirstdatabase
        String database = "javafirstdatabase";
        String userName = "root";
        String password = "risheshmysql";

        Connection conn = DriverManager.getConnection(url+database, userName, password);
        String query1 = "INSERT INTO  risheshtable(sid, sname) VALUES (?,?)";
        PreparedStatement pstm = conn.prepareStatement(query1);

        pstm.setInt(1,26);
        pstm.setString(2,"Rishesh");
        pstm.execute();
        System.out.println("data inserted successfully\n\n");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    //read data
    public void readData()
    {
        try {
            String url = "jdbc:mysql://localhost:3307/"; //+javafirstdatabase
            String database = "javafirstdatabase";
            String userName = "root";
            String password = "risheshmysql";

            Connection conn = DriverManager.getConnection(url+database, userName, password);
            String query1 = "select * from risheshtable";
            Statement rstm = conn.createStatement();
            ResultSet rs = rstm.executeQuery(query1);
            while(rs.next())
            {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString(2));
            }

            System.out.println("data read successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void updateData()
    {
        try{
            String url = "jdbc:mysql://localhost:3307/";
            String database = "javafirstdatabase";
            String username = "root";
            String password = "risheshmysql";

            Connection conn = DriverManager.getConnection(url+database,username,password);
            String query = "UPDATE risheshtable set sname = ? where sid = ?";
            PreparedStatement ustm = conn.prepareStatement(query);

            ustm.setString(1,"bandana");
            ustm.setInt(2,5);

            ustm.execute();
            System.out.println("data updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //delete
    public void deleteData()
    {
        try{
            String url = "jdbc:mysql://localhost:3307/";
            String database = "javafirstdatabase";
            String username = "root";
            String password = "risheshmysql";

            Connection conn = DriverManager.getConnection(url+database,username,password);
            Statement dstm = conn.createStatement();
            String query = "delete from risheshtable where sid=5";
            dstm.execute(query);
            System.out.println("data deleted successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
