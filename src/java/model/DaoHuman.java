/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author vinhh
 */
public class DaoHuman implements Workable<DtoHuman> {

    @Override
    public int add(DtoHuman x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(DtoHuman x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DtoHuman> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DtoHuman searchById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public DtoHuman getLogin(String user, String pass){
        DtoHuman result = null;
        try {
            //------1. Tạo Connection 
        Connection conn = new ConnectDB().getConnection();
            //------2. Tạo Statement
            Statement cmd = conn.createStatement();
            //------3. Viết SQL Comment, thi hành & nhận kết quả 
            String sqlCommand = "Select humanId, humanName, dob, gender, typeId, "
                    + "userHuman, passHuman"
                    + " FROM Human "
                    + "WHERE userHuman = '"+ user +"' and passHuman ='"+ pass +"' ";
                    
                  
            ResultSet rs = cmd.executeQuery(sqlCommand);
            //------4. Xử lí dữ liệu ( Đóng gói dữ liệu thành các entity và gắn vào list )
            while (rs.next() && result == null) {
               //--- B4.1 Đọc dữ liệu từ ResultSet
                int humanId = rs.getInt("humanId");
                String humanName = rs.getString("humanName");
                Date dob = rs.getDate("dob");
                boolean gender = rs.getBoolean("gender");
                ///--------------------------------
                int typeId = rs.getInt("typeId");
                DtoHumanType type = new DAOHumanType().searchById(typeId);
               
                
                ///---------------------------------
                String userHuman = rs.getString("userHuman");
                String passHuman = rs.getString("passHuman");
                String role = "test";
                boolean active = true;
               //4.2 0------ Đóng gói thành dtoHuman object
               result = new DtoHuman(humanId, humanName, dob, gender, type, userHuman, passHuman, role, active);
            }
            //------5. Đóng kết nối
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOHumanType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
