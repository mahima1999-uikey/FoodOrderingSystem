package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("               <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("                <div id=\"loginbox\" style=\"margin-top: 50px;\"\n");
      out.write("                     class=\"mainbox col-md-5 col-md-offset-2 col-sm-6 col-sm-offset-2\">\n");
      out.write("\n");
      out.write("                    <div class=\"panel panel-info\">\n");
      out.write("\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\">Sign up</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div style=\"padding-top: 30px\" class=\"panel-body\">\n");
      out.write("\n");
      out.write("                            <!-- Address Form -->\n");
      out.write("                            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SignupServlet\"  class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    First Name :\t<input type=\"text\" name=\"firstname\" placeholder=\"First name\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    Last Name :\t<input type=\"text\" name=\"lastname\" placeholder=\"Last name\" class=\"form-control\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    Email Address :\t<input type=\"email\" name=\"email\" placeholder=\"email\" class=\"form-control\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    Mobile number :\t<input type=\"text\" name=\"contact\" placeholder=\"mobile no.\" class=\"form-control\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    Password :\t<input type=\"password\" name=\"password\" placeholder=\"password\" class=\"form-control\" >\n");
      out.write("                                </div>\n");
      out.write("                                                                <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                   Confirm password :\t<input type=\"password\" name=\"cpassword\" placeholder=\"confirm password\" class=\"form-control\" >\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div  >\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-success\" value=\"Register\"/>\n");
      out.write("\n");
      out.write("                                </div><br/>\n");
      out.write("                                <br/>\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                           \n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        </center>\n");
      out.write("    </body>\n");
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
