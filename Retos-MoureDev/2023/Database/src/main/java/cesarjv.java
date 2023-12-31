import java.sql.*;

/*
 * Realiza una conexión desde el lenguaje que hayas seleccionado a la siguiente base de datos MySQL:
 * - Host: mysql-5707.dinaserver.com
 * - Port: 3306
 * - User: mouredev_read
 * - Password: mouredev_pass
 * - Database: moure_test
 *
 * Una vez realices la conexión, lanza la siguiente consulta e imprime el resultado:
 * - SELECT * FROM `challenges`
 *
 * Se pueden usar librerías para realizar la lógica de conexión a la base de datos.
 */

public class cesarjv {
    public static void main(String[] args) {

        /*try(Connection conn=ConnectionBD.getInstance();
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM challenges")) */
        try(Connection conn=getInstance();
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM challenges")){

            while(rs.next()){
                System.out.print(rs.getInt(1));
                System.out.print(" | ");
                System.out.print(rs.getString(2));
                System.out.print(" | ");
                System.out.print(rs.getString(3));
                System.out.print(" | ");
                System.out.println(rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Connection getInstance() throws SQLException {
        final String url="jdbc:mysql://mysql-5707.dinaserver.com:3306/moure_test?serverTimezone=America/Caracas";
        final String username="mouredev_read";
        final String password="mouredev_pass";
        Connection connection = null;
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
