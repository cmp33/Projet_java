package BDD;

import java.sql.*;

public class Connexion {

    private static String url = "jdbc:mysql://localhost:3306/db_projet_java?useSSL=FALSE";
    private static String user = "admin";
    private static String passwd = "cesi";

    private static Connection conn;

    public static Connection getInstance() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Erreur connexion bdd");
            }
        }
        return conn;
    }
}
