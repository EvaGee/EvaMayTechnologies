<%-- 
    Document   : jobvacancy
    Created on : Jul 31, 2020, 11:13:52 AM
    Author     : user
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>EvaMay Technologies</title>
        <link rel="icon" type="image/png" href="images/logo2.png"/>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
        
        <style>
            .hide {
            display: none
            }
        </style>
    </head>
    <body>
        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
                <div class="wrap-login100">
                    <form class="form-container" method="post" action="AddJobServlet">
                        <span class="login100-form-logo">
                            <img src='images/logo2.png' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Job Vacancy
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
                          <label for="title">Title:</label>
                            <select class="input100" id="title" name="title">
                                <option value="Senior staff">Senior staff</option>
                                <option value="Junior Staff">Junior staff</option>
                            </select>                        
                        </div>
                        <div class="login100-form">
                          <label for="type">Type:</label>
                          <select class="input100" id="type" name="type">
                                <option value="Permanent">Permanent</option>
                                <option value="Contract">Contract</option>
                                <option value="Internship">Internship</option>
                            </select>
                        </div>
                        <div class="login100-form">
                          <label for="startDate">Start Date:</label>
                          <input type="date" class="input100" name="startDate" id="startDate" placeholder="Start Date" required>
                        </div> 
                        
                        <div class="login100-form">
                          <label for="endDate">End Date:</label>
                          <input type="date" class="input100" name="endDate" id="endDate" placeholder="End Date"  required>
                        </div>
                        <div class="login100-form">
                          <label for="qualifications">Qualifications</label>
                          <input type="textarea" class="input100" id="qualifications" name="qualifications" placeholder="Qualifications" required>
                        </div>
                         <br>
                        <center>
                            <button type="submit" class="login100-form-btn">Next</button>
                        </center>
                    </form>
                    <br>
                        <center>
                            <a href="home.jsp">
                                <button type="submit" class="login100-form-btn">Cancel Registration</button>
                            </a>
                        </center>
                   
		</div>
            </div>
	</div>
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
                    <script>
      const picker=document.getElementById('startDate');
      picker.addEventListener('input', function(e){
           var date1=new Date(this.value).getTime();
           var date2=new Date().getTime();      //Today's date
           if(date1<date2){                 
               e.preventDefault();
               this.value='';
               alert('You cannot choose a past date!!!');
           }       

       });           
</script>
<script>
      const picker1=document.getElementById('endDate');
      picker1.addEventListener('input', function(e){
           var date1=new Date(this.value).getTime();
           var date2=new Date().getTime();      //Today's date
           if(date1<date2){                 
               e.preventDefault();
               this.value='';
               alert('You cannot choose a past date!!!');
           }       

       });           
</script>

    </body>
</html>