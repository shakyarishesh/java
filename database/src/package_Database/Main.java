package package_Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        student s1 = new student();
        //s1.createDatabase();
        //s1.createTable();
        //we usually don't create databases and table we simply add the data into the already created tables of the existing databases.


        //create data
        //s1.createData();
        s1.readData();
        //s1.updateData();
        //s1.deleteData();
    }
}
