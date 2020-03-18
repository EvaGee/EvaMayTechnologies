<%-- 
    Document   : staff
    Created on : Mar 5, 2020, 10:16:00 PM
    Author     : Eva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

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
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/simple-sidebar.css" rel="stylesheet">
        <link href="css/add.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/main.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <link href="css/freelancer.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="css/welcome.css" type="text/css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>

<body id="page-top">

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg text-uppercase fixed-top copyright" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">Welcome</a>
      <a class="navbar-brand js-scroll-trigger" href="#page-top">${staff.fname} </a>
      <a class="navbar-brand js-scroll-trigger" href="#page-top">${staff.mname} </a>
      <a class="navbar-brand js-scroll-trigger" href="#page-top">${staff.lname} </a>
      <a class="navbar-brand js-scroll-trigger" href="#page-top">Staff No:${staff.staffId} </a>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#JobVacancies">Job Vacancies<br><span class="glyphicon glyphicon-briefcase"></span></a>
          </li>
          <li class="nav-item mx-0 mx-lg-1">
              <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#Leaves">Leaves<br><span class="glyphicon glyphicon-calendar"></span></a>
              
          </li>
          <li class="nav-item mx-0 mx-lg-1">
              <a href="#"  data-toggle="dropdown"><img src="images/user.png"><span class="dropdown-toggle"></span></a>                        
              <div class="dropdown-menu dropdown-menu-right user-dd animated">
                            <a class="dropdown-item" href="#ViewProfile"><span class="glyphicon glyphicon-user"></span> My Profile</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="newlogin.jsp"><i class="fa fa-power-off m-r-5 m-l-5"></i> Logout</a>
              </div>           
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <nav class="navbar sidebar navbar-inverse" role="navigation">
    <div class="collapse navbar-collapse" id="mynav">
      <ul class="nav navbar-nav">
        <li class="active">
            <a href="#">Home
                <span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-home"></span>
            </a>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Leaves 
              <span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-calendar"></span>
          </a>
          <ul class="dropdown-menu forAnimate" role="menu">
            <li><a class="dropdown-item copyright" href="#">Allowed</a></li>
            <li><a class="dropdown-item " href="#">Pending</a></li>
            <li><a class="dropdown-item" href="leaveapplication.jsp">Apply for a leave</a></li>
          </ul>
        </li>          
        <li >
            <a href="#">Job Vacancies
                <span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-briefcase"></span>
            </a>
	</li>
    </div>   
    </div>
</nav>
     


  <!-- Copyright Section -->
  <section class="copyright py-4 text-center text-white fixed-bottom">
    <div class="container">
      <big>Copyright &copy; EvaMay Technologies 2020</big>
    </div>
  </section>

  

  <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
  <div class="scroll-to-top d-lg-none position-fixed ">
    <a class="js-scroll-trigger d-block text-center text-white rounded" href="#page-top">
      <i class="fa fa-chevron-up"></i>
    </a>
  </div>

 
  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
  <script src="js/jqBootstrapValidation.js"></script>
  <script src="js/contact_me.js"></script>
  <!-- Custom scripts for this template -->
  <script src="js/freelancer.min.js"></script>

</body>

</html>

