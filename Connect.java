
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basisdatagemink;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Rama
 */
public class Connect {
    
    public static Map<String, Object> getParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Rama");
        return parameters;
    }
    public static Connection Connection() {
        Connection conn = null;
        String url = "jdbc:sqlserver://localhost:1433;"
                + "server=LAPTOP-U59C8O8P; "
                + "database=Perusahaan_Pizza; "
                + "user=sa;"
                + "password=Awarzqpk87;"
                + "encrypt=false;"
                + "trustServerCertificate=true;";
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    
}
