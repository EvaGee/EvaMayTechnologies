/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.evamay.business.Staff;

/**
 *
 * @author Eva
 */
public class StaffIO {
    public static int insert(Staff staff) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "employee"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        String sql="INSERT INTO staff(FirstName, LastName, MiddleName, StaffId, Designation, Password) "
                                    + "VALUES(?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
         try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, staff.getFname());
                st.setString(2, staff.getLname());
                st.setString(3, staff.getMname());
                st.setString(4, staff.getStaffId());
                st.setString(5, staff.getDesignation());
                st.setString(6, staff.getPassword()); 
                return st.executeUpdate(); 
              }
         catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    }
    
    public static Staff selectStaff(String designation, String password, String staffId) throws ClassNotFoundException, SQLException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "employee"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM staff WHERE Designation=? && StaffId=? && Password=?";
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
       try (Connection con = DriverManager.getConnection(dbURL + dbName, 
                    dbUsername,
                    dbPassword); 
               PreparedStatement st = con.prepareStatement(query)) 
       {               
                st.setString(1, designation);
                st.setString(2, staffId);
                st.setString(3, password);
                rs = st.executeQuery();
                Staff staff=null;
                if(rs.next())
                {
                   staff=new Staff();
                    staff.setFname(rs.getString("firstName"));
                    staff.setLname(rs.getString("lastName"));
                    staff.setMname(rs.getString("middleName"));
                    staff.setDesignation(rs.getString("designation"));
                    staff.setStaffId(rs.getString("staffId"));
                    staff.setPassword(rs.getString("password"));
                    
                    con.close();
                    return staff;
                }
                else
                {
                    return null;
                }
                
    }
}
}
