 <%-- 
    Document   : jobapplication
    Created on : Nov 11, 2020, 10:15:44 PM
    Author     : user
--%>


<%@page import="org.evamay.business.Staff"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>


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
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
  <link href="css/freelancer.css" rel="stylesheet">

</head>

<body id="page-top">
 <%
             String type=request.getParameter("type");
             String title=request.getParameter("title");
             String start=request.getParameter("start");
             String duties=request.getParameter("duties");
             String end=request.getParameter("end");
             String qualifications=request.getParameter("qualifications");
             %>
             
  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg copyright text-uppercase" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">
          <img src="images/logo2.png" alt="" width="100%" height="100%">
      </a>
     
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scoll-trigger" href="#home">Home</a>
          </li>
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#about">About</a>
          </li>
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#contacts">Contacts</a>
          </li>
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#vacancies">Vacancies</a>
          </li>
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="newlogin.jsp">Login</a>
          </li>
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#">+254742098588</a>
          </li>
        </ul>
      </div>
        <a class="navbar-brand js-scroll-trigger" href="#page-top">
          <img src="images/logo2.png" alt="" width="100%" height="100%">
      </a>
    </div>
  </nav>

 

   
    <section class="page-section portfolio" id="vacancies">
    <div class="container">
      <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">job vacancies</h2>
      <div class="divider-custom">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
        </div>
      <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Title</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=title%></p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Job Type</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=type%></p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Start Date</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=start%></p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">End Date</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=end%></p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Qualifications</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=qualifications%></p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Duties</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=duties%></p>
        </div>
      </div>
                
        
        <div class="row">
         <div class="col-lg-4 ml-auto">
             <p class="lead"><a href="home.jsp"><button>DECLINE</button>
                 </a></p>
        </div>
          <div class="col-lg-4 mr-auto">
              <p class="lead"><a href="login.jsp"><button>APPLY</button></a>
                </p>
        </div>
        </div>
        </div>
        
   
    </section>
          
       <section class="page-section bg-secondary text-white mb-0" id="about">
    <div class="container">
      <h2 class="page-section-heading text-center text-uppercase text-white">About</h2>
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>
      <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">We are a technology consulting firm passionately providing software, web and mobile app development.</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead">We are always happy to serve you to your satisfaction, hope you love our services.</p>
        </div>
      </div>     
    </div>
  </section>

  <!-- Contact Section -->
  <section class="page-section" id="contacts">
    <div class="container">
      <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Contact Me</h2>
      <div class="divider-custom">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>
      <div class="row">
        <div class="col-lg-4 ml-auto">
          <i class="glyphicon glyphicon-phone"></i>
          </a>
          <p class="lead">Phone number:
              <br>(+254)0 742 098 588</p>
        </div>
        <div class="col-lg-4 mr-auto">
           <i class="glyphicon glyphicon-envelope"></i>
          <p class="lead">Email:
              <br>info@evamaytechnologies.com</p>
        </div>
      </div>
    </div>
  </section>
  
  <!-- Footer -->
  <section class="page-section bg-secondary text-white mb-0">
    <div class="container">
      <div class="row">
        <div class="col-lg-4 mb-5 mb-lg-0">
          <h4 class="text-uppercase mb-4">Location</h4>
          <p class="lead mb-0">Brilliant Towers
            <br>8th Floor, Room 803</p>
        </div>
        <div class="col-lg-4">
          <h4 class="text-uppercase mb-4">Facebook</h4>
          <a class="btn btn-outline-light btn-social mx-1" href="facebook.com/EvaMayTechnologies">
            <i class="fab fa-fw fa-facebook-f"></i>
          </a>
          <p>EvaMay Technologies</p>
        </div>
        <div class="col-lg-4 mb-5">
          <h4 class="text-uppercase mb-4">Twitter</h4>
          <a class="btn btn-outline-light btn-social mx-1" href="twitter.com/">
            <i class="fab fa-fw fa-twitter"></i>
          </a>
          <p>EvaMay Technologies</p>
        </div>
      </div>
    </div>
   </section>

  <!-- Copyright Section -->
  <section class="copyright py-4 text-center text-white">
    <div class="container">
      <big>Copyright &copy; EvaMay Technologies 2020</big>
    </div>
  </section>

  

  <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
  <div class="scroll-to-top d-lg-none position-fixed ">
    <a class="js-scroll-trigger d-block text-center text-white rounded" href="#page-top">
      <i class="fa fa-chevron-up"></i>
  </div>

 
  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
  <script src="js/jqBootstrapValidation.js"></script>
  <script src="js/contact_me.js"></script>
  <!-- Custom scripts for this template -->    </a>

  <script src="js/freelancer.min.js"></script>

</body>

</html>



