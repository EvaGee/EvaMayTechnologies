/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.evamay.business.Interviewee;
import org.evamay.data.IntervieweeIO;
import org.evamay.data.StaffIO;

/**
 *
 * @author user
 */
public class AddInterviewerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String mname=request.getParameter("mname");
        String gender=request.getParameter("gender");
        String email=request.getParameter("email");
        String phoneNo=request.getParameter("phoneNo");
        String password=request.getParameter("password");
        
        Interviewee interviewee=new Interviewee();
        interviewee.setFname(fname);
        interviewee.setMname(mname);
        interviewee.setLname(lname);
        interviewee.setEmail(email);
        interviewee.setGender(gender);
        interviewee.setPassword(password);
        interviewee.setPhoneNo(phoneNo);
        
        System.out.println(fname);
        try {
            if(IntervieweeIO.insert(interviewee)>0){
                String message1="You have registered successfully";
                String url1="/login.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                        getRequestDispatcher(url1);
                dispatcher.forward(request,response); 
            }
            else
            {
                String message="That email is already registered";
                String url="/register.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddInterviewerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
