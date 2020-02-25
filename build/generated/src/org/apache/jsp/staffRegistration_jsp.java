package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Staff Registration</title>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\r\n");
      out.write("   \r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"css/studentRegistration.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid bg\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-2 col-sm-4 col-xs-12\"></div>\r\n");
      out.write("            <div class=\"col-md-2 col-sm-4 col-xs-12\">\r\n");
      out.write("                <p><i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</i></p>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\t<!-- Form Start -->\r\n");
      out.write("            <form class=\"form-container\" method=\"post\" action=\"AddStaffServlet\" name=\"staff_registration_form\" id=\"staff_registration_form\" onsubmit=\"return validateForm()\">\r\n");
      out.write("                <h1>Staff Registration Form</h1>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"staffId\">Staff Number:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"staffId\" name=\"staffId\" placeholder=\"Staff Number\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"lname\">Last Name:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"lname\" name=\"lname\" placeholder=\"Last Name\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"fname\">First Name:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"fname\" name=\"fname\" placeholder=\"First Name\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"mname\">Middle name:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"mname\" name=\"mname\" placeholder=\"Middle Name\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"designation\">Designation:</label>\r\n");
      out.write("                    <select class=\"form-control\" id=\"designation\" name=\"designation\">\r\n");
      out.write("                        <option>Staff</option>\r\n");
      out.write("                        <option>Supervisor</option>\r\n");
      out.write("                        <option>Overall Manager</option>\r\n");
      out.write("                        <option>HR Manager</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"password\">Password</label>\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-success btn-block\">Submit</button>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger btn-block\" onClick=\"window.location.href='login.jsp'\">Back</button>\r\n");
      out.write("            </form>\r\n");
      out.write("\t\t\t\t<!-- Form End-->\r\n");
      out.write("            <script>\r\n");
      out.write("                function validateForm()                                    \r\n");
      out.write("                    { \r\n");
      out.write("                \t\tvar staffId = document.forms[\"staff_registration_form\"][\"staffId\"];\r\n");
      out.write("                        var fname = document.forms[\"staff_registration_form\"][\"fname\"];               \r\n");
      out.write("                        var lname = document.forms[\"staff_registration_form\"][\"lname\"];\r\n");
      out.write("                        var mname = document.forms[\"staff_registration_form\"][\"mname\"];\r\n");
      out.write("                        var password = document.forms[\"staff_registration_form\"][\"password\"];\r\n");
      out.write("    \r\n");
      out.write("                        if (staffId.value == \"\")                                  \r\n");
      out.write("                        { \r\n");
      out.write("                            window.alert(\"Please enter your Staff Number.\"); \r\n");
      out.write("                            staffId.focus(); \r\n");
      out.write("                            return false; \r\n");
      out.write("                        } \r\n");
      out.write("\r\n");
      out.write("                        if (fname.value == \"\")                                  \r\n");
      out.write("                        { \r\n");
      out.write("                            window.alert(\"Please enter your First Name.\"); \r\n");
      out.write("                            fname.focus(); \r\n");
      out.write("                            return false; \r\n");
      out.write("                        } \r\n");
      out.write("\r\n");
      out.write("                        if (lname.value == \"\")                                  \r\n");
      out.write("                        { \r\n");
      out.write("                            window.alert(\"Please enter your Last Name.\"); \r\n");
      out.write("                            lname.focus(); \r\n");
      out.write("                            return false; \r\n");
      out.write("                        }\r\n");
      out.write("                        \r\n");
      out.write("                        if (password.value == \"\")                        \r\n");
      out.write("                        { \r\n");
      out.write("                            window.alert(\"Please enter your Password.\"); \r\n");
      out.write("                            password.focus(); \r\n");
      out.write("                            return false; \r\n");
      out.write("                        } \r\n");
      out.write("                        if (password.value != staffId.value) \r\n");
      out.write("                        {\r\n");
      out.write("                           \r\n");
      out.write("                            window.alert(\"Password do not match Staff Number.\");\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        return true; \r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("\t       </script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
