/*package con.simel.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "b5dxdigv2i8golio2hwr-mysql.services.clever-cloud.com";
    private final String USER = "ulswbpzpmmus7dmv";
    private final String PASS = "0pN58w6wTJ7wrc14H97p";

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
*/
