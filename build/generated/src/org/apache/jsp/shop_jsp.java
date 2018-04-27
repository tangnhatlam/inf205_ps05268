package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.Products;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("        ustora by freshdesignweb.com\n");
      out.write("        Twitter: https://twitter.com/freshdesignweb\n");
      out.write("        URL: https://www.freshdesignweb.com/ustora/\n");
      out.write("-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Shop Page- Ustora Demo</title>\n");
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
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
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                            <a href=\"showcart.jsp\">Cart - <span class=\"cart-amunt\"></span> <i class=\"fa fa-shopping-cart\"></i> <span class=\"product-count\"></span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End site branding area -->\n");
      out.write("\n");
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
      out.write("                            <li class=\"active\"><a href=\"shop.jsp\">Shop page</a></li>\n");
      out.write("                            <li><a href=\"showcart.jsp\">Cart</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End mainmenu area -->\n");
      out.write("\n");
      out.write("        <div class=\"product-big-title-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"product-bit-title text-center\">\n");
      out.write("                            <h2>Shop</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"single-product-area\">\n");
      out.write("            <div class=\"zigzag-bottom\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div>\n");
      out.write("                        ");

                            int first = 0, last = 0, pages = 1;

                            if (request.getParameter("pages") != null) {
                                pages = (int) Integer.parseInt(request.getParameter("pages"));
                            }
                            int total = new Products().getCount();
                            if (total <= 4) {
                                first = 0;
                                last = total;
                            } else {
                                first = (pages - 1) * 4;
                                last = 4;
                            }
                            Products listSP = new Products();
                            List<Product> list = listSP.getShop(first,last);
                            for (Product sp : list) {
                                out.print("<form action=\"ControllerCartBean\">");
                                out.print("<div class=\"col-md-3 col-sm-6\">");
                                out.print("     <div class=\"single-shop-product\">");
                                out.print("         <div class=\"product-upper\">");
                                out.print("             <img style=\"width: 100px;height: 100px;\" src=\"img/" + sp.getImage() + "\" alt=\"\">");
                                out.print("         </div>");
                                out.print("         <h2><a href=\"\">" + sp.getName() + "</a></h2>");
                                out.print("         <div class=\"product-carousel-price\"><ins>Price: " + sp.getPrice() + "$</ins>");
                                out.print("         </div>");
                                out.print("         <div class=\"product-option-shop\">");
                                out.print("<input class=\"add_to_cart_button\" class=\"product-count\" type=\"submit\" " + "value=\"Add to Cart\" name=\"action\" />"
                                        + "<input type=\"hidden\" name=\"txtCode\" value='" + sp.getCode() + "'>"
                                        + "<input type=\"hidden\" name=\"txtName\" value='" + sp.getName() + "'>"
                                        + "<input type=\"hidden\" name=\"txtPrice\" value='" + sp.getPrice() + "'>"
                                        + "<input type=\"hidden\" name=\"image\" value='" + sp.getImage() + "'>"
                                );
                                out.print("</div> ");
                                out.print("</div>");
                                out.print("</div>");
                                out.print("</form>");
                            }
                        
      out.write("\n");
      out.write("                        <ul class=\"pagination\">    \n");
      out.write("                            ");
                //Button Previous
                                int back = 0;
                                if (pages == 0 || pages == 1) {
                                    back = 1;//Luon la page 1
                                } else {
                                    back = pages - 1;//Neu pages tu 2 tro len thi back tru 1
                                }
                            
      out.write("\n");
      out.write("                            <li><a href=\"shop.jsp?pages=");
      out.print(back);
      out.write("\"><i></i></a></li>\n");
      out.write("                                        ");

                                            //Button Number pages
                                            int loop = 0, num = 0;
                                            if ((total / 4) % 2 == 0) {
                                                num = total / 4;
                                            } else {
                                                num = (total + 1) / 4;
                                            }
                                            //Nếu total lẻ thêm 1
                                            if (total % 2 != 0) {
                                                loop = (total / 4) + 1;

                                            } else //Nếu total chẵn nhỏ hơn fullpage và # fullPage thì thêm 1
                                            if (total < (num * 4) + 4 && total != num * 4) {
                                                loop = (total / 4) + 1;
                                            } else {
                                                //Nếu bằng fullPage thì không thêm
                                                loop = (total / 4);
                                            }
                                            //Lap so pages
                                            for (int i = 1; i <= loop; i++) {
      out.write("\n");
      out.write("                                        ");
 if (pages == i) {
      out.write(" \n");
      out.write("\n");
      out.write("                            <li><span><a href=\"shop.jsp?pages=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></span></li>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                            <li><a href=\"shop.jsp?pages=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a> </li>\n");
      out.write("\n");
      out.write("                            ");
}
            }
      out.write("\n");
      out.write("                            ");

                                //Button Next
                                int next = 0;
                                //Nếu total lẻ
                                if (total % 2 != 0) {
                                    if (pages == (total / 4) + 1) {
                                        next = pages;//Khong next
                                    } else {
                                        next = pages + 1;//Co next
                                    }
                                } else //Nếu total chẵn nhỏ hơn fullpage
                                //Và không fullPage thì thêm 1
                                if (total < (num * 4) + 4 && total != num * 4) {
                                    if (pages == (total / 4) + 1) {
                                        next = pages;//Khong next
                                    } else {
                                        next = pages + 1;//Co next
                                    }
                                } else //Nếu fullPage đến trang cuối dừng
                                //Chưa tới trang cuối thì được next
                                if (pages == (total / 4)) {
                                    next = pages;//Khong next
                                } else {
                                    next = pages + 1;//Co next
                                }
                            
      out.write("\n");
      out.write("                            <li ><a href=\"shop.jsp?pages=");
      out.print(next);
      out.write("\"><i class=\"next\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"product-pagination text-center\">\n");
      out.write("                            <nav>\n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">4</a></li>\n");
      out.write("                                    <li><a href=\"#\">5</a></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"footer-top-area\">\n");
      out.write("            <div class=\"zigzag-bottom\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-about-us\">\n");
      out.write("                            <h2>u<span>Stora</span></h2>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\n");
      out.write("                            <div class=\"footer-social\">\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-menu\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">User Navigation </h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"\">My account</a></li>\n");
      out.write("                                <li><a href=\"\">Order history</a></li>\n");
      out.write("                                <li><a href=\"\">Wishlist</a></li>\n");
      out.write("                                <li><a href=\"\">Vendor contact</a></li>\n");
      out.write("                                <li><a href=\"\">Front page</a></li>\n");
      out.write("                            </ul>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-menu\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">Categories</h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"\">Mobile Phone</a></li>\n");
      out.write("                                <li><a href=\"\">Home accesseries</a></li>\n");
      out.write("                                <li><a href=\"\">LED TV</a></li>\n");
      out.write("                                <li><a href=\"\">Computer</a></li>\n");
      out.write("                                <li><a href=\"\">Gadets</a></li>\n");
      out.write("                            </ul>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-newsletter\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">Newsletter</h2>\n");
      out.write("                            <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\n");
      out.write("                            <div class=\"newsletter-form\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Type your email\">\n");
      out.write("                                <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-bottom-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"copyright\">\n");
      out.write("                            <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"footer-card-icon\">\n");
      out.write("                            <i class=\"fa fa-cc-discover\"></i>\n");
      out.write("                            <i class=\"fa fa-cc-mastercard\"></i>\n");
      out.write("                            <i class=\"fa fa-cc-paypal\"></i>\n");
      out.write("                            <i class=\"fa fa-cc-visa\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Latest jQuery form server -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap JS form CDN -->\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- jQuery sticky menu -->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- jQuery easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Main Script -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
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
