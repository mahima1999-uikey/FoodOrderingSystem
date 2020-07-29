package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("        <style>\n");
      out.write("           .main {\n");
      out.write("    width: 50%;\n");
      out.write("    margin: 50px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Bootstrap 4 text input with search icon */\n");
      out.write("\n");
      out.write("#menufood{\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 35%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menufood td, #menufood th {\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menufood tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#menufood tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("#menufood th \n");
      out.write("{\n");
      out.write("  padding-top: 12px;\n");
      out.write("  padding-bottom: 12px;\n");
      out.write("  text-align: left;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".has-search .form-control {\n");
      out.write("    padding-left: 2.375rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".has-search .form-control-feedback {\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: 2;\n");
      out.write("    display: block;\n");
      out.write("    width: 2.375rem;\n");
      out.write("    height: 2.375rem;\n");
      out.write("    line-height: 2.375rem;\n");
      out.write("    text-align: center;\n");
      out.write("    pointer-events: none;\n");
      out.write("    color: #aaa;\n");
      out.write("}           \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \t\n");
      out.write("       <script type=\"text/javascript\" src=\"//code.jquery.com/jquery-2.1.3.min.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchServlet\">  \n");
      out.write("        <div class=\"main\">         \n");
      out.write("  <!-- Actual search box -->\n");
      out.write(" \n");
      out.write("  <div class=\"form-group has-search\">\n");
      out.write("    <span class=\"fa fa-search form-control-feedback\"></span>\n");
      out.write("    <input type=\"text\" name=\"search\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("  </div></div></form>\n");
      out.write("           \n");
      out.write("        <table id=\"menufood\" align=\"center\">   \n");
      out.write("            \n");
      out.write("            <thead>   <tr><th>Food Categories</th></tr></thead>\n");
      out.write("      \n");
      out.write("            <tbody>\n");
      out.write("                <tr class='clickable-row' data-href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchServlet?search=Drinks'>\n");
      out.write("                    \n");
      out.write("                    <td>Drinks</td></tr>\n");
      out.write("                <tr  class='clickable-row' data-href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchServlet?search=Curry'>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <td >Curry</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr  class='clickable-row' data-href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchServlet?search=Roti'>\n");
      out.write("                    \n");
      out.write("       \n");
      out.write("                    <td>Roti</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr  class='clickable-row' data-href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchServlet?search=Sweets'>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <td >Sweets</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr  class='clickable-row' data-href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchServlet?search=Indian Special'>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                  <td>Indian Special</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("          jQuery(document).ready(function($) {\n");
      out.write("    $(\".clickable-row\").click(function() {\n");
      out.write("        window.location = $(this).data(\"href\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("      </script>           \n");
      out.write("\n");
      out.write("    </body></html>         \n");
      out.write("                  \n");
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
