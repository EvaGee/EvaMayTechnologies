package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class uploaddocs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <title>EvaMay Technologies</title>\n");
      out.write("\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\n");
      out.write("  <link href=\"css/freelancer.css\" rel=\"stylesheet\">\n");
      out.write("     <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("   \n");
      out.write("\n");
      out.write("  \n");
      out.write("       \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg text-uppercase copyright\" id=\"mainNav\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Welcome</a>\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${interviewee.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a>\n");
      out.write("     \n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          \n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\n");
      out.write("              <a href=\"#\"  data-toggle=\"dropdown\"><img src=\"images/user.png\"><span class=\"dropdown-toggle\"></span>                       \n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right user-dd animated\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#ViewProfile\"><span class=\"fa fa-user\"></span> My Profile</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"newlogin.jsp\"><i class=\"fa fa-power-off m-r-5 m-l-5\"></i> Logout</a>\n");
      out.write("              </div>\n");
      out.write("              </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("      \n");
      out.write("      </ul>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("  <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-brand-text accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar - Brand -->\n");
      out.write("      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"staff.jsp\">\n");
      out.write("        <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("          <i class=\"fas fa-folder\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">Home</div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Dashboard -->\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"staff.jsp\">\n");
      out.write("          <i class=\"fas fa-list\"></i>\n");
      out.write("          <span>Dashboard</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("          <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("          <span>Leaves</span>\n");
      out.write("        </a>\n");
      out.write("        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("            <a class=\"collapse-item\" href=\"#\">Allowed</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"pendingLeaves.jsp\">Pending</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"leaveapplication.jsp\">Apply A Leave</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      \n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"jobvacancy.jsp\">\n");
      out.write("          <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("          <span>Job Vacancies</span></a>\n");
      out.write("      </li>\n");
      out.write("      <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("        </ul> \n");
      out.write("\n");
      out.write("    <!-- Content Wrapper -->\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("       <section class=\"page-section bg-secondary text-white mb-0\" id=\"vacancies\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h2 class=\"page-section-heading text-center text-uppercase text-white mb-0\">job vacancies</h2>\n");
      out.write("      <div class=\"divider-custom divider-light\">\n");
      out.write("        <div class=\"divider-custom-line\"></div>\n");
      out.write("        <div class=\"divider-custom-icon\">\n");
      out.write("          <i class=\"fas fa-star\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"divider-custom-line\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("       <table class=\"table table-secondary container\">\n");
      out.write("                <thead>\n");
      out.write("                 <tr>\n");
      out.write("                    <th scope=\"col\">Job Type</th>\n");
      out.write("                    <th scope=\"col\">Posting Title</th>\n");
      out.write("                    <th scope=\"col\">Opening Date</th>\n");
      out.write("                    <th scope=\"col\">Closing Date</th>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                   ");

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
                   
                   
      out.write("\n");
      out.write("                   \n");
      out.write("                  <tr>  \n");
      out.write("                      \n");
      out.write("                    <td>");
      out.print(rs.getString("type"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("title"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("start"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("end"));
      out.write("</td>\n");
      out.write("                <form action=\"jobapplication.jsp\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"type\" value=\"");
      out.print(rs.getString("type"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"title\" value=\"");
      out.print(rs.getString("title"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"start\" value=\"");
      out.print(rs.getString("start"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"end\" value=\"");
      out.print(rs.getString("end"));
      out.write("\">                    \n");
      out.write("                    <input type=\"hidden\" name=\"duties\" value=\"");
      out.print(rs.getString("duties"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"qualifications\" value=\"");
      out.print(rs.getString("qualifications"));
      out.write("\">\n");
      out.write("                    <td><button>Apply now</button></td>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                  </tr>\n");
      out.write("                  ");

        }
                        }
           
            
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("     \n");
      out.write("            </div>\n");
      out.write("    </section>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- Copyright Section -->\n");
      out.write("  <section class=\"copyright py-4 text-center text-white\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <big>Copyright &copy; EvaMay Technologies 2020</big>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->\n");
      out.write("  <div class=\"scroll-to-top d-lg-none position-fixed \">\n");
      out.write("    <a class=\"js-scroll-trigger d-block text-center text-white rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fa fa-chevron-up\"></i>\n");
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
      out.write("  <!-- Custom scripts for this template -->    </a>\n");
      out.write("\n");
      out.write("  <script src=\"js/freelancer.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
