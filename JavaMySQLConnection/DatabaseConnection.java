import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static final String url = "jdbc:mysql://localhost:3306/school";
    public static final String user = "root";
    public static final String password = "";

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");

        } catch (SQLException e) {
            System.out.println("Connection failed! " + e.getMessage());
        }
    }

    public Connection dbConnection() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");

            return conn;
        } catch (SQLException e) {
            System.out.println("Connection failed! " + e.getMessage());
        }

        return null;
    }
}
