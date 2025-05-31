package GlobalSolution.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = System.getenv("ORACLE_URL");
    private static final String USER = System.getenv("ORACLE_USER");
    private static final String PASSWORD = System.getenv("ORACLE_PASSWORD");

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
