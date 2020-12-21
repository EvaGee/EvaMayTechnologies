<%-- 
    Document   : uploaddocs
    Created on : Dec 13, 2020, 1:25:47 PM
    Author     : user
--%>

<%@page import="java.text.ParseException"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">


  <title>EvaMay Technologies</title>

  <link rel="icon" type="image/png" href="images/logo2.png"/>
  <link href="css/freelancer.css" rel="stylesheet">
     <link href="css/sb-admin-2.css" rel="stylesheet">

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template-->
   

  
       
</head>

<body id="page-top">

  <!-- Navigation -->
  <ul class="navbar-nav ml-auto">
          <!-- Navigation -->
  <nav class="navbar navbar-expand-lg text-uppercase copyright" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">Welcome</a>
      <a class="navbar-brand js-scroll-trigger" href="#page-top">${interviewee.fname} </a>
     
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          
          <li class="nav-item mx-0 mx-lg-1">
              <a href="#"  data-toggle="dropdown"><img src="images/user.png"><span class="dropdown-toggle"></span>                       
              <div class="dropdown-menu dropdown-menu-right user-dd animated">
                            <a class="dropdown-item" href="#ViewProfile"><span class="fa fa-user"></span> My Profile</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="login.jsp"><i class="fa fa-power-off m-r-5 m-l-5"></i> Logout</a>
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
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="staff.jsp">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-folder"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Home</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href="staff.jsp">
          <i class="fas fa-list"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      
      <hr class="sidebar-divider">

      <li class="nav-item">
        <a class="nav-link" href="home.jsp">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>Job Vacancies</span></a>
      </li>
      <hr class="sidebar-divider">

        </ul> 

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">
    
            <section class="page-section bg-info text-white mb-0" id="about">

            <div class="container">


      <h2 class="page-section-heading text-center text-uppercase text-white mb-0">job vacancies</h2>
      <div class="divider-custom">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
        </div>

       <table class="table table-secondary container">
                <thead>
                 <tr>
                    <th scope="col">Job Type</th>
                    <th scope="col">Posting Title</th>
                    <th scope="col">Opening Date</th>
                    <th scope="col">Closing Date</th>
                  </tr>
                  
                </thead>
                <tbody>
                   <%
                       Connection con;
                        PreparedStatement st;
                        ResultSet rs;

                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
                        st = con.prepareStatement("SELECT * FROM jobvacancies");
                        
                        rs=st.executeQuery();
                        
                        while(rs.next()){
                            String eDate=rs.getString("end");
                            SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date_d=null;
        LocalDate today_l = LocalDate.now();
        Date today = java.sql.Date.valueOf(today_l);
        
        try {
                date_d = sdformat.parse(eDate);
                } 
        catch (ParseException ex) {
                 System.out.println("error parsing it");   
                }
        if(date_d.compareTo(today)>=0){
                   
                   %>
                   
                  <tr> 
                      
                    <td><%=rs.getString("type")%></td>
                    <td><%=rs.getString("title")%></td>
                    <td><%=rs.getString("start")%></td>
                    <td><%=rs.getString("end")%></td>
                <form action="uploaddocs.jsp" method="post">
                    <input type="hidden" name="idNo" value="<%=rs.getString("idNo")%>">
                    <input type="hidden" name="email" value="${interviewee.email}">
                    <td><button>Apply now</button></td>
                </form>
                
                  </tr>
                  <%
        }
                        }
           
            %>
                </tbody>
            </table>

     
            </div>
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


