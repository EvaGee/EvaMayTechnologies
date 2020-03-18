<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>EvaMay Technologies</title>
        <link rel="icon" type="image/png" href="images/logo2.png"/>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="css/studentRegistration.css" type="text/css" rel="stylesheet">
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
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
                <div class="wrap-login100">
                    <form class="form-container" method="post" action="AddStaffServlet" name="staff_registration_form" id="staff_registration_form" onsubmit="return validateForm()">
                        <span class="login100-form-logo">
                            <img src='images/logo2.png' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Staff Registration Form
			</span>
                        <div class="login100-form">
                            <label for="designation">Designation:</label>
                            <select class="input100" id="designation" name="designation">
                                <option>Staff</option>
                                <option>Supervisor</option>
                                <option>Overall Manager</option>
                                <option>HR Manager</option>
                            </select>
                        </div>
                        <div class="login100-form">
                          <label for="staffId">Staff Number:</label>
                          <input type="text" class="input100" name="staffId" id="staffId" placeholder="StaffId" pattern="[A-Z]+[A-Z]+[0-9]{5,5}" title="2 or 3 capital letters followed by 5 numbers" minlength="7" maxlength="8">
                        </div>
                        <div class="login100-form">
                          <label for="lname">Last Name:</label>
                          <input type="text" class="input100" id="lname" name="lname" placeholder="Last Name" pattern="[A-Za-z']+" title="alphabets and ' only">
                        </div>
                        <div class="login100-form">
                          <label for="fname">First Name:</label>
                          <input type="text" class="input100" id="fname" name="fname" placeholder="First Name" pattern="[A-Za-z']+" title="alphabets and ' only">
                        </div>
                        <div class="login100-form">
                          <label for="mname">Middle Name:</label>
                          <input type="text" class="input100" id="mname" name="mname" placeholder="Middle Name" pattern="[A-Za-z']+" title="alphabets and ' only">
                        </div>
                        <div class="login100-form">
                          <label for="password">Password:</label>
                          <input type="password" class="input100" name="password" id="password" placeholder="Password" >
                        </div>
                         <br>
                        <center>
                            <button type="submit" class="login100-form-btn">Login</button>
                        </center>
                    </form>
                    <br>
                        <center>
                            <a href="home.jsp">
                                <button type="submit" class="login100-form-btn">Cancel Registration</button>
                            </a>
                        </center>
                    <script>
                        function validateForm()                                    
                            { 
                                var staffId = document.forms["staff_registration_form"]["staffId"];
                                var fname = document.forms["staff_registration_form"]["fname"];               
                                var lname = document.forms["staff_registration_form"]["lname"];
                                var mname = document.forms["staff_registration_form"]["mname"];
                                var password = document.forms["staff_registration_form"]["password"];

                                if (staffId.value == "")                                  
                                { 
                                    window.alert("Please enter your Staff Number."); 
                                    staffId.focus(); 
                                    return false; 
                                } 

                                if (fname.value == "")                                  
                                { 
                                    window.alert("Please enter your First Name."); 
                                    fname.focus(); 
                                    return false; 
                                } 
                                
                                if (lname.value == "")                                  
                                { 
                                    window.alert("Please enter your Last Name."); 
                                    lname.focus(); 
                                    return false; 
                                } 
                             

                                if (password.value == "")                        
                                { 
                                    window.alert("Please enter your Password."); 
                                    password.focus(); 
                                    return false; 
                                } 
                                if (password.value != staffId.value) 
                                {

                                    window.alert("Password do not match Staff Number.");
                                    return false;
                                }

                                return true; 
                            }
                    </script>
		</div>
            </div>
	</div>
    </body>
</html>