package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <script>\n");
      out.write("            @function remy($value) {\n");
      out.write("            @return ($value / 16px) * 1rem;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font: 100% / 1.414 \"Open Sans\", \"Roboto\", arial, sans-serif;\n");
      out.write("                background: #e9e9e9;\n");
      out.write("            }\n");
      out.write("            a,\n");
      out.write("            [type=\"submit\"] {transition: all .25s ease-in;}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            .signup__thumbnail {\n");
      out.write("                position: relative;\n");
      out.write("                padding: 2rem;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                align-items: center;\n");
      out.write("                background: url(http://ultraimg.com/images/spectre-login.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: top center;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .thumbnail__logo,\n");
      out.write("            .thumbnail__content,\n");
      out.write("            .thumbnail__links {\n");
      out.write("                position: relative;\n");
      out.write("                z-index: 2;  \n");
      out.write("            }\n");
      out.write("            .thumbnail__logo {align-self: flex-start;}\n");
      out.write("            .logo__shape {fill: #fff;}\n");
      out.write("            .logo__text {\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: .8rem;\n");
      out.write("                font-weight: 700;\n");
      out.write("                vertical-align: bottom;\n");
      out.write("            }\n");
      out.write("            .thumbnail__content {align-self: center;}\n");
      out.write("            h1,\n");
      out.write("            h2 {\n");
      out.write("                font-weight: 300;\n");
      out.write("                color: rgba(255,255,255,1);\n");
      out.write("            }\n");
      out.write("            .heading--primary {font-size: 1.999rem;}\n");
      out.write("            .heading--secondary {font-size: 1.414rem;}\n");
      out.write("            .thumbnail__links {\n");
      out.write("                align-self: flex-end;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .thumbnail__links a {\n");
      out.write("                font-size: 1rem;\n");
      out.write("                color: #fff;\n");
      out.write("                &:focus,\n");
      out.write("                    &:hover {color: rgba(255,255,255,.5);}\n");
      out.write("            }\n");
      out.write("            .signup__form {\n");
      out.write("                padding: 2.5rem;\n");
      out.write("                background: #fafafa;\n");
      out.write("            }\n");
      out.write("            label {\n");
      out.write("                font-size: .85rem;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                color: #ccc;\n");
      out.write("            }\n");
      out.write("            .form-control {\n");
      out.write("                background-color: transparent;\n");
      out.write("                border-top: 0;\n");
      out.write("                border-right: 0;\n");
      out.write("                border-left: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("                &:focus {border-color: #111;}\n");
      out.write("            }\n");
      out.write("            [type=\"text\"] {color: #111;}\n");
      out.write("            [type=\"password\"] {color: #111;}\n");
      out.write("            .btn--form {\n");
      out.write("                padding: .5rem 2.5rem;\n");
      out.write("                font-size: .95rem;\n");
      out.write("                font-weight: 600;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                color: #fff;\n");
      out.write("                background: #111;\n");
      out.write("                border-radius: remy(35px);\n");
      out.write("                &:focus,\n");
      out.write("                    &:hover {background: lighten(#111, 13%);}\n");
      out.write("            }\n");
      out.write("            .signup__link {\n");
      out.write("                font-size: .8rem;\n");
      out.write("                font-weight: 600;\n");
      out.write("                text-decoration: underline;\n");
      out.write("                color: #999;\n");
      out.write("                &:focus,\n");
      out.write("                    &:hover {color: darken(#999, 13%);}\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"user-menu\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-user\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-heart\"></i> Wishlist</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-user\"></i> My Cart</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Checkout</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\"><i class=\"fa fa-user\"></i> Login</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"header-right\">\n");
      out.write("                            <ul class=\"list-unstyled list-inline\">\n");
      out.write("                                <li class=\"dropdown dropdown-small\">\n");
      out.write("                                    <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">currency :</span><span class=\"value\">USD </span><b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">USD</a></li>\n");
      out.write("                                        <li><a href=\"#\">INR</a></li>\n");
      out.write("                                        <li><a href=\"#\">GBP</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"dropdown dropdown-small\">\n");
      out.write("                                    <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">language :</span><span class=\"value\">English </span><b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">English</a></li>\n");
      out.write("                                        <li><a href=\"#\">French</a></li>\n");
      out.write("                                        <li><a href=\"#\">German</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End header area -->\n");
      out.write("\n");
      out.write("        <div class=\"site-branding-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <h1><a href=\"./\"><img src=\"img/logo.png\"></a></h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"shopping-item\">\n");
      out.write("                            <a href=\"cart.html\">Cart - <span class=\"cart-amunt\">$100</span> <i class=\"fa fa-shopping-cart\"></i> <span class=\"product-count\">5</span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End site branding area -->\n");
      out.write("        <div class=\"mainmenu-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li ><a href=\"shop.jsp\">Shop page</a></li>\n");
      out.write("                            <li class=\"active\"><a href=\"products.jsp\">Product</a></li>\n");
      out.write("                            <li><a href=\"showcart.jsp\">Cart</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End mainmenu area -->\n");
      out.write("        <h1>Edit Product</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"signup__container\">\n");
      out.write("\n");
      out.write("            <div class=\"container__child signup__form\">\n");
      out.write("                <form action=\"ControllerCustomer\" class=\"form-control\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        Username:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ND.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("   <input type=\"hidden\" name=\"txtUser\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ND.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Password:</label>\n");
      out.write("                        <input type=\"text\" name=\"txtPass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ND.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Last name:</label>\n");
      out.write("                        <input type=\"text\" name=\"txtLast\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ND.hoten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Gioi tinh(Nam check vao o con nu khong can check): </label><input type=\"checkbox\" name=\"chkGT\" value=\"gioitinh\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Email:</label>\n");
      out.write("                        <input type=\"text\" name=\"txtLast\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ND.hoten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Quyen admin: </label><input type=\"checkbox\" name=\"chkAdmin\" value=\"admin\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Update\"/>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                </form>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
