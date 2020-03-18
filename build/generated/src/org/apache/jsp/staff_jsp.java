package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>EvaMay Technologies</title>\n");
      out.write("\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/studentRegistration.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/add.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/freelancer.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/welcome.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg text-uppercase fixed-top copyright\" id=\"mainNav\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Welcome</a>\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staff.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a>\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staff.mname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a>\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staff.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a>\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Staff No:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staff.staffId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#JobVacancies\">Job Vacancies<br><span class=\"glyphicon glyphicon-briefcase\"></span></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\n");
      out.write("              <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#Leaves\">Leaves<br><span class=\"glyphicon glyphicon-calendar\"></span></a>\n");
      out.write("              \n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\n");
      out.write("              <a href=\"#\"  data-toggle=\"dropdown\"><img src=\"images/user.png\"><span class=\"dropdown-toggle\"></span></a>                        \n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right user-dd animated\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#ViewProfile\"><span class=\"glyphicon glyphicon-user\"></span> My Profile</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"newlogin.jsp\"><i class=\"fa fa-power-off m-r-5 m-l-5\"></i> Logout</a>\n");
      out.write("              </div>           \n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <nav class=\"navbar sidebar navbar-inverse\" role=\"navigation\">\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"mynav\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\">\n");
      out.write("            <a href=\"#\">Home\n");
      out.write("                <span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-home\"></span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Leaves \n");
      out.write("              <span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-calendar\"></span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu forAnimate\" role=\"menu\">\n");
      out.write("            <li><a class=\"dropdown-item copyright\" href=\"#\">Allowed</a></li>\n");
      out.write("            <li><a class=\"dropdown-item \" href=\"#\">Pending</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Apply for a leave</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>          \n");
      out.write("        <li >\n");
      out.write("            <a href=\"#\">Job Vacancies\n");
      out.write("                <span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-briefcase\"></span>\n");
      out.write("            </a>\n");
      out.write("\t</li>\n");
      out.write("    </div>   \n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Copyright Section -->\n");
      out.write("  <section class=\"copyright py-4 text-center text-white fixed-bottom\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <big>Copyright &copy; Your Website 2019</big>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->\n");
      out.write("  <div class=\"scroll-to-top d-lg-none position-fixed \">\n");
      out.write("    <a class=\"js-scroll-trigger d-block text-center text-white rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fa fa-chevron-up\"></i>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <!-- Plugin JavaScript -->\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("  <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("  <script src=\"js/contact_me.js\"></script>\n");
      out.write("  <!-- Custom scripts for this template -->\n");
      out.write("  <script src=\"js/freelancer.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
