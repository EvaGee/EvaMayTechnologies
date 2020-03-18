package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leaveapplication_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("\t<title>EvaMay Technologies</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('images/office2.jpg');\">\n");
      out.write("\t\t<div class=\"wrap-login100\">\n");
      out.write("                    <form class=\"login100-form validate-form\" method=\"post\" action=\"LoginServlet\" name=\"login_form\" id=\"login_form\" onsubmit=\"return validateForm()\">\n");
      out.write("\t\t\t<span class=\"login100-form-logo\">\n");
      out.write("                            <img src='images/logo2.png' alt='logo' width=\"200%\" height=\"100%\">\n");
      out.write("\t\t\t</span>\n");
      out.write("                        <span class=\"login100-form-title p-b-34 p-t-27\">\n");
      out.write("                            Leave application\n");
      out.write("\t\t\t</span>\n");
      out.write("                        \n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <input type=\"hidden\" class=\"input100\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staff.staffId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"login100-form\">\n");
      out.write("                            <label for=\"leaveType\">Leave Type:</label>\n");
      out.write("                            <select class=\"input100\" id=\"leaveType\" name=\"Leave Type\">\n");
      out.write("                                <option>Annual</option>\n");
      out.write("                                <option>Sick</option>\n");
      out.write("                                <option>Paternity/Maternity</option\n");
      out.write("                                <option>Study</option>\n");
      out.write("                                <option>Compassionate</option>\n");
      out.write("                                <option>Sabbatical</option>\n");
      out.write("                                <option>Other</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"days\">No of days</label>\n");
      out.write("                          <input type=\"number\" class=\"input100\" name=\"days\" id=\"days\" placeholder=\"Required leave days\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"password\">Start Date:</label>\n");
      out.write("                          <input type=\"date\" class=\"input100\" name=\"startDate\" id=\"startDate\" placeholder=\"Start Date\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"password\">End date:</label>\n");
      out.write("                          <input type=\"date\" class=\"input100\" name=\"endDate\" id=\"endDate\" placeholder=\"End Date\" required>\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                        <br>\n");
      out.write("                        <center>\n");
      out.write("                              <button type=\"submit\" class=\"login100-form-btn\">Apply</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("                        <br>\n");
      out.write("                        <center>\n");
      out.write("                            <a href=\"staff.jsp\" class=\"login100-form-btn\">Cancel Application</a>\n");
      out.write("                        </center>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t function validateForm()                                    \n");
      out.write("                    { \n");
      out.write("                        var staffId = document.forms[\"login_form\"][\"staffId\"];\n");
      out.write("                        var password = document.forms[\"login_form\"][\"password\"];\n");
      out.write("    \n");
      out.write("                        if (staffId.value == \"\")                                  \n");
      out.write("                        { \n");
      out.write("                            window.alert(\"Please enter your Staff Number.\"); \n");
      out.write("                            staffId.focus(); \n");
      out.write("                            return false; \n");
      out.write("                        } \n");
      out.write("\n");
      out.write("                        if (password.value == \"\")                        \n");
      out.write("                        { \n");
      out.write("                            window.alert(\"Please enter your Password.\"); \n");
      out.write("                            password.focus(); \n");
      out.write("                            return false; \n");
      out.write("                        } \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        return true; \n");
      out.write("                    }\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
