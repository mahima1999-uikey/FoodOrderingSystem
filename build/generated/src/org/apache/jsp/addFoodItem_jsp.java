package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addFoodItem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/scriptandcss.html");
    _jspx_dependants.add("/adminnavbar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("\t<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Playfair+Display:400,700,400italic,700italic|Merriweather:300,400italic,300italic,400,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("\t\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("\t<!-- Simple Line Icons -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/simple-line-icons.css\">\n");
      out.write("\t<!-- Datetimepicker -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-datetimepicker.min.css\">\n");
      out.write("\t<!-- Flexslider -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/flexslider.css\">\n");
      out.write("\t<!-- Bootstrap  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write(" \n");
      out.write("\n");
      out.write("\t<!-- Modernizr JS -->\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\t<!-- FOR IE9 below -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("        .banner {\n");
      out.write("  background: #fff;\n");
      out.write("  font-family: Lato, sans-serif;\n");
      out.write("}\n");
      out.write(".navbar-nav-primary {\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-form-search {\n");
      out.write("  position: relative;\n");
      out.write("  .form-control {\n");
      out.write("    width: 250px;\n");
      out.write("  }\n");
      out.write("  .btn {\n");
      out.write("    border: 0;\n");
      out.write("    background: transparent;\n");
      out.write("    font-size: 18px;\n");
      out.write("    &:active,\n");
      out.write("    &:hover,\n");
      out.write("    &:focus {\n");
      out.write("      color: #000;\n");
      out.write("      outline: none;\n");
      out.write("      box-shadow: none;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  .search-form-container {\n");
      out.write("    text-align: right;\n");
      out.write("    position: absolute;\n");
      out.write("    width: 300px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background: #fff;\n");
      out.write("    right: 60px;\n");
      out.write("    top: 0;\n");
      out.write("    z-index: 9;\n");
      out.write("    transition: all .3s ease-in-out;\n");
      out.write("    &.hdn {\n");
      out.write("      width: 0;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .search-input-group {\n");
      out.write("      width: 300px;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("}</style>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <nav class=\"navbar navbar-default banner\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("       \n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Foodie</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      \n");
      out.write("     \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right navbar-nav-primary\">\n");
      out.write("\n");
      out.write("        <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/RegisteredUserServlet\">registeredUsers</a></li>\n");
      out.write("        <li><a href=\"addFoodItem.jsp\">addfooditem</a></li>\n");
      out.write("      \n");
      out.write("         <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ViewFoodOrdersServlet\">FoodOrders</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AllFoodItemsServlet\">FoodItemList</a></li> \n");
      out.write("    \n");
      out.write("        <li>   \n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">My Account\n");
      out.write("  <span class=\"caret\"></span></button>\n");
      out.write("  <ul class=\"dropdown-menu\">\n");
      out.write("    <li><a href=\"settings.jsp\">Settings</a></li>\n");
      out.write(" \n");
      out.write("    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogoutServlet\">Logout</a></li>\n");
      out.write("  </ul>\n");
      out.write("</div></li>\n");
      out.write("    \n");
      out.write("      </ul>\n");
      out.write("         <ul class=\"nav navbar-nav navbar-left navbar-nav-primary\">\n");
      out.write("             <li> <a href=\"index.jsp\" class=\"active\">Home</a></li>\n");
      out.write("             <li><a href=\"index.jsp#about\">About</a></li>\n");
      out.write("             <li><a href=\"index.jsp#features\" >Features</a></li>\n");
      out.write("         </ul>\n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write(" </nav></body></html>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("    <div id=\"fh5co-menus\" data-section=\"menu\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row text-center fh5co-heading row-padded\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                      \n");
      out.write("\n");
      out.write("        <div id=\"loginbox\" style=\"margin-top: 50px;\"\n");
      out.write("             class=\"mainbox col-md-5 col-md-offset-2 col-sm-6 col-sm-offset-2\">\n");
      out.write("\n");
      out.write("            <div class=\"panel panel-info\">\n");
      out.write("\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <div class=\"bg-primary text-white\">Add Food Item here</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div style=\"padding-top: 30px\" class=\"panel-body\">\n");
      out.write("\n");
      out.write("                    <!-- Address Form -->\n");
      out.write("                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddFoodServlet\" method=\"POST\"  class=\"form-horizontal\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("                            Food Category :  <input type=\"text\" name=\"foodcategory\" placeholder=\"foodcategory\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            Item Name : <input type=\"text\" name=\"itemname\" placeholder=\"itemname\" class=\"form-control\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                            Description :\n");
      out.write("                            <textarea name=\"description\" rows=\"5\" cols=\"30\" class=\"form-control\" placeholder=\"description\">\n");
      out.write("                            </textarea> </div>\n");
      out.write("                        <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            Quantity :  <input type=\"text\" name=\"quantity\" placeholder=\"quantity\" class=\"form-control\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            Price   <input type=\"text\" name=\"price\" placeholder=\"price\" class=\"form-control\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            Image   <input type=\"file\" name=\"image\"  class=\"form-control\" >\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div  >\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"add\"/>\n");
      out.write("\n");
      out.write("                        </div><br/>\n");
      out.write("                        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                </div></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer id=\"footer\">\n");
      out.write("<div id=\"fh5co-footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row row-padded\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("                                    <p class=\"to-animate\">&copy; Food Ordering System <br></a> Demo Images: <a href=\"http://pexels.com/\" target=\"_blank\">Pexels</a> <br> Tasty Food India <a href=\"http://handdrawngoods.com/store/tasty-icons-free-food-icons/\" target=\"_blank\">handdrawngoods</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"text-center to-animate\"><a href=\"#\" class=\"js-gotop\">Go To Top</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t\t<ul class=\"fh5co-social\">\n");
      out.write("\t\t\t\t\t\t<li class=\"to-animate-2\"><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"to-animate-2\"><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"to-animate-2\"><a href=\"#\"><i class=\"icon-instagram\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"text-center to-animate\"><a href=\"admin.jsp\">Admin</a></li></ul>\n");
      out.write("            \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write(" <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery Easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Bootstrap --> \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Bootstrap DateTimePicker -->\n");
      out.write("        <script src=\"js/moment.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Stellar Parallax -->\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Flexslider -->\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                $(function () {\n");
      out.write("                    $('#date').datetimepicker();\n");
      out.write("                });\n");
      out.write("        </script>\n");
      out.write("        <!-- Main JS -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
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
