<%-- 
    Document   : appliedLeaves
    Created on : Oct 15, 2020, 10:24:27 PM
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

  <title>EvaMay Technologies</title>

  <link rel="icon" type="image/png" href="images/logo2.png"/>
  <link href="css/freelancer.css" rel="stylesheet">
     <link href="css/sb-admin-2.css" rel="stylesheet">

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template-->
   

  
       
</head>

<body id="page-top">
     <%
             String type=request.getParameter("type");
             String leaveDays=request.getParameter("leaveDays");
             String start=request.getParameter("start");
             String staffId=request.getParameter("staffId");
             String end=request.getParameter("end");
             String remainingDays=request.getParameter("remainingDays");
             %>
             

  <!-- Navigation -->
  <ul class="navbar-nav ml-auto">
          <!-- Navigation -->
  <nav class="navbar navbar-expand-lg text-uppercase copyright" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">Welcome</a>
      <a class="navbar-brand js-scroll-trigger" href="#page-top">${staff.fname} </a>
     
      <a class="navbar-brand js-scroll-trigger" href="#page-top">Staff No:${staff.staffId} </a>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          
          <li class="nav-item mx-0 mx-lg-1">
              <a href="#"  data-toggle="dropdown"><img src="images/user.png"><span class="dropdown-toggle"></span>                       
              <div class="dropdown-menu dropdown-menu-right user-dd animated">
                            <a class="dropdown-item" href="#ViewProfile"><span class="fa fa-user"></span> My Profile</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="newlogin.jsp"><i class="fa fa-power-off m-r-5 m-l-5"></i> Logout</a>
              </div>
              </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
      
      </ul>
     
      
  <div id="wrapper">

   
  <ul class="navbar-nav bg-gradient-primary sidebar sidebar-brand-text accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="supervisorUI.jsp">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-folder"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Home</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item">
        <a class="nav-link" href="supervisorUI.jsp">
          <i class="fas fa-list"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item active">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-cog"></i>
          <span>Leaves</span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="#">Allowed</a>
            <a class="collapse-item" href="#">Pending</a>
            <a class="collapse-item" href="leaveapplication.jsp">Apply A Leave</a>
          </div>
        </div>
      </li>

      
      <!-- Divider -->
      <hr class="sidebar-divider">

      <li class="nav-item">
        <a class="nav-link" href="jobvacancy.jsp">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>Job Vacancies</span></a>
      </li>
      <hr class="sidebar-divider">

        </ul> 

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">
    
            <section class="page-section bg-gradient-info text-white mb-0" id="about">

            <div class="container">

      <!-- About Section Heading -->
      <h2 class="page-section-heading text-center text-uppercase text-white">Applied Leaves</h2>
      <!-- Icon Divider -->
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>
      <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">StaffId</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=staffId%></p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Leave Type</p>
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
          <p class="lead">Leave Days</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=leaveDays%></p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Remaining Days</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead"><%=remainingDays%></p>
        </div>
      </div>
                
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Comment</p>
        </div>
        <div class="col-lg-4 mr-auto">
                        <form action="DeclineLeavesServlet" method="post">
          <p class="lead"><input type="textarea" name="comment" required></p>
        </div>
        </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
            <form action="DeclineLeavesServlet" method="post">
                    <input type="hidden" name="type" value="<%=type%>">
                    <input type="hidden" name="staffId" value="<%=staffId%>">
                    <input type="hidden" name="leaveDays" value="<%=leaveDays%>">
                    <input type="hidden" name="start" value="<%=start%>">
                    <input type="hidden" name="end" value="<%=end%>">
                    <input type="hidden" name="remainingDays" value="<%=remainingDays%>">
          <p class="lead"><button>Decline</button></form>
                </p>
        </div>
        <div class="col-lg-4 mr-auto">
            <form action="AcceptLeavesServlet" method="post">
                    <input type="hidden" name="type" value="<%=type%>">
                    <input type="hidden" name="staffId" value="<%=staffId%>">
                    <input type="hidden" name="leaveDays" value="<%=leaveDays%>">
                    <input type="hidden" name="start" value="<%=start%>">
                    <input type="hidden" name="end" value="<%=end%>">
                    <input type="hidden" name="remainingDays" value="<%=remainingDays%>">
          <p class="lead"><button>Accept</button></p>
            
        </div>
        </div>
        </form>
   
    </section>
          
      </div>
   </div>

  </div>
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


