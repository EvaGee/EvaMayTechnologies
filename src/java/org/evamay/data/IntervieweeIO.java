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
import org.evamay.business.Interviewee;
import org.evamay.business.Staff;

/**
 *
 * @author user
 */
public class IntervieweeIO {
    public static int insert(Interviewee interviewee) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "employee"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        String sql="INSERT INTO jobapplicants(firstName ,LastName, MiddleName, Gender, Email, PhoneNo, Password) "
                                    + "VALUES(?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
         try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                  
                st.setString(1, interviewee.getFname());
                st.setString(2, interviewee.getLname());
                st.setString(3, interviewee.getMname());
                st.setString(4, interviewee.getGender());
                st.setString(5, interviewee.getEmail()); 
                st.setString(6, interviewee.getPhoneNo());
                st.setString(7, interviewee.getPassword());
                return st.executeUpdate(); 
              }
         catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    }
    
    public static Interviewee selectInterviewee(String password, String email) throws ClassNotFoundException, SQLException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "employee"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM jobapplicants WHERE Email =? && Password=?;";
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
       try (Connection con = DriverManager.getConnection(dbURL + dbName, 
                    dbUsername,
                    dbPassword); 
               PreparedStatement st = con.prepareStatement(query)) 
       {               
                st.setString(1, email);
                st.setString(2, password);
                rs = st.executeQuery();
                Interviewee interviewee=null;
                if(rs.next())
                {
                   interviewee=new Interviewee();
                    interviewee.setFname(rs.getString("firstName"));
                    interviewee.setLname(rs.getString("lastName"));
                    interviewee.setMname(rs.getString("middleName"));
                    interviewee.setPassword(rs.getString("password"));
                    interviewee.setGender(rs.getString("gender"));
                    interviewee.setEmail(rs.getString("email"));
                    interviewee.setPhoneNo(rs.getString("phoneNo"));



                    
                    con.close();
                    return interviewee;
                }
                else
                {
                    return null;
                }
                
    }
}
}
