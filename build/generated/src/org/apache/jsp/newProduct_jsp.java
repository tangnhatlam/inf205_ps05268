package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("                            <li><a href=\"index_admin.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"products.jsp\">Product</a></li>\n");
      out.write("                            <li class=\"active\"><a href=\"newProduct.jsp\">New Product</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End mainmenu area -->\n");
      out.write("        <div class=\"site-branding-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <h1><a href=\"./\"><img src=\"img/logo.png\"></a></h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End site branding area -->\n");
      out.write("    <center><h1 style=\"color:red;\">New product</h1></center>\n");
      out.write("    <form action=\"ControllerProducts\">\n");
      out.write("        Code: <input type=\"text\" name=\"txtCode\" value=\"\" class=\"form-control\"/><br/>\n");
      out.write("        Name: <input type=\"text\" name=\"txtName\" value=\"\" class=\"form-control\"/><br/>\n");
      out.write("        Price: <input type=\"text\" name=\"txtPrice\" value=\"\" class=\"form-control\"/><br/>\n");
      out.write("        <br/>\n");
      out.write("        <input type=\"file\" name=\"uploadFile\" />\n");
      out.write("        <br/><br/>\n");
      out.write("        <input type=\"submit\" name=\"action\" value=\"Insert\"/>\n");
      out.write("        <br/><br/>\n");
      out.write("    </form>\n");
      out.write("    <div class=\"footer-top-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-about-us\">\n");
      out.write("                        <h2>u<span>Stora</span></h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\n");
      out.write("                        <div class=\"footer-social\">\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">My account</a></li>\n");
      out.write("                            <li><a href=\"\">Order history</a></li>\n");
      out.write("                            <li><a href=\"\">Wishlist</a></li>\n");
      out.write("                            <li><a href=\"\">Vendor contact</a></li>\n");
      out.write("                            <li><a href=\"\">Front page</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">Mobile Phone</a></li>\n");
      out.write("                            <li><a href=\"\">Home accesseries</a></li>\n");
      out.write("                            <li><a href=\"\">LED TV</a></li>\n");
      out.write("                            <li><a href=\"\">Computer</a></li>\n");
      out.write("                            <li><a href=\"\">Gadets</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-newsletter\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Newsletter</h2>\n");
      out.write("                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\n");
      out.write("                        <div class=\"newsletter-form\">\n");
      out.write("                            <input type=\"email\" placeholder=\"Type your email\">\n");
      out.write("                            <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer-bottom-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"footer-card-icon\">\n");
      out.write("                        <i class=\"fa fa-cc-discover\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-mastercard\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-paypal\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-visa\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
