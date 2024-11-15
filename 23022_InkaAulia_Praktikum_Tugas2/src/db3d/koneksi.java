/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db3d;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author inkaa
 */
public class koneksi {
    private static Connection connect;

    public static Connection connect() throws SQLException, ClassNotFoundException {
        try {
            if (connect == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/database3D", "root", "");
                System.out.println("Koneksi berhasil!");
            }
            return connect;
        } catch (SQLException e) {
            System.err.println("Error: Koneksi tidak berhasil! " + e.getMessage());
            throw e; 
        }
    }
}
