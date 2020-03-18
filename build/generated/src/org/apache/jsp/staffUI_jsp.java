package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffUI_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"images/logo.png\"/>\n");
      out.write("    <title>EvaMay Technologies </title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("<link href=\"css/welcome.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url('images/office2.jpg')\">\n");
      out.write("<div class=\"container-fluid bg\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-10 col-sm-8 col-xs-6\">\n");
      out.write("                    <h1 class=\"login100-form-title\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staff.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle text-muted waves-effect waves-dark pro-pic\" href=\"\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><img src=\"images/user.png\" alt=\"user\" class=\"rounded-circle\" width=\"31\"></a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right user-dd animated\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"javascript:void(0)\"><i class=\"glyphicon glyphicon-triangle-right\"></i><i class=\"ti-user m-r-5 m-l-5\"></i> My Profile</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"javascript:void(0)\"><i class=\"ti-wallet m-r-5 m-l-5\"></i> My Balance</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"javascript:void(0)\"><i class=\"ti-email m-r-5 m-l-5\"></i> Inbox</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"home.jsp\"><i class=\"ti-settings m-r-5 m-l-5\"></i> Account Setting</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"login.jsp\"><i class=\"fa fa-power-off m-r-5 m-l-5\"></i> Logout</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <div class=\"p-l-30 p-10\"><a href=\"javascript:void(0)\" class=\"btn btn-sm btn-success btn-rounded\">View Profile</a></div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("                \n");
      out.write("            <br>    \n");
      out.write("            \n");
      out.write("                  \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-2 col-sm-4 col-xs-12\"></div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
