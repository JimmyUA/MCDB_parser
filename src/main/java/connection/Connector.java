package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Connector {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/rashacom";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Vika_Ruban";

    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("No Driver");
        }

        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

}
