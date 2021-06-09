package fr.diginamic.jdbc;

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionJdbc {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta", "root", "");

        if(connection!=null){
            System.out.println("Connection succeed");
            System.out.println(connection.toString());
        }

        connection.close();
    }
}
