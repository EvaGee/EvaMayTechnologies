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
        <style>
.hide {
  display: none
}
</style>
    </head>
    <body>
         <%
             String lname=request.getParameter("lname");
             String fname=request.getParameter("fname");
             String mname=request.getParameter("mname");
             String staffId=request.getParameter("staffId");
             String gender=request.getParameter("gender");
             String email=request.getParameter("email");
             String phoneNo=request.getParameter("phoneNo");
             
             
             
             %>
        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
                <div class="wrap-login100">
                    <form class="form-container" method="post" action="AddStaffServlet" name="staff_registration2_form" id="staff_registration2_form">
                        <span class="login100-form-logo">
                            <img src='images/logo2.png' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Staff Registration Form
			</span>
                        <div class="login100-form">
                            <label for="department">Department</label>
                            <select class="input100" id="department_select" name="department">
                                <option value="Marketing">Marketing</option>
                                <option value="Accounting and Finance">Accounting and Finance</option>
                                <option value="Technology">Technology</option>
                            </select>
                        </div>
                        <div class="login100-form">
                            <label for="section">Section</label>
                            <select class="input100" id="section_select" name="section">
                                <option value="Public Relations" department="Marketing">Public Relations</option>
                                <option value="Sales" department="Marketing">Sales</option>
                                <option value="Accounting" department="Accounting and Finance" class="hide">Accounting</option>
                                <option value="Payrolls" department="Accounting and Finance" class="hide">Payrolls</option>
                                <option value="Web" department="Technology" class="hide">Web</option>
                                <option value="Network Management" department="Technology" class="hide">Network Management</option>
                                <option value="Data Security" department="Technology" class="hide">Data Security</option>
                            </select>
                        </div>
                        <div class="login100-form">
                            <label for="designation">Designation:</label>
                            <select class="input100" id="designation" name="designation">
                                <option>Staff</option>
                                <option>Sectional Manager </option>
                                <option>Departmental Manager</option>
                            </select>
                        </div>
                        
                        <input type="hidden" name="password" id="password" value="<%=staffId%>" >
                        <input type="hidden" name="lname" id="lname" value="<%=lname%>" >
                        <input type="hidden" name="fname" id="fname" value="<%=fname%>" >
                        <input type="hidden" name="mname" id="mname" value="<%=mname%>" >
                        <input type="hidden" name="staffId" id="staffId" value="<%=staffId%>" >
                        <input type="hidden" name="gender" id="gender" value="<%=gender%>" >
                        <input type="hidden" name="email" id="email" value="<%=email%>" >
                        <input type="hidden" name="phoneNo" id="phoneNo" value="<%=phoneNo%>" >
                        <input type="hidden" name="remainingDays" id="remainingDays" value="21" >
                            
                         <br>
                        <center>
                            <button type="submit" class="login100-form-btn">Register</button>
                        </center>
                    </form>
                    <br>
                        <center>
                            
                                <button type="submit" class="login100-form-btn" onclick="history.back()">Back</button>
                           
                        </center>
                    
                    <script>
document.getElementById('department_select').addEventListener("change", function() {
  var val = this.value;
  var options = document.getElementById('section_select').options;
  var new_val = null;
  for (var i = 0 ; i < options.length; i++) {
    if (options[i].attributes["department"].value === val) {
      if (!new_val) {
        new_val = options[i].value;
      }
      options[i].classList.remove("hide");
    } else {
      options[i].classList.add("hide");
    }
  }
  document.getElementById('section_select').value = new_val;
});
                    </script>
		</div>
            </div>
	</div>
    </body>
</html>