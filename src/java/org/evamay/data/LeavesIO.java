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

import org.evamay.business.Leaves;
import org.evamay.business.Staff;


/**
 *
 * @author user
 */
public class LeavesIO {
    public static int insert(Leaves leaves) throws ClassNotFoundException 
    {
       String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "employee"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        String sql="INSERT INTO leaves(staffId, status, type, leaveDays, start, end, remainingDays) "
                                    + "VALUES(?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
         try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, leaves.getStaffId());
                st.setString(2, leaves.getStatus());
                st.setString(3, leaves.getLeaveType());
                st.setString(4, leaves.getDays());
                st.setString(5, leaves.getStartDate());
                st.setString(6, leaves.getEndDate()); 
                st.setString(7, leaves.getRemainingDays());
                

                return st.executeUpdate(); 
              }
         catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }  
   
    }
     public static Leaves selectLeaves( String staffId) throws ClassNotFoundException, SQLException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "employee"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM leaves WHERE staffId=?";
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
       try (Connection con = DriverManager.getConnection(dbURL + dbName, 
                    dbUsername,
                    dbPassword); 
               PreparedStatement st = con.prepareStatement(query)) 
       {               
                st.setString(1, staffId);
               
                rs = st.executeQuery();
                Leaves leaves=null;
                if(rs.next())
                {
                   leaves=new Leaves(); 
                   leaves.setEndDate(rs.getString("endDate"));
                   leaves.setDays(rs.getString("staffId"));

                    con.close();
                    return leaves;
                }
                else
                {
                    return null;
                }
                
    }
}
}