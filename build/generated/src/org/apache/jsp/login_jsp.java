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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head        \n");
      out.write("   \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/egerton.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    \n");
      out.write("    <title>EvaMay Technologies</title>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("form { padding:0;margin:0;}\n");
      out.write("div#main {\n");
      out.write(" margin-top:100px;\n");
      out.write(" font-family:Verdana, Arial, Helvetica, sans-serif;\n");
      out.write(" font-size:15px;\n");
      out.write(" color:blue;\n");
      out.write("}\n");
      out.write("div.center {\n");
      out.write("background-repeat:no-repeat;\n");
      out.write("background-position:center;\n");
      out.write("text-align:center;\n");
      out.write("float: center;\n");
      out.write("width: 582px;\n");
      out.write("}\n");
      out.write("div#top {\n");
      out.write("background-image:url(images/student_top.gif);\n");
      out.write("height:114px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("div#mid{\n");
      out.write("background-image:url(images/student_mid.gif);\n");
      out.write("height:172px;\n");
      out.write("}\n");
      out.write("div#bot {\n");
      out.write("background-image:url(images/student_bottom.gif);\n");
      out.write("height:13px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.input {\n");
      out.write("text-align:left;\n");
      out.write("padding-left:200px;\n");
      out.write("border:0;\n");
      out.write("padding-top:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.input label{ display:block;}\n");
      out.write("\n");
      out.write("div#footer{\n");
      out.write(" margin-top:90px;\n");
      out.write(" padding:5px;\n");
      out.write(" border:1px solid #E8EEFA;\n");
      out.write(" color:#444;\n");
      out.write(" font-size:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#footer a{\n");
      out.write(" color:#999;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#banner {\n");
      out.write("float:center;\n");
      out.write("border:1px solid #E8EEFA;\n");
      out.write("top:100px;\n");
      out.write("font:bold 100% \"Lucida Grande\", Arial, sans-serif;\n");
      out.write("text-shadow:#FFF 0 1px 0;\n");
      out.write("padding: .5em 2em .5em .75em;\n");
      out.write("margin:0;\n");
      out.write("text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#banner2 {\n");
      out.write("float:center;\n");
      out.write("top:200px;\n");
      out.write("font:bold 100% \"Lucida Grande\", Arial, sans-serif;\n");
      out.write("text-shadow:#FFF 0 1px 0;\n");
      out.write("padding: .5em 2em .5em .75em;\n");
      out.write("margin:0;\n");
      out.write("text-align:center;\n");
      out.write("color:#D00;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("      \n");
      out.write("    <div id=\"main\">\n");
      out.write("        <div id=\"top\" class=\"center\">&nbsp;</div>\n");
      out.write("        <div id=\"mid\" class=\"center\">\n");
      out.write("            <form class=\"form-container\" method=\"post\" action=\"LoginServlet\" name=\"login_form\" id=\"login_form\" onsubmit=\"return validateForm()\">\n");
      out.write("                  \n");
      out.write("               <span class=\"login100-form-title p-b-25 p-t-25\">\n");
      out.write("                    EvaMay Technologies \n");
      out.write("                </span>\n");
      out.write("       \n");
      out.write("                <div class=\"login100-form\">\n");
      out.write("                    <label for=\"designation\">Designation:</label>\n");
      out.write("                    <select class=\"form-control\" id=\"designation\" name=\"designation\">\n");
      out.write("                        <option>Staff</option>\n");
      out.write("                        <option>Supervisor</option>\n");
      out.write("                        <option>Overall Manager</option>\n");
      out.write("                        <option>HR Manager</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                 </div>\n");
      out.write("        <div id=\"mid\" class=\"center\">\n");
      out.write("                  <div class=\"login100-form\">\n");
      out.write("                    <label for=\"staffId\">Staff Number:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"staffId\" id=\"staffId\" placeholder=\"StaffId\">\n");
      out.write("                  </div>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                  <div class=\"login100-form\">\n");
      out.write("                    <label for=\"password\">Password:</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\">\n");
      out.write("                  </div>\n");
      out.write("            \n");
      out.write("            <center>\n");
      out.write("                  <button type=\"submit\" class=\"login100-form-btn\">Login</button>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"bot\" class=\"center\">&nbsp;</div>\n");
      out.write("    </div>\n");
      out.write("</center>\n");
      out.write("      \n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t function validateForm()                                    \n");
      out.write("     { \n");
      out.write("         var regNo = document.forms[\"login_form\"][\"regNo\"];               \n");
      out.write("         var password = document.forms[\"login_form\"][\"password\"];\n");
      out.write("        \n");
      out.write("         if (regNo.value == \"\")                                  \n");
      out.write("         { \n");
      out.write("             window.alert(\"Please enter your Regno/StaffNo.\"); \n");
      out.write("             regNo.focus(); \n");
      out.write("             return false; \n");
      out.write("         } \n");
      out.write("\n");
      out.write("         if (password.value == \"\")                                  \n");
      out.write("         { \n");
      out.write("             window.alert(\"Please enter your Password.\"); \n");
      out.write("             password.focus(); \n");
      out.write("             return false; \n");
      out.write("         }\n");
      out.write("\n");
      out.write("         return true; \n");
      out.write("     }\t\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
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
