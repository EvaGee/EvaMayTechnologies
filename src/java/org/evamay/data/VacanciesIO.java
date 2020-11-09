/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.evamay.business.Vacancies;

/**
 *
 * @author user
 */
public class VacanciesIO {
    public static int insert(Vacancies vacancies) throws ClassNotFoundException 
    {
       String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "employee"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        String sql="INSERT INTO jobvacancies(department, section, title, type, start, end, qualifications)"
                                    + "VALUES(?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
         try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, vacancies.getDepartment());
                st.setString(2, vacancies.getSection());
                st.setString(3, vacancies.getTitle());
                st.setString(4, vacancies.getType());
                st.setString(5, vacancies.getStartDate());
                st.setString(6, vacancies.getEndDate());
                st.setString(7, vacancies.getQualifications());

                return st.executeUpdate(); 
              }
         catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }  
   
    }
    
}
