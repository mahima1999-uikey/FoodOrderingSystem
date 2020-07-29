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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t\n");
      out.write("\t<title>Login Page</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\n");
      out.write("\t<!-- Reference Bootstrap files -->\n");
      out.write("\t<link rel=\"stylesheet\"\n");
      out.write("\t\t href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"loginbox\" style=\"margin-top: 50px;\"\n");
      out.write("\t\t\tclass=\"mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"panel panel-info\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\">Sign In</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div style=\"padding-top: 30px\" class=\"panel-body\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Login Form -->\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LoginServlet\" method=\"POST\" class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t   \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- User name -->\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span> \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" placeholder=\"email\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- Password -->\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span> \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"password\" class=\"form-control\" >\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                   <br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- Login/Submit Button -->\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top: 10px\" class=\"form-group\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 controls\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-success\" value=\"Login\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <a href=\"confirmgmail.jsp\">forget password</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
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
