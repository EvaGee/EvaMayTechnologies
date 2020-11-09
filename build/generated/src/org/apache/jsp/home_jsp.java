package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("   ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("  <title>EvaMay Technologies</title>\r\n");
      out.write("   <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\r\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"css/freelancer.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Navigation -->\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg copyright text-uppercase fixed-top\" id=\"mainNav\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">\r\n");
      out.write("          EVAMAY TECHNOLOGIES\r\n");
      out.write("      </a>\r\n");
      out.write("     \r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#home\">Home</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#about\">About</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contacts\">Contacts</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#vacancies\">Vacancies</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"newlogin.jsp\">Login</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <!-- Masthead -->\r\n");
      out.write("  <header class=\"masthead bg-secondary text-warning text-center\">\r\n");
      out.write("    <div class=\"container d-flex align-items-center flex-column\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Masthead Avatar Image -->\r\n");
      out.write("      <img class=\"masthead-avatar mb-5\" src=\"img/avataaars.svg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Masthead Heading -->\r\n");
      out.write("      <h1 class=\"masthead-heading text-uppercase mb-0\">Start Bootstrap</h1>\r\n");
      out.write("\r\n");
      out.write("      <!-- Icon Divider -->\r\n");
      out.write("      <div class=\"divider-custom divider-light\">\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("        <div class=\"divider-custom-icon\">\r\n");
      out.write("          <i class=\"fas fa-star\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Masthead Subheading -->\r\n");
      out.write("      <p class=\"masthead-subheading font-weight-light mb-0\">Graphic Artist - Web Designer - Illustrator</p>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Section -->\r\n");
      out.write("  <section class=\"page-section portfolio\" id=\"home\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Portfolio Section Heading -->\r\n");
      out.write("      <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Portfolio</h2>\r\n");
      out.write("\r\n");
      out.write("      <!-- Icon Divider -->\r\n");
      out.write("      <div class=\"divider-custom\">\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("        <div class=\"divider-custom-icon\">\r\n");
      out.write("          <i class=\"fas fa-star\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Portfolio Grid Items -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Portfolio Item 1 -->\r\n");
      out.write("        <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("          <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal1\">\r\n");
      out.write("            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\r\n");
      out.write("              <div class=\"portfolio-item-caption-content text-center text-white\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"img/portfolio/cabin.png\" alt=\"\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Portfolio Item 2 -->\r\n");
      out.write("        <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("          <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal2\">\r\n");
      out.write("            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\r\n");
      out.write("              <div class=\"portfolio-item-caption-content text-center text-white\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"img/portfolio/cake.png\" alt=\"\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Portfolio Item 3 -->\r\n");
      out.write("        <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("          <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal3\">\r\n");
      out.write("            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\r\n");
      out.write("              <div class=\"portfolio-item-caption-content text-center text-white\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"img/portfolio/circus.png\" alt=\"\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Portfolio Item 4 -->\r\n");
      out.write("        <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("          <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal4\">\r\n");
      out.write("            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\r\n");
      out.write("              <div class=\"portfolio-item-caption-content text-center text-white\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"img/portfolio/game.png\" alt=\"\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Portfolio Item 5 -->\r\n");
      out.write("        <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("          <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal5\">\r\n");
      out.write("            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\r\n");
      out.write("              <div class=\"portfolio-item-caption-content text-center text-white\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"img/portfolio/safe.png\" alt=\"\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Portfolio Item 6 -->\r\n");
      out.write("        <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("          <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal6\">\r\n");
      out.write("            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\r\n");
      out.write("              <div class=\"portfolio-item-caption-content text-center text-white\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"img/portfolio/submarine.png\" alt=\"\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- About Section -->\r\n");
      out.write("  <section class=\"page-section bg-primary text-white mb-0\" id=\"about\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <!-- About Section Heading -->\r\n");
      out.write("      <h2 class=\"page-section-heading text-center text-uppercase text-white\">About</h2>\r\n");
      out.write("\r\n");
      out.write("      <!-- Icon Divider -->\r\n");
      out.write("      <div class=\"divider-custom divider-light\">\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("        <div class=\"divider-custom-icon\">\r\n");
      out.write("          <i class=\"fas fa-star\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- About Section Content -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-4 ml-auto\">\r\n");
      out.write("          <p class=\"lead\">Freelancer is a free bootstrap theme created by Start Bootstrap. The download includes the complete source files including HTML, CSS, and JavaScript as well as optional SASS stylesheets for easy customization.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4 mr-auto\">\r\n");
      out.write("          <p class=\"lead\">You can create your own custom avatar for the masthead, change the icon in the dividers, and add your email address to the contact form to make it fully functional!</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- About Section Button -->\r\n");
      out.write("      <div class=\"text-center mt-4\">\r\n");
      out.write("        <a class=\"btn btn-xl btn-outline-light\" href=\"https://startbootstrap.com/themes/freelancer/\">\r\n");
      out.write("          <i class=\"fas fa-download mr-2\"></i>\r\n");
      out.write("          Free Download!\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- Contact Section -->\r\n");
      out.write("  <section class=\"page-section\" id=\"contacts\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Contact Section Heading -->\r\n");
      out.write("      <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Contact Me</h2>\r\n");
      out.write("\r\n");
      out.write("      <!-- Icon Divider -->\r\n");
      out.write("      <div class=\"divider-custom\">\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("        <div class=\"divider-custom-icon\">\r\n");
      out.write("          <i class=\"fas fa-star\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Contact Section Form -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-4 ml-auto\">\r\n");
      out.write("          <i class=\"glyphicon glyphicon-phone\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("          <p class=\"lead\">Phone number:(+254)0 742 098 588</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4 mr-auto\">\r\n");
      out.write("           <i class=\"glyphicon glyphicon-envelope\"></i>\r\n");
      out.write("          <p class=\"lead\">Email:info@evamaytechnologies.com</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Contact Section -->\r\n");
      out.write("  <section class=\"page-section bg-primary text-white mb-0\" id=\"vacancies\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Contact Section Heading -->\r\n");
      out.write("      <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Here are job vacancies</h2>\r\n");
      out.write("\r\n");
      out.write("      <!-- Icon Divider -->\r\n");
      out.write("      <div class=\"divider-custom\">\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("        <div class=\"divider-custom-icon\">\r\n");
      out.write("          <i class=\"fas fa-star\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"divider-custom-line\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  <footer class=\"footer text-center\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer Location -->\r\n");
      out.write("        <div class=\"col-lg-4 mb-5 mb-lg-0\">\r\n");
      out.write("          <h4 class=\"text-uppercase mb-4\">Location</h4>\r\n");
      out.write("          <p class=\"lead mb-0\">Brilliant Towers\r\n");
      out.write("            <br>8th Floor, Room 803</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer Social Icons -->\r\n");
      out.write("        <div class=\"col-lg-4 mb-5 mb-lg-0\">\r\n");
      out.write("          <h4 class=\"text-uppercase mb-4\">Around the Web</h4>\r\n");
      out.write("          <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#\">\r\n");
      out.write("            <i class=\"fab fa-fw fa-facebook-f\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#\">\r\n");
      out.write("            <i class=\"fab fa-fw fa-twitter\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#\">\r\n");
      out.write("            <i class=\"fab fa-fw fa-linkedin-in\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#\">\r\n");
      out.write("            <i class=\"fab fa-fw fa-dribbble\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer About Text -->\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <h4 class=\"text-uppercase mb-4\">About Freelancer</h4>\r\n");
      out.write("          <p class=\"lead mb-0\">Freelance is a free to use, MIT licensed Bootstrap theme created by\r\n");
      out.write("            <a href=\"http://startbootstrap.com\">Start Bootstrap</a>.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright Section -->\r\n");
      out.write("  <section class=\"copyright py-4 text-center text-white fixed-bottom\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <small>Copyright &copy; EvaMay Technologies 2020</small>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->\r\n");
      out.write("  <div class=\"scroll-to-top d-lg-none position-fixed \">\r\n");
      out.write("    <a class=\"js-scroll-trigger d-block text-center text-white rounded\" href=\"#page-top\">\r\n");
      out.write("      <i class=\"fa fa-chevron-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Modals -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Modal 1 -->\r\n");
      out.write("  <div class=\"portfolio-modal modal fade\" id=\"portfolioModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal1Label\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">\r\n");
      out.write("            <i class=\"fas fa-times\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"modal-body text-center\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-lg-8\">\r\n");
      out.write("                <!-- Portfolio Modal - Title -->\r\n");
      out.write("                <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\">Log Cabin</h2>\r\n");
      out.write("                <!-- Icon Divider -->\r\n");
      out.write("                <div class=\"divider-custom\">\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                  <div class=\"divider-custom-icon\">\r\n");
      out.write("                    <i class=\"fas fa-star\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Portfolio Modal - Image -->\r\n");
      out.write("                <img class=\"img-fluid rounded mb-5\" src=\"img/portfolio/cabin.png\" alt=\"\">\r\n");
      out.write("                <!-- Portfolio Modal - Text -->\r\n");
      out.write("                <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\r\n");
      out.write("                <button class=\"btn btn-primary\" href=\"#\" data-dismiss=\"modal\">\r\n");
      out.write("                  <i class=\"fas fa-times fa-fw\"></i>\r\n");
      out.write("                  Close Window\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Modal 2 -->\r\n");
      out.write("  <div class=\"portfolio-modal modal fade\" id=\"portfolioModal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal2Label\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">\r\n");
      out.write("            <i class=\"fas fa-times\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"modal-body text-center\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-lg-8\">\r\n");
      out.write("                <!-- Portfolio Modal - Title -->\r\n");
      out.write("                <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\">Tasty Cake</h2>\r\n");
      out.write("                <!-- Icon Divider -->\r\n");
      out.write("                <div class=\"divider-custom\">\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                  <div class=\"divider-custom-icon\">\r\n");
      out.write("                    <i class=\"fas fa-star\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Portfolio Modal - Image -->\r\n");
      out.write("                <img class=\"img-fluid rounded mb-5\" src=\"img/portfolio/cake.png\" alt=\"\">\r\n");
      out.write("                <!-- Portfolio Modal - Text -->\r\n");
      out.write("                <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\r\n");
      out.write("                <button class=\"btn btn-primary\" href=\"#\" data-dismiss=\"modal\">\r\n");
      out.write("                  <i class=\"fas fa-times fa-fw\"></i>\r\n");
      out.write("                  Close Window\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Modal 3 -->\r\n");
      out.write("  <div class=\"portfolio-modal modal fade\" id=\"portfolioModal3\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal3Label\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">\r\n");
      out.write("            <i class=\"fas fa-times\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"modal-body text-center\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-lg-8\">\r\n");
      out.write("                <!-- Portfolio Modal - Title -->\r\n");
      out.write("                <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\">Circus Tent</h2>\r\n");
      out.write("                <!-- Icon Divider -->\r\n");
      out.write("                <div class=\"divider-custom\">\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                  <div class=\"divider-custom-icon\">\r\n");
      out.write("                    <i class=\"fas fa-star\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Portfolio Modal - Image -->\r\n");
      out.write("                <img class=\"img-fluid rounded mb-5\" src=\"img/portfolio/circus.png\" alt=\"\">\r\n");
      out.write("                <!-- Portfolio Modal - Text -->\r\n");
      out.write("                <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\r\n");
      out.write("                <button class=\"btn btn-primary\" href=\"#\" data-dismiss=\"modal\">\r\n");
      out.write("                  <i class=\"fas fa-times fa-fw\"></i>\r\n");
      out.write("                  Close Window\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Modal 4 -->\r\n");
      out.write("  <div class=\"portfolio-modal modal fade\" id=\"portfolioModal4\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal4Label\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">\r\n");
      out.write("            <i class=\"fas fa-times\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"modal-body text-center\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-lg-8\">\r\n");
      out.write("                <!-- Portfolio Modal - Title -->\r\n");
      out.write("                <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\">Controller</h2>\r\n");
      out.write("                <!-- Icon Divider -->\r\n");
      out.write("                <div class=\"divider-custom\">\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                  <div class=\"divider-custom-icon\">\r\n");
      out.write("                    <i class=\"fas fa-star\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Portfolio Modal - Image -->\r\n");
      out.write("                <img class=\"img-fluid rounded mb-5\" src=\"img/portfolio/game.png\" alt=\"\">\r\n");
      out.write("                <!-- Portfolio Modal - Text -->\r\n");
      out.write("                <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\r\n");
      out.write("                <button class=\"btn btn-primary\" href=\"#\" data-dismiss=\"modal\">\r\n");
      out.write("                  <i class=\"fas fa-times fa-fw\"></i>\r\n");
      out.write("                  Close Window\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Modal 5 -->\r\n");
      out.write("  <div class=\"portfolio-modal modal fade\" id=\"portfolioModal5\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal5Label\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">\r\n");
      out.write("            <i class=\"fas fa-times\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"modal-body text-center\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-lg-8\">\r\n");
      out.write("                <!-- Portfolio Modal - Title -->\r\n");
      out.write("                <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\">Locked Safe</h2>\r\n");
      out.write("                <!-- Icon Divider -->\r\n");
      out.write("                <div class=\"divider-custom\">\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                  <div class=\"divider-custom-icon\">\r\n");
      out.write("                    <i class=\"fas fa-star\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Portfolio Modal - Image -->\r\n");
      out.write("                <img class=\"img-fluid rounded mb-5\" src=\"img/portfolio/safe.png\" alt=\"\">\r\n");
      out.write("                <!-- Portfolio Modal - Text -->\r\n");
      out.write("                <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\r\n");
      out.write("                <button class=\"btn btn-primary\" href=\"#\" data-dismiss=\"modal\">\r\n");
      out.write("                  <i class=\"fas fa-times fa-fw\"></i>\r\n");
      out.write("                  Close Window\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Modal 6 -->\r\n");
      out.write("  <div class=\"portfolio-modal modal fade\" id=\"portfolioModal6\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal6Label\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">\r\n");
      out.write("            <i class=\"fas fa-times\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"modal-body text-center\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-lg-8\">\r\n");
      out.write("                <!-- Portfolio Modal - Title -->\r\n");
      out.write("                <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\">Submarine</h2>\r\n");
      out.write("                <!-- Icon Divider -->\r\n");
      out.write("                <div class=\"divider-custom\">\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                  <div class=\"divider-custom-icon\">\r\n");
      out.write("                    <i class=\"fas fa-star\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Portfolio Modal - Image -->\r\n");
      out.write("                <img class=\"img-fluid rounded mb-5\" src=\"img/portfolio/submarine.png\" alt=\"\">\r\n");
      out.write("                <!-- Portfolio Modal - Text -->\r\n");
      out.write("                <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\r\n");
      out.write("                <button class=\"btn btn-primary\" href=\"#\" data-dismiss=\"modal\">\r\n");
      out.write("                  <i class=\"fas fa-times fa-fw\"></i>\r\n");
      out.write("                  Close Window\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Plugin JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Contact Form JavaScript -->\r\n");
      out.write("  <script src=\"js/jqBootstrapValidation.js\"></script>\r\n");
      out.write("  <script src=\"js/contact_me.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for this template -->\r\n");
      out.write("  <script src=\"js/freelancer.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}