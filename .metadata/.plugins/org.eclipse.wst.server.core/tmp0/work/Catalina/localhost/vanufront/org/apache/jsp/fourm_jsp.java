/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-11-18 07:07:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fourm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>VANUCHAT</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"font/css/fontello.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<base />\r\n");
      out.write("</head>\r\n");
      out.write("<body ng-app=\"myApp\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("  <div class=\"navbar-inner\">\r\n");
      out.write("    <div class=\"container\"> <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\"> \r\n");
      out.write("    <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </a> \r\n");
      out.write("    <img class=\"brand\" src=\"img/user.jpg\" alt=\"\">\r\n");
      out.write("      <ul class=\"nav nav-collapse pull-right\">\r\n");
      out.write("        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("        <li><a href=\"#about\">About Us</a></li>\r\n");
      out.write("        <li><a href=\"#contact\">Contact Us</a></li>\r\n");
      out.write("        <li><a href=\"#login\">Login</a></li>        \r\n");
      out.write("      </ul>\r\n");
      out.write("      <div class=\"nav-collapse collapse\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"s-12 m-8 l-9\">\r\n");
      out.write("               <div class=\"box\">\r\n");
      out.write("                  <div class=\"line\">\r\n");
      out.write("                     <div id=\"owl-demo\" class=\"owl-carousel owl-theme  margin-bottom\">\r\n");
      out.write("                        <div class=\"item\"><img src=\"img/940x380.jpg\" alt=\"\"></div>\r\n");
      out.write("                        <div class=\"item\"><img src=\"img/940x380-2.jpg\" alt=\"\"></div>\r\n");
      out.write("                        <div class=\"item\"><img src=\"img/940x380-3.jpg\" alt=\"\"></div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <section>\r\n");
      out.write("                     <article class=\"line\">\r\n");
      out.write("                        <div class=\"margin\">\r\n");
      out.write("                           <div class=\"s-12 m-12 l-2 date\">\r\n");
      out.write("                              <i class=\"icon-calendar\"></i>\r\n");
      out.write("                              <p><span>25</span><br />march</p>\r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div class=\"s-12 m-12 l-10\">\r\n");
      out.write("                              <h2>Header of article</h2>\r\n");
      out.write("                              <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet \r\n");
      out.write("                                 dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit \r\n");
      out.write("                                 lobortis nisl ut aliquip ex ea commodo consequat.\r\n");
      out.write("                              </p>\r\n");
      out.write("                              <br />\r\n");
      out.write("                              <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore \r\n");
      out.write("                                 eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril \r\n");
      out.write("                                 delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue \r\n");
      out.write("                                 nihil imperdiet doming id quod mazim placerat facer possim assum. \r\n");
      out.write("                              </p>\r\n");
      out.write("                              <hr>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </article>\r\n");
      out.write("                </section>\r\n");
      out.write("               </div>\r\n");
      out.write("         </div>\r\n");
      out.write(" </div>\r\n");
      out.write(" <div class=\"footer\" href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("    <p class=\"pull-left\"></p>\r\n");
      out.write("    <p class=\"pull-right\"></p>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/angular.min.js\"></script>\r\n");
      out.write("<script src=\"js/angular-route.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-1.10.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/app.js\"></script>\r\n");
      out.write("<script src=\"js/service/user_service.js\"></script>\r\n");
      out.write("<script src=\"js/controller/user_controller.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}