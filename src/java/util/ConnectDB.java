package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class ConnectDB {

    private String ip, port, dbName, user, password;

    public ConnectDB() {
        this.ip = "10.211.55.2";
        this.port = "1433";
        this.dbName = "human";
        this.user = "sa";
        this.password = "12345";
    }

    public ConnectDB(String ip, String port, String dbName, String user, String password) {
        this.ip = ip;
        this.port = port;
        this.dbName = dbName;
        this.user = user;
        this.password = password;
    }

    public String getStringConnect() {
        return String.format("jdbc:sqlserver://%s:%s;DatabaseName=%s;User=%s;Password=%s;encrypt=true;trustServerCertificate=true;",
                 this.ip, this.port, this.dbName, this.user, this.password);
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(getStringConnect());
            System.out.println("✅ Kết nối Database thành công!"); // Báo tin vui nếu chạy được
        } catch (ClassNotFoundException ex) {
           System.err.println("❌ LỖI RỒI: Không tìm thấy thư viện Driver SQL!");
            System.err.println("👉 Bạn cần copy file sqljdbc4.jar vào thư mục WEB-INF/lib");
            ex.printStackTrace(); // In chi tiết lỗi ra
        } catch (SQLException ex) {
           System.err.println("❌ LỖI RỒI: Không kết nối được tới SQL Server!");
            System.err.println("👉 Kiểm tra lại: IP, User, Password hoặc xem SQL Server đã bật chưa?");
            System.err.println("👉 Chi tiết lỗi: " + ex.getMessage());
            ex.printStackTrace();
        }
        return con;
    }
}
