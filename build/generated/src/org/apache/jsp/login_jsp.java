package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('images/office2.jpg');\">\n");
      out.write("\t\t<div class=\"wrap-login100\">\n");
      out.write("                    <form class=\"login100-form validate-form\" method=\"post\" action=\"PortalServlet\" name=\"login_form\" id=\"login_form\" onsubmit=\"return validateForm()\">\n");
      out.write("\t\t\t<span class=\"login100-form-logo\">\n");
      out.write("                            <img src='images/logo2.png' alt='logo' width=\"200%\" height=\"100%\">\n");
      out.write("\t\t\t</span>\n");
      out.write("                        <span class=\"login100-form-title p-b-34 p-t-27\">\n");
      out.write("                            Job Portal\n");
      out.write("\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"staffId\">Email:</label>\n");
      out.write("                          <input type=\"email\" class=\"input100\" name=\"email\" id=\"email\" placeholder=\"email\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"password\">Password:</label>\n");
      out.write("                          <input type=\"password\" class=\"input100\" name=\"password\" id=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                         <br>\n");
      out.write("                         \n");
      out.write("                        <center>\n");
      out.write("                              <button type=\"submit\" class=\"login100-form-btn\">Login</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                        <center>\n");
      out.write("                            <a href=\"register.jsp\">\n");
      out.write("                                New here?Register\n");
      out.write("                            </a>\n");
      out.write("                        </center>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("\t<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write(" $(function(){\n");
      out.write("  $(\"#staffId\").autocomplete({\n");
      out.write("      width: 300,\n");
      out.write("      max: 10,\n");
      out.write("      delay: 100,\n");
      out.write("      autoFocus: true,\n");
      out.write("      scroll: true,\n");
      out.write("      highlight: false,\n");
      out.write("      cacheLength: 1,\n");
      out.write("      source:function(request, response){\n");
      out.write("       \n");
      out.write("    $.ajax(\n");
      out.write("        {url: \"ajax3\",\n");
      out.write("            type: 'POST',\n");
      out.write("            datatype:\"json\",\n");
      out.write("            data:{staffId:request.term},\n");
      out.write("            success: function(data)\n");
      out.write("            {\n");
      out.write("            \n");
      out.write("                console.log(request.term);\n");
      out.write("                console.log(data);\n");
      out.write("                 response(JSON.parse(data));\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("   });\n");
      out.write(" }); \n");
      out.write("});\n");
      out.write("    </script>\n");
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
      out.write("   \n");
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
