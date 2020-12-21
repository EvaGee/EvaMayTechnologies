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
import org.evamay.business.Interviewee;
import org.evamay.business.Staff;
import org.evamay.data.IntervieweeIO;
import org.evamay.data.StaffIO;

/**
 *
 * @author user
 */
public class PortalServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        
        Interviewee interviewee1=new Interviewee();
        interviewee1.setEmail(email);
        interviewee1.setPassword(password);
        
        
        try {
            Interviewee interviewee=IntervieweeIO.selectInterviewee(password, email);
           if(IntervieweeIO.selectInterviewee(password, email)!=null)
           {    HttpSession session=request.getSession();
                session.setAttribute("interviewee", interviewee);
                String message="sucessful login, upload your documents here";
                request.setAttribute("message", message);
                String url="/welcomeInterviewee.jsp";
                RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
           else
           {
               String message="invalid login";
                String url="/login.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
           }
                    
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(PortalServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PortalServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   
}
