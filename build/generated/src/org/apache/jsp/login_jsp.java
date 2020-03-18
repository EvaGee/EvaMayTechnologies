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

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head        \r\n");
      out.write("   \r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/egerton.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("    \r\n");
      out.write("    <title>EvaMay Technologies</title>\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("form { padding:0;margin:0;}\r\n");
      out.write("div#main {\r\n");
      out.write(" margin-top:100px;\r\n");
      out.write(" font-family:Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write(" font-size:15px;\r\n");
      out.write(" color:blue;\r\n");
      out.write("}\r\n");
      out.write("div.center {\r\n");
      out.write("background-repeat:no-repeat;\r\n");
      out.write("background-position:center;\r\n");
      out.write("text-align:center;\r\n");
      out.write("float: center;\r\n");
      out.write("width: 582px;\r\n");
      out.write("}\r\n");
      out.write("div#top {\r\n");
      out.write("background-image:url(images/student_top.gif);\r\n");
      out.write("height:114px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("div#mid{\r\n");
      out.write("background-image:url(images/student_mid.gif);\r\n");
      out.write("height:172px;\r\n");
      out.write("}\r\n");
      out.write("div#bot {\r\n");
      out.write("background-image:url(images/student_bottom.gif);\r\n");
      out.write("height:13px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.input {\r\n");
      out.write("text-align:left;\r\n");
      out.write("padding-left:200px;\r\n");
      out.write("border:0;\r\n");
      out.write("padding-top:5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.input label{ display:block;}\r\n");
      out.write("\r\n");
      out.write("div#footer{\r\n");
      out.write(" margin-top:90px;\r\n");
      out.write(" padding:5px;\r\n");
      out.write(" border:1px solid #E8EEFA;\r\n");
      out.write(" color:#444;\r\n");
      out.write(" font-size:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#footer a{\r\n");
      out.write(" color:#999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#banner {\r\n");
      out.write("float:center;\r\n");
      out.write("border:1px solid #E8EEFA;\r\n");
      out.write("top:100px;\r\n");
      out.write("font:bold 100% \"Lucida Grande\", Arial, sans-serif;\r\n");
      out.write("text-shadow:#FFF 0 1px 0;\r\n");
      out.write("padding: .5em 2em .5em .75em;\r\n");
      out.write("margin:0;\r\n");
      out.write("text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#banner2 {\r\n");
      out.write("float:center;\r\n");
      out.write("top:200px;\r\n");
      out.write("font:bold 100% \"Lucida Grande\", Arial, sans-serif;\r\n");
      out.write("text-shadow:#FFF 0 1px 0;\r\n");
      out.write("padding: .5em 2em .5em .75em;\r\n");
      out.write("margin:0;\r\n");
      out.write("text-align:center;\r\n");
      out.write("color:#D00;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("      \r\n");
      out.write("    <div id=\"main\">\r\n");
      out.write("        <div id=\"top\" class=\"center\">&nbsp;</div>\r\n");
      out.write("        <div id=\"mid\" class=\"center\">\r\n");
      out.write("            <form class=\"form-container\" method=\"post\" action=\"LoginServlet\" name=\"login_form\" id=\"login_form\" onsubmit=\"return validateForm()\">\r\n");
      out.write("                  \r\n");
      out.write("               <span class=\"login100-form-title p-b-25 p-t-25\">\r\n");
      out.write("                    EvaMay Technologies \r\n");
      out.write("                </span>\r\n");
      out.write("       \r\n");
      out.write("                <div class=\"login100-form\">\r\n");
      out.write("                    <label for=\"designation\">Designation:</label>\r\n");
      out.write("                    <select class=\"form-control\" id=\"designation\" name=\"designation\">\r\n");
      out.write("                        <option>Staff</option>\r\n");
      out.write("                        <option>Supervisor</option>\r\n");
      out.write("                        <option>Overall Manager</option>\r\n");
      out.write("                        <option>HR Manager</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("        <div id=\"mid\" class=\"center\">\r\n");
      out.write("                  <div class=\"login100-form\">\r\n");
      out.write("                    <label for=\"staffId\">Staff Number:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"staffId\" id=\"staffId\" placeholder=\"StaffId\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("                  <div class=\"login100-form\">\r\n");
      out.write("                    <label for=\"password\">Password:</label>\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("            \r\n");
      out.write("            <center>\r\n");
      out.write("                  <button type=\"submit\" class=\"login100-form-btn\">Login</button>\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"bot\" class=\"center\">&nbsp;</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</center>\r\n");
      out.write("      \r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t function validateForm()                                    \r\n");
      out.write("     { \r\n");
      out.write("         var regNo = document.forms[\"login_form\"][\"regNo\"];               \r\n");
      out.write("         var password = document.forms[\"login_form\"][\"password\"];\r\n");
      out.write("        \r\n");
      out.write("         if (regNo.value == \"\")                                  \r\n");
      out.write("         { \r\n");
      out.write("             window.alert(\"Please enter your Regno/StaffNo.\"); \r\n");
      out.write("             regNo.focus(); \r\n");
      out.write("             return false; \r\n");
      out.write("         } \r\n");
      out.write("\r\n");
      out.write("         if (password.value == \"\")                                  \r\n");
      out.write("         { \r\n");
      out.write("             window.alert(\"Please enter your Password.\"); \r\n");
      out.write("             password.focus(); \r\n");
      out.write("             return false; \r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("         return true; \r\n");
      out.write("     }\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
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
