/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.evamay.business.Vacancies;
import org.evamay.data.VacanciesIO;

/**
 *
 * @author user
 */
public class AddJobServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String department=request.getParameter("department");
        String section=request.getParameter("section");
        String title=request.getParameter("title");
        String type=request.getParameter("type");
        String startDate=request.getParameter("startDate"); 
        String endDate=request.getParameter("endDate");
        String qualifications=request.getParameter("qualifications");
        
        Vacancies vacancies=new Vacancies();
        vacancies.setDepartment(department);
        vacancies.setSection(section);
        vacancies.setTitle(title);
        vacancies.setType(type);
        vacancies.setStartDate(startDate);
        vacancies.setEndDate(endDate);
        vacancies.setQualifications(qualifications);
        
        try {
            if(VacanciesIO.insert(vacancies)>0)
            {
               String message1="here are the job vacancies";
                String url1="/hrUI.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
               dispatcher.forward(request,response);  
            }
            else
            {
                String message="Error encounterd, please try again";
                String url="/jobvacancy.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddJobServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    
}
