/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.evamay.business.Leaves;
import org.evamay.data.LeavesIO;

/**
 *
 * @author user
 */
public class ApplyLeaveServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staffId=request.getParameter("staffId");
        String status=request.getParameter("status");
        String leaveType=request.getParameter("leaveType");
        String days=request.getParameter("days");
        String startDate=request.getParameter("startDate"); 
        String endDate=request.getParameter("endDate");
     /*   SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date_d=null;
        Date date_s=null;
        try {
                date_d = sdformat.parse(sDate);
                } 
        catch (ParseException ex) {
                    System.out.println("error parsing it bro");
                    Logger.getLogger(ApplyLeaveServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
        try {
                date_s = sdformat.parse(eDate);
                } 
        catch (ParseException ex) {
                    System.out.println("error parsing it bro");
                    Logger.getLogger(ApplyLeaveServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        String startDate = dateFormat.format(date_d);
        String endDate = dateFormat.format(date_s);
      */  
        Leaves leaves=new Leaves();
        leaves.setDays(days);
        leaves.setEndDate(endDate);
        leaves.setLeaveType(leaveType);
        leaves.setStaffId(staffId);
        leaves.setStartDate(startDate);
        leaves.setStatus(status);
        
        try {
            if(LeavesIO.insert(leaves)>0)
            {
               String message1="here are the Leaves you have applied for";
                String url1="/pendingLeaves.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
               dispatcher.forward(request,response);  
            }
            else
            {
                String message="Error applying your leave, please try again";
                String url="/leaveapplication.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplyLeaveServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    

}
