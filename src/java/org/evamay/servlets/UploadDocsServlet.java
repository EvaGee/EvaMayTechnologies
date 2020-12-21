/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.servlets;

import java.io.IOException;
import java.io.InputStream;
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
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author user
 */
@MultipartConfig(
        fileSizeThreshold = 1024 * 10* 1024,  
        maxFileSize = 1024 * 300* 1024,      
        maxRequestSize = 1024 * 1024 * 1024   
)
public class UploadDocsServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String email=request.getParameter("email");
         String idNo=request.getParameter("idNo");
         String status="in progress";
         
         System.out.println(email);
         System.out.println(idNo);
         System.out.println(status);
         
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + email + "<br/>";      
        htmlRespone += "Your password is: " + idNo + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
            
    }
     
    
    
}
