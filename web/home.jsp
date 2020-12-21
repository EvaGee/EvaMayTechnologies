   <%@page import="java.time.LocalDate"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%-- 
    Document   : home
    Created on : Mar 13, 2020, 1:48:54 PM
    Author     : Eva
--%>

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

  <header class="page-section bg-secondary text-white mb-0" id="home">
      <h1 class="page-section-heading text-uppercase text-center text-warning">EvaMay Technologies</h1>
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>
      <div class="container">
        <div class="row">
                <div class="col-sm-4">
        <img src="images/software2.jpg" height="250px" width="250px">
        <p>Software Development</p>
                </div>
                <div class="col-sm-4">
        <img src="images/web1.jpg" height="250px" width="250px">
        <p>Web Development</p>
                </div>
                <div class="col-sm-4">
        <img src="images/mobile.jpg" height="250px" width="250px">
        <p>Mobile Development</p>
                </div>
        </div>
      </div>
      <p class="masthead-subheading font-weight-light mb-0">
          
      </p>
  </header>

  <!-- Portfolio Section -->
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
                <form action="jobapplication.jsp" method="post">
                    <input type="hidden" name="type" value="<%=rs.getString("type")%>">
                    <input type="hidden" name="title" value="<%=rs.getString("title")%>">
                    <input type="hidden" name="start" value="<%=rs.getString("start")%>">
                    <input type="hidden" name="end" value="<%=rs.getString("end")%>">                    
                    <input type="hidden" name="duties" value="<%=rs.getString("duties")%>">
                    <input type="hidden" name="qualifications" value="<%=rs.getString("qualifications")%>">
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
  <section class="copyright py-4 text-center text-white fixed-bottom">
    <div class="container">
      <small>Copyright &copy; EvaMay Technologies 2020</small>
    </div>
  </section>

  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Contact Form JavaScript -->
  <script src="js/jqBootstrapValidation.js"></script>
  <script src="js/contact_me.js"></script>

  <!-- Custom scripts for this template -->
  <script src="js/freelancer.min.js"></script>

</body>

</html>

