package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jobvacancy_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>EvaMay Technologies</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .hide {\n");
      out.write("            display: none\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('images/office2.jpg');\">\n");
      out.write("                <div class=\"wrap-login100\">\n");
      out.write("                    <form class=\"form-container\" method=\"post\" action=\"AddJobServlet\">\n");
      out.write("                        <span class=\"login100-form-logo\">\n");
      out.write("                            <img src='images/logo2.png' alt='logo' width=\"200%\" height=\"100%\">\n");
      out.write("\t\t\t</span>\n");
      out.write("                        <span class=\"login100-form-title p-b-34 p-t-27\">\n");
      out.write("                            Job Vacancy\n");
      out.write("\t\t\t</span>\n");
      out.write("                        \n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                            <label for=\"department\">Department</label>\n");
      out.write("                            <select class=\"input100\" id=\"department_select\" name=\"department\">\n");
      out.write("                                <option value=\"Marketing\">Marketing</option>\n");
      out.write("                                <option value=\"Accounting and Finance\">Accounting and Finance</option>\n");
      out.write("                                <option value=\"Technology\">Technology</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                            <label for=\"section\">Section</label>\n");
      out.write("                            <select class=\"input100\" id=\"section_select\" name=\"section\">\n");
      out.write("                                <option value=\"Public Relations\" department=\"Marketing\">Public Relations</option>\n");
      out.write("                                <option value=\"Sales\" department=\"Marketing\">Sales</option>\n");
      out.write("                                <option value=\"Accounting\" department=\"Accounting and Finance\" class=\"hide\">Accounting</option>\n");
      out.write("                                <option value=\"Payrolls\" department=\"Accounting and Finance\" class=\"hide\">Payrolls</option>\n");
      out.write("                                <option value=\"Web\" department=\"Technology\" class=\"hide\">Web</option>\n");
      out.write("                                <option value=\"Network Management\" department=\"Technology\" class=\"hide\">Network Management</option>\n");
      out.write("                                <option value=\"Data Security\" department=\"Technology\" class=\"hide\">Data Security</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"title\">Title:</label>\n");
      out.write("                            <select class=\"input100\" id=\"title\" name=\"title\">\n");
      out.write("                                <option value=\"Senior staff\">Senior staff</option>\n");
      out.write("                                <option value=\"Junior Staff\">Junior staff</option>\n");
      out.write("                            </select>                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"type\">Type:</label>\n");
      out.write("                          <select class=\"input100\" id=\"type\" name=\"type\">\n");
      out.write("                                <option value=\"Permanent\">Permanent</option>\n");
      out.write("                                <option value=\"Contract\">Contract</option>\n");
      out.write("                                <option value=\"Internship\">Internship</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"startDate\">Start Date:</label>\n");
      out.write("                          <input type=\"date\" class=\"input100\" name=\"startDate\" id=\"startDate\" placeholder=\"Start Date\" required>\n");
      out.write("                        </div> \n");
      out.write("                        \n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"endDate\">End Date:</label>\n");
      out.write("                          <input type=\"date\" class=\"input100\" name=\"endDate\" id=\"endDate\" placeholder=\"End Date\"  required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"qualifications\">Qualifications</label>\n");
      out.write("                          <input type=\"textarea\" class=\"input100\" id=\"qualifications\" name=\"qualifications\" placeholder=\"Qualifications\" required>\n");
      out.write("                        </div>\n");
      out.write("                         <br>\n");
      out.write("                        <center>\n");
      out.write("                            <button type=\"submit\" class=\"login100-form-btn\">Next</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                        <center>\n");
      out.write("                            <a href=\"home.jsp\">\n");
      out.write("                                <button type=\"submit\" class=\"login100-form-btn\">Cancel Registration</button>\n");
      out.write("                            </a>\n");
      out.write("                        </center>\n");
      out.write("                   \n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("        <script>\n");
      out.write("document.getElementById('department_select').addEventListener(\"change\", function() {\n");
      out.write("  var val = this.value;\n");
      out.write("  var options = document.getElementById('section_select').options;\n");
      out.write("  var new_val = null;\n");
      out.write("  for (var i = 0 ; i < options.length; i++) {\n");
      out.write("    if (options[i].attributes[\"department\"].value === val) {\n");
      out.write("      if (!new_val) {\n");
      out.write("        new_val = options[i].value;\n");
      out.write("      }\n");
      out.write("      options[i].classList.remove(\"hide\");\n");
      out.write("    } else {\n");
      out.write("      options[i].classList.add(\"hide\");\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  document.getElementById('section_select').value = new_val;\n");
      out.write("});\n");
      out.write("                    </script>\n");
      out.write("                    <script>\n");
      out.write("      const picker=document.getElementById('startDate');\n");
      out.write("      picker.addEventListener('input', function(e){\n");
      out.write("           var date1=new Date(this.value).getTime();\n");
      out.write("           var date2=new Date().getTime();      //Today's date\n");
      out.write("           if(date1<date2){                 \n");
      out.write("               e.preventDefault();\n");
      out.write("               this.value='';\n");
      out.write("               alert('You cannot choose a past date!!!');\n");
      out.write("           }       \n");
      out.write("\n");
      out.write("       });           \n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("      const picker1=document.getElementById('endDate');\n");
      out.write("      picker1.addEventListener('input', function(e){\n");
      out.write("           var date1=new Date(this.value).getTime();\n");
      out.write("           var date2=new Date().getTime();      //Today's date\n");
      out.write("           if(date1<date2){                 \n");
      out.write("               e.preventDefault();\n");
      out.write("               this.value='';\n");
      out.write("               alert('You cannot choose a past date!!!');\n");
      out.write("           }       \n");
      out.write("\n");
      out.write("       });           \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
