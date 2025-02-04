/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author shrey
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/lms?useSSL=false&serverTimezone=UTC", 
            "root", 
            "22BCE3818"
        );
        return con;
    }
        catch(ClassNotFoundException | SQLException e)
        {
           System.out.println(e);
           return null;
        }
    }
}
