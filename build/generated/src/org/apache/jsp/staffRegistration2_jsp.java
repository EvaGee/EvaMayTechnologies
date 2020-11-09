package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffRegistration2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <title>EvaMay Technologies</title>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"css/studentRegistration.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write(".hide {\r\n");
      out.write("  display: none\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         ");

             String lname=request.getParameter("lname");
             String fname=request.getParameter("fname");
             String mname=request.getParameter("mname");
             String staffId=request.getParameter("staffId");
             String gender=request.getParameter("gender");
             String email=request.getParameter("email");
             String phoneNo=request.getParameter("phoneNo");
             
             
             
             
      out.write("\r\n");
      out.write("        <div class=\"limiter\">\r\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('images/office2.jpg');\">\r\n");
      out.write("                <div class=\"wrap-login100\">\r\n");
      out.write("                    <form class=\"form-container\" method=\"post\" action=\"AddStaffServlet\" name=\"staff_registration2_form\" id=\"staff_registration2_form\">\r\n");
      out.write("                        <span class=\"login100-form-logo\">\r\n");
      out.write("                            <img src='images/logo2.png' alt='logo' width=\"200%\" height=\"100%\">\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("                        <span class=\"login100-form-title p-b-34 p-t-27\">\r\n");
      out.write("                            Staff Registration Form\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("                        <div class=\"login100-form\">\r\n");
      out.write("                            <label for=\"department\">Department</label>\r\n");
      out.write("                            <select class=\"input100\" id=\"department_select\" name=\"department\">\r\n");
      out.write("                                <option value=\"Marketing\">Marketing</option>\r\n");
      out.write("                                <option value=\"Accounting and Finance\">Accounting and Finance</option>\r\n");
      out.write("                                <option value=\"Technology\">Technology</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"login100-form\">\r\n");
      out.write("                            <label for=\"section\">Section</label>\r\n");
      out.write("                            <select class=\"input100\" id=\"section_select\" name=\"section\">\r\n");
      out.write("                                <option value=\"Public Relations\" department=\"Marketing\">Public Relations</option>\r\n");
      out.write("                                <option value=\"Sales\" department=\"Marketing\">Sales</option>\r\n");
      out.write("                                <option value=\"Accounting\" department=\"Accounting and Finance\" class=\"hide\">Accounting</option>\r\n");
      out.write("                                <option value=\"Payrolls\" department=\"Accounting and Finance\" class=\"hide\">Payrolls</option>\r\n");
      out.write("                                <option value=\"Web\" department=\"Technology\" class=\"hide\">Web</option>\r\n");
      out.write("                                <option value=\"Network Management\" department=\"Technology\" class=\"hide\">Network Management</option>\r\n");
      out.write("                                <option value=\"Data Security\" department=\"Technology\" class=\"hide\">Data Security</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"login100-form\">\r\n");
      out.write("                            <label for=\"designation\">Designation:</label>\r\n");
      out.write("                            <select class=\"input100\" id=\"designation\" name=\"designation\">\r\n");
      out.write("                                <option>Staff</option>\r\n");
      out.write("                                <option>Sectional Manager </option>\r\n");
      out.write("                                <option>Departmental Manager</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"login100-form\">\r\n");
      out.write("                          <label for=\"password\">Password:</label>\r\n");
      out.write("                          <input type=\"password\" class=\"input100\" name=\"password\" id=\"password\" placeholder=\"Password\" >\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"hidden\" name=\"lname\" id=\"lname\" value=\"");
      out.print(lname);
      out.write("\" >\r\n");
      out.write("                        <input type=\"hidden\" name=\"fname\" id=\"fname\" value=\"");
      out.print(fname);
      out.write("\" >\r\n");
      out.write("                        <input type=\"hidden\" name=\"mname\" id=\"mname\" value=\"");
      out.print(mname);
      out.write("\" >\r\n");
      out.write("                        <input type=\"hidden\" name=\"staffId\" id=\"staffId\" value=\"");
      out.print(staffId);
      out.write("\" >\r\n");
      out.write("                        <input type=\"hidden\" name=\"gender\" id=\"gender\" value=\"");
      out.print(gender);
      out.write("\" >\r\n");
      out.write("                        <input type=\"hidden\" name=\"email\" id=\"email\" value=\"");
      out.print(email);
      out.write("\" >\r\n");
      out.write("                        <input type=\"hidden\" name=\"phoneNo\" id=\"phoneNo\" value=\"");
      out.print(phoneNo);
      out.write("\" >\r\n");
      out.write("                            \r\n");
      out.write("                         <br>\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <button type=\"submit\" class=\"login100-form-btn\">Register</button>\r\n");
      out.write("                        </center>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <br>\r\n");
      out.write("                        <center>\r\n");
      out.write("                            \r\n");
      out.write("                                <button type=\"submit\" class=\"login100-form-btn\" onclick=\"history.back()\">Back</button>\r\n");
      out.write("                           \r\n");
      out.write("                        </center>\r\n");
      out.write("                    <script>\r\n");
      out.write("                        function validateForm()                                    \r\n");
      out.write("                            { \r\n");
      out.write("                                var staffId = document.forms[\"staff_registration_form\"][\"staffId\"];\r\n");
      out.write("                                var fname = document.forms[\"staff_registration_form\"][\"fname\"];               \r\n");
      out.write("                                var lname = document.forms[\"staff_registration_form\"][\"lname\"];\r\n");
      out.write("                                var mname = document.forms[\"staff_registration_form\"][\"mname\"];\r\n");
      out.write("                                var password = document.forms[\"staff_registration_form\"][\"password\"];\r\n");
      out.write("\r\n");
      out.write("                                if (staffId.value == \"\")                                  \r\n");
      out.write("                                { \r\n");
      out.write("                                    window.alert(\"Please enter your Staff Number.\"); \r\n");
      out.write("                                    staffId.focus(); \r\n");
      out.write("                                    return false; \r\n");
      out.write("                                } \r\n");
      out.write("\r\n");
      out.write("                                if (fname.value == \"\")                                  \r\n");
      out.write("                                { \r\n");
      out.write("                                    window.alert(\"Please enter your First Name.\"); \r\n");
      out.write("                                    fname.focus(); \r\n");
      out.write("                                    return false; \r\n");
      out.write("                                } \r\n");
      out.write("                                \r\n");
      out.write("                                if (lname.value == \"\")                                  \r\n");
      out.write("                                { \r\n");
      out.write("                                    window.alert(\"Please enter your Last Name.\"); \r\n");
      out.write("                                    lname.focus(); \r\n");
      out.write("                                    return false; \r\n");
      out.write("                                } \r\n");
      out.write("                             \r\n");
      out.write("\r\n");
      out.write("                                if (password.value == \"\")                        \r\n");
      out.write("                                { \r\n");
      out.write("                                    window.alert(\"Please enter your Password.\"); \r\n");
      out.write("                                    password.focus(); \r\n");
      out.write("                                    return false; \r\n");
      out.write("                                } \r\n");
      out.write("                                if (password.value != staffId.value) \r\n");
      out.write("                                {\r\n");
      out.write("\r\n");
      out.write("                                    window.alert(\"Password do not match Staff Number.\");\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                return true; \r\n");
      out.write("                            }\r\n");
      out.write("                    </script>\r\n");
      out.write("                    <script>\r\n");
      out.write("document.getElementById('department_select').addEventListener(\"change\", function() {\r\n");
      out.write("  var val = this.value;\r\n");
      out.write("  var options = document.getElementById('section_select').options;\r\n");
      out.write("  var new_val = null;\r\n");
      out.write("  for (var i = 0 ; i < options.length; i++) {\r\n");
      out.write("    if (options[i].attributes[\"department\"].value === val) {\r\n");
      out.write("      if (!new_val) {\r\n");
      out.write("        new_val = options[i].value;\r\n");
      out.write("      }\r\n");
      out.write("      options[i].classList.remove(\"hide\");\r\n");
      out.write("    } else {\r\n");
      out.write("      options[i].classList.add(\"hide\");\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  document.getElementById('section_select').value = new_val;\r\n");
      out.write("});\r\n");
      out.write("                    </script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </body>\r\n");
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
