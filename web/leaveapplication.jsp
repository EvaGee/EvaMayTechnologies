<%-- 
    Document   : newlogin
    Created on : Mar 2, 2020, 6:59:08 PM
    Author     : Eva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
	<title>EvaMay Technologies</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<link rel="icon" type="image/png" href="images/logo2.png"/>
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    </head>

    <body >

	<div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
		<div class="wrap-login100">
                    <form class="login100-form validate-form" method="post" action="LoginServlet" name="login_form" id="login_form" onsubmit="return validateForm()">
			<span class="login100-form-logo">
                            <img src='images/logo2.png' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Leave application
			</span>
                        
                        <div class="login100-form">
                          <input type="hidden" class="input100" value="${staff.staffId}">
                        </div>

			<div class="login100-form">
                            <label for="leaveType">Leave Type:</label>
                            <select class="input100" id="leaveType" name="Leave Type">
                                <option>Annual</option>
                                <option>Sick</option>
                                <option>Paternity/Maternity</option
                                <option>Study</option>
                                <option>Compassionate</option>
                                <option>Sabbatical</option>
                                <option>Other</option>
                            </select>
                        </div>

                        <div class="login100-form">
                          <label for="days">No of days</label>
                          <input type="number" class="input100" name="days" id="days" placeholder="Required leave days" required>
                        </div>

                        <div class="login100-form">
                          <label for="password">Start Date:</label>
                          <input type="date" class="input100" name="startDate" id="startDate" placeholder="Start Date" required>
                        </div>
                        
                        <div class="login100-form">
                          <label for="password">End date:</label>
                          <input type="date" class="input100" name="endDate" id="endDate" placeholder="End Date" required>
                        </div>
            
                        <br>
                        <center>
                              <button type="submit" class="login100-form-btn">Apply</button>
                        </center>
                    </form>
                        <br>
                        <center>
                            <a href="home.jsp">
                                <button type="submit" class="login100-form-btn">Cancel Application</button>
                            </a>
                        </center>
                </div>
        
            </div>
        </div>
      
	
	<script type="text/javascript">
	 function validateForm()                                    
                    { 
                        var staffId = document.forms["login_form"]["staffId"];
                        var password = document.forms["login_form"]["password"];
    
                        if (staffId.value == "")                                  
                        { 
                            window.alert("Please enter your Staff Number."); 
                            staffId.focus(); 
                            return false; 
                        } 

                        if (password.value == "")                        
                        { 
                            window.alert("Please enter your Password."); 
                            password.focus(); 
                            return false; 
                        } 
                        

                        return true; 
                    }
	</script>
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
