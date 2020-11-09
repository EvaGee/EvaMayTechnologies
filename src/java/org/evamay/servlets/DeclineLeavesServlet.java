/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class DeclineLeavesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staffId=request.getParameter("staffId");
        String comment=request.getParameter("comment");
        String type=request.getParameter("type");
        String days=request.getParameter("leaveDays");
        String start=request.getParameter("start"); 
        String end=request.getParameter("end");
        String remainingDays=request.getParameter("remainingDays");
        
        Connection con;
                        PreparedStatement st;
                        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeclineLeavesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
            st = con.prepareStatement("UPDATE leaves SET status='declined', feedback=? WHERE staffId=? && "
                    + "status='pending' && end=? && start=? && leaveDays=? && type=?");
                        st.setString(1, comment);
                        st.setString(2,staffId);
                        st.setString(3, end);
                        st.setString(4, start);
                        st.setString(5, days);
                        st.setString(6, type);
                       
                       st.executeUpdate();
                       System.out.println(st.executeUpdate());
                        
                        if(st.executeUpdate()==0){
                            String message1="here are the Leaves you have applied for";
                            String url1="/appliedLeaves.jsp";
                            request.setAttribute("message", message1);
                            
                            RequestDispatcher dispatcher=getServletContext().
                                    getRequestDispatcher(url1);
                            dispatcher.forward(request,response);
                        } else {
                            String message1="here are the Leaves you have applied for";
                            String url1="/viewleaves.jsp";
                            request.setAttribute("message", message1);
                            
                            RequestDispatcher dispatcher=getServletContext().
                                    getRequestDispatcher(url1);
                            dispatcher.forward(request,response);
                        }
        } catch (SQLException ex) {
            Logger.getLogger(DeclineLeavesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
                      
        
    }

   

}
