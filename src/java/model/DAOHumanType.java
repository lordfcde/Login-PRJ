/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author vinhh
 */
public class DAOHumanType implements Workable<DtoHumanType> {
// IMPLEMENTS interface sử dụng kiểu dữ liệu của DTO HumanType

    @Override
    public int add(DtoHumanType x) {
         int kq = 0; // đặt bao nhiêu thì tuỳ có thể đặt -1 // suy nghĩ đơn giản = 0
        try {
           
            //-------------1. Tạo connection Object
            Connection conn = new ConnectDB().getConnection();
            //------------2. Viết SQL comment ,Tạo đối tượng mang lệnh ( Prepared Statement ) ==> ko dùng statement vì quá phức tạp dễ sai
            String sqlCommand = "INSERT into HumanType (typeId, typeName) VALUES (?,?)";
            PreparedStatement ps = conn.prepareCall(sqlCommand);
            //-----------3. , cập nhật tham số , và thi hành lệnh  [ update query()]
            ps.setInt(1, x.getTypeId());
            ps.setString(2, x.getTypeName());
            System.out.println("Toi duoc day roi");
            kq = ps.executeUpdate(); // update là cả CSDL bị cập nhật ( bao gồm cả add và xoá ) , ko có lệnh add, del ( chỉ dùng lệnh này  thôi )
            //----------4. Xử lí            
            //----------5. Đóng kết nối
            conn.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(DAOHumanType.class.getName()).log(Level.SEVERE, null, ex);
        }
         return kq;
    }

    @Override // về tự làm 
    public int update(DtoHumanType x) {
        
       
        int kq = 0;

        try {

//-------------1. Tạo connection Object
Connection conn = new ConnectDB().getConnection();
//------------2. Viết SQL comment ,Tạo đối tượng mang lệnh ( Prepared Statement ) ==> ko dùng statement vì quá phức tạp dễ sai
String sqlCommand = "UPDATE HumanType SET typeName = ? WHERE typeID = ?";
PreparedStatement ps = conn.prepareCall(sqlCommand);
//-----------3. , cập nhật tham số , và thi hành lệnh  [ update query()]
ps.setString(1, x.getTypeName());
ps.setInt(2, x.getTypeId());
System.out.println("Toi duoc day roi");
kq = ps.executeUpdate(); // update là cả CSDL bị cập nhật ( bao gồm cả add và xoá ) , ko có lệnh add, del ( chỉ dùng lệnh này  thôi )
//----------4. Xử lí
//----------5. Đóng kết nối
conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOHumanType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;

       
    }

    @Override // về tự làm 
    public int delete(int id) {
          int kq = 0; // đặt bao nhiêu thì tuỳ có thể đặt -1 // suy nghĩ đơn giản = 0
        try {
            //-------------1. Tạo connection Object
            Connection conn = new ConnectDB().getConnection();
            //------------2. Viết SQL comment ,Tạo đối tượng mang lệnh ( Prepared Statement ) ==> ko dùng statement vì quá phức tạp dễ sai
            String sqlCommand = "DELETE FROM  HumanType WHERE typeID = ?";
            PreparedStatement ps = conn.prepareCall(sqlCommand);
            //-----------3. , cập nhật tham số , và thi hành lệnh  [ update query()]
            ps.setInt(1, id);                       
            kq = ps.executeUpdate(); // update là cả CSDL bị cập nhật ( bao gồm cả add và xoá ) , ko có lệnh add, del ( chỉ dùng lệnh này  thôi )
            //----------4. Xử lí            
            //----------5. Đóng kết nối
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOHumanType.class.getName()).log(Level.SEVERE, null, ex);
        }
            return kq;
    }

    @Override
    public List<DtoHumanType> getAll() {
        List<DtoHumanType> result = new ArrayList<>();
        //------1. Tạo Connection 
        Connection conn = new ConnectDB().getConnection();

        try {
            //------2. Tạo Statement
            Statement cmd = conn.createStatement();
            //------3. Viết SQL Comment, thi hành & nhận kết quả 
            String sqlCommand = "Select typeID , typeName "
                    + "FROM HumanType";
                  
            ResultSet rs = cmd.executeQuery(sqlCommand);
            //------4. Xử lí dữ liệu ( Đóng gói dữ liệu thành các entity và gắn vào list )
            while (rs.next()) {
                DtoHumanType x = new DtoHumanType(rs.getInt(1), rs.getString(2));
                result.add(x);
            }
            //------5. Đóng kết nối
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOHumanType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public DtoHumanType searchById(int id) {
        DtoHumanType result = null;

        try {
            //------1. Tạo Connection 
        Connection conn = new ConnectDB().getConnection();
            //------2. Tạo Statement
            Statement cmd = conn.createStatement();
            //------3. Viết SQL Comment, thi hành & nhận kết quả 
            String sqlCommand = "Select typeID , typeName "
                    + "FROM HumanType "
                    + "WHERE typeID = "+id;
                    
                  
            ResultSet rs = cmd.executeQuery(sqlCommand);
            //------4. Xử lí dữ liệu ( Đóng gói dữ liệu thành các entity và gắn vào list )
            while (rs.next() && result == null) {
                 result = new DtoHumanType(rs.getInt(1), rs.getString(2));
                
            }
            //------5. Đóng kết nối
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOHumanType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
