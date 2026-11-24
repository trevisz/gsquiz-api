package GlobalSolution.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() throws SQLException {
        String url = requiredEnv("ORACLE_URL");
        String user = requiredEnv("ORACLE_USER");
        String password = requiredEnv("ORACLE_PASSWORD");
        return DriverManager.getConnection(url, user, password);
    }

    private static String requiredEnv(String name) {
        String value = System.getenv(name);
        if (value == null || value.isBlank()) {
            throw new IllegalStateException("Required environment variable is missing: " + name);
        }
        return value;
    }
}
