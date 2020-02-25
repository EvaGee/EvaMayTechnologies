<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Staff Registration</title>
<link rel="icon" type="image/png" href="images/logo2.png"/>
   
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link href="css/studentRegistration.css" type="text/css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid bg">
		<div class="row">
            <div class="col-md-2 col-sm-4 col-xs-12"></div>
            <div class="col-md-2 col-sm-4 col-xs-12">
                <p><i>${message}</i></p>
            </div>
				<!-- Form Start -->
            <form class="form-container" method="post" action="AddStaffServlet" name="staff_registration_form" id="staff_registration_form" onsubmit="return validateForm()">
                <h1>Staff Registration Form</h1>
                <div class="form-group">
                    <label for="staffId">Staff Number:</label>
                    <input type="text" class="form-control" id="staffId" name="staffId" placeholder="Staff Number">
                </div>
                <div class="form-group">
                    <label for="lname">Last Name:</label>
                    <input type="text" class="form-control" id="lname" name="lname" placeholder="Last Name">
                </div>
                <div class="form-group">
                    <label for="fname">First Name:</label>
                    <input type="text" class="form-control" id="fname" name="fname" placeholder="First Name">
                </div>
                <div class="form-group">
                    <label for="mname">Middle name:</label>
                    <input type="text" class="form-control" id="mname" name="mname" placeholder="Middle Name">
                </div>
                <div class="form-group">
                    <label for="designation">Designation:</label>
                    <select class="form-control" id="designation" name="designation">
                        <option>Staff</option>
                        <option>Supervisor</option>
                        <option>Overall Manager</option>
                        <option>HR Manager</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                </div>
               
                  <button type="submit" class="btn btn-success btn-block">Submit</button>
                <br>
                <button type="button" class="btn btn-danger btn-block" onClick="window.location.href='login.jsp'">Back</button>
            </form>
				<!-- Form End-->
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
</body>
</html>