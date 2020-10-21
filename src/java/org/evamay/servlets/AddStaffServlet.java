/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.evamay.business.Staff;
import org.evamay.data.StaffIO;

/**
 *
 * @author Eva
 */
public class AddStaffServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staffId=request.getParameter("staffId");
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String mname=request.getParameter("mname");
        String gender=request.getParameter("gender");
        String email=request.getParameter("email");
        String phoneNo=request.getParameter("phoneNo");
        String department=request.getParameter("department");
        String section=request.getParameter("section");
        String designation=request.getParameter("designation");
        String password=request.getParameter("password");

        
        Staff staff=new Staff();
        staff.setFname(fname);
        staff.setLname(lname);
        staff.setMname(mname);
        staff.setStaffId(staffId);
        staff.setGender(gender);
        staff.setEmail(email);
        staff.setPhoneNo(phoneNo);
        staff.setDepartment(department);
        staff.setSection(section);
        staff.setDesignation(designation);
        staff.setPassword(password);
        
        try {
            if(StaffIO.insert(staff)>0 && StaffIO.insert1(staff)>0)
            {
               String message1="Staff successfully registered";
                String url1="/hrUI.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
               dispatcher.forward(request,response);  
            }
            else
            {
                String message="This staff number is already registered";
                String url="/staffRegistration.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStaffServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }

   
}
 