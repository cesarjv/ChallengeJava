import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {

    private static final String url="jdbc:mysql://mysql-5707.dinaserver.com:3306/moure_test?serverTimezone=America/Caracas";
    private static final String username="mouredev_read";
    private static final String password="mouredev_pass";

    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if(connection == null){
            connection= DriverManager.getConnection(url,username,password);
        }
        return connection;
    }
}
