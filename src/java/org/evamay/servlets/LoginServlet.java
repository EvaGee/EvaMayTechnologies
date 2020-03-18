/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.evamay.business.Staff;
import org.evamay.data.StaffIO;

/**
 *
 * @author Eva
 */
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String designation=request.getParameter("designation");
        String staffId=request.getParameter("staffId");
        String password=request.getParameter("password");
        
        Staff staff=new Staff();
        staff.setDesignation(designation);
        staff.setStaffId(staffId);
        staff.setPassword(password);
        
        
        try {
            Staff staff1=StaffIO.selectStaff(designation, password, staffId);
           if(StaffIO.selectStaff(designation, password, staffId)!=null)
           {
               switch(designation)
               {
               case "Staff":
                HttpSession session=request.getSession();
                session.setAttribute("staff", staff1);
                String url="/staff.jsp";
                RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
                dispatcher.forward(request,response);
                  
               case "Supervisor": 
                HttpSession session1=request.getSession();
                session1.setAttribute("staff", staff1);
                String url1="/supervisorUI.jsp";
                RequestDispatcher dispatcher1=getServletContext().getRequestDispatcher(url1);
                dispatcher1.forward(request,response);
                   
               case "Overall Manager":
                HttpSession session2=request.getSession();
                session2.setAttribute("staff", staff1);
                String url2="/managerUI.jsp";
                RequestDispatcher dispatcher2=getServletContext().getRequestDispatcher(url2);
                dispatcher2.forward(request,response);
                   
               case "HR Manager":
                HttpSession session3=request.getSession();
                session3.setAttribute("staff", staff1);
                String url3="/hrUI.jsp";
                RequestDispatcher dispatcher3=getServletContext().getRequestDispatcher(url3);
                dispatcher3.forward(request,response);
               }
               
           }
           else
           {
               String message="invalid login";
                String url="/newlogin.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
           }
                    
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
