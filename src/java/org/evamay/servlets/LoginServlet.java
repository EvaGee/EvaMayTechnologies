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
       // String designation=request.getParameter("designation");
        String staffId=request.getParameter("staffId");
        String password=request.getParameter("password");
        
        Staff staff1=new Staff();
       // staff.setDesignation(designation);
        staff1.setStaffId(staffId);
        staff1.setPassword(password);
        
        
        try {
            Staff staff=StaffIO.selectStaff(password, staffId);
           if(StaffIO.selectStaff(password, staffId)!=null)
           { HttpSession session=request.getSession();
                session.setAttribute("staff", staff);
                String designation=staff.getDesignation();
               switch(designation)
               { 
               case "Staff":
                
                String url="/staff.jsp";
                RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
                dispatcher.forward(request,response);
                  
               case "Sectional Manager": 
                String url1="/supervisorUI.jsp";
                RequestDispatcher dispatcher1=getServletContext().getRequestDispatcher(url1);
                 dispatcher1.forward(request,response);
                   
               case "Departmental Manager":
                String url2="/managerUI.jsp";
                RequestDispatcher dispatcher2=getServletContext().getRequestDispatcher(url2);
                dispatcher2.forward(request,response);
                   
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
