<%-- 
    Document   : uploaddocs
    Created on : Dec 15, 2020, 10:52:54 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
	<title>EvaMay Technologies</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<link rel="icon" type="image/png" href="images/logo2.png"/>
	
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    </head>

    <body >
        <%
            String email=request.getParameter("email");
            String idNo=request.getParameter("idNo");
            %>

	<div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
		<div class="wrap-login100">
                    <form class="login100-form validate-form" method="post" action="UploadDocsServlet" name="docs_form" id="docs_form" enctype="multipart/form-data">
			<span class="login100-form-logo">
                            <img src='images/logo2.png' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Job Portal
			</span>
                        <div class="login100-form">
                          <label for="email">Email:</label>
                          <input type="text" class="input100" name="email" value="<%=email%>" readonly="">
                        </div>
                        <div class="login100-form">
                          <label for="email">Resume:</label>
                          <input type="file" required>
                        </div>
                        <div class="login100-form">
                          <label for="email">Cover Letter:</label>
                          <input type="file" required>
                        </div>
                        <input type="hidden" name="idNo" value="<%=idNo%>">
                        
            
                         <br>
                         
                        <center>
                              <button type="submit" class="login100-form-btn">Upload</button>
                        </center>
                    </form>
                    <br>
                        <center>
                            <a href="welcomeInterviewee.jsp">
                                Cancel
                            </a>
                        </center>
                    
                </div>
        
            </div>
        </div>
      
	
	
  </body>
</html>

