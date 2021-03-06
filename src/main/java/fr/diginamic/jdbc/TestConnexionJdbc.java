package fr.diginamic.jdbc;

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionJdbc {
    public static void main(String[] args) throws SQLException {


        // 1- Load mariaDb Driver
        DriverManager.registerDriver(new Driver());

        // 2- Connect to the database 'compta'
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta", "root", "");

        if(connection!=null){
            System.out.println("Connection succeed");
            System.out.println(connection.toString());
        }

        // 3- Close the connection
        connection.close(); // Indispensable pour certaines BDD. Exemple : Oracle
    }
}
