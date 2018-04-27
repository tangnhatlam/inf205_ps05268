package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>Cart Page - Ustora Demo</title>\n");
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
      out.write("                            <a href=\"showcart.jsp\">Cart - <span class=\"cart-amunt\"></span> <i class=\"fa fa-shopping-cart\"></i></a>\n");
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
      out.write("                            <li><a href=\"shop.jsp\">Shop page</a></li>\n");
      out.write("                            <li  class=\"active\"><a href=\"showcart.jsp\">Cart</a></li>\n");
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
      out.write("                            <h2>Shopping Cart</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End Page title area -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"single-product-area\">\n");
      out.write("            <div class=\"zigzag-bottom\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"product-content-right\">\n");
      out.write("                            <div class=\"woocommerce\">\n");
      out.write("                                <h1>Your Shopping Cart</h1>\n");
      out.write("                                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"cart-collaterals\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"cross-sells\">\n");
      out.write("                                        <h2>You may be interested in...</h2>\n");
      out.write("                                        <ul class=\"products\">\n");
      out.write("                                            <li class=\"product\">\n");
      out.write("                                                <a href=\"single-product.html\">\n");
      out.write("                                                    <img width=\"325\" height=\"325\" alt=\"T_4_front\" class=\"attachment-shop_catalog wp-post-image\" src=\"img/product-2.jpg\">\n");
      out.write("                                                    <h3>Ship Your Idea</h3>\n");
      out.write("                                                    <span class=\"price\"><span class=\"amount\">£20.00</span></span>\n");
      out.write("                                                </a>\n");
      out.write("\n");
      out.write("                                                <a class=\"add_to_cart_button\" data-quantity=\"1\" data-product_sku=\"\" data-product_id=\"22\" rel=\"nofollow\" href=\"single-product.html\">Select options</a>\n");
      out.write("                                            </li>\n");
      out.write("\n");
      out.write("                                            <li class=\"product\">\n");
      out.write("                                                <a href=\"single-product.html\">\n");
      out.write("                                                    <img width=\"325\" height=\"325\" alt=\"T_4_front\" class=\"attachment-shop_catalog wp-post-image\" src=\"img/product-4.jpg\">\n");
      out.write("                                                    <h3>Ship Your Idea</h3>\n");
      out.write("                                                    <span class=\"price\"><span class=\"amount\">£20.00</span></span>\n");
      out.write("                                                </a>\n");
      out.write("\n");
      out.write("                                                <a class=\"add_to_cart_button\" data-quantity=\"1\" data-product_sku=\"\" data-product_id=\"22\" rel=\"nofollow\" href=\"single-product.html\">Select options</a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"cart_totals \">\n");
      out.write("                                        <h2>Cart Totals</h2>\n");
      out.write("\n");
      out.write("                                        <table cellspacing=\"0\">\n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr class=\"cart-subtotal\">\n");
      out.write("                                                    <th>Cart Subtotal</th>\n");
      out.write("                                                    <td><span class=\"amount\">£15.00</span></td>\n");
      out.write("                                                </tr>\n");
      out.write("\n");
      out.write("                                                <tr class=\"shipping\">\n");
      out.write("                                                    <th>Shipping and Handling</th>\n");
      out.write("                                                    <td>Free Shipping</td>\n");
      out.write("                                                </tr>\n");
      out.write("\n");
      out.write("                                                <tr class=\"order-total\">\n");
      out.write("                                                    <th>Order Total</th>\n");
      out.write("                                                    <td><strong><span class=\"amount\">£15.00</span></strong> </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <form method=\"post\" action=\"#\" class=\"shipping_calculator\">\n");
      out.write("                                        <h2><a class=\"shipping-calculator-button\" data-toggle=\"collapse\" href=\"#calcalute-shipping-wrap\" aria-expanded=\"false\" aria-controls=\"calcalute-shipping-wrap\">Calculate Shipping</a></h2>\n");
      out.write("\n");
      out.write("                                        <section id=\"calcalute-shipping-wrap\" class=\"shipping-calculator-form collapse\">\n");
      out.write("\n");
      out.write("                                            <p class=\"form-row form-row-wide\">\n");
      out.write("                                                <select rel=\"calc_shipping_state\" class=\"country_to_state\" id=\"calc_shipping_country\" name=\"calc_shipping_country\">\n");
      out.write("                                                    <option value=\"\">Select a country…</option>\n");
      out.write("                                                    <option value=\"AX\">Åland Islands</option>\n");
      out.write("                                                    <option value=\"AF\">Afghanistan</option>\n");
      out.write("                                                    <option value=\"AL\">Albania</option>\n");
      out.write("                                                    <option value=\"DZ\">Algeria</option>\n");
      out.write("                                                    <option value=\"AD\">Andorra</option>\n");
      out.write("                                                    <option value=\"AO\">Angola</option>\n");
      out.write("                                                    <option value=\"AI\">Anguilla</option>\n");
      out.write("                                                    <option value=\"AQ\">Antarctica</option>\n");
      out.write("                                                    <option value=\"AG\">Antigua and Barbuda</option>\n");
      out.write("                                                    <option value=\"AR\">Argentina</option>\n");
      out.write("                                                    <option value=\"AM\">Armenia</option>\n");
      out.write("                                                    <option value=\"AW\">Aruba</option>\n");
      out.write("                                                    <option value=\"AU\">Australia</option>\n");
      out.write("                                                    <option value=\"AT\">Austria</option>\n");
      out.write("                                                    <option value=\"AZ\">Azerbaijan</option>\n");
      out.write("                                                    <option value=\"BS\">Bahamas</option>\n");
      out.write("                                                    <option value=\"BH\">Bahrain</option>\n");
      out.write("                                                    <option value=\"BD\">Bangladesh</option>\n");
      out.write("                                                    <option value=\"BB\">Barbados</option>\n");
      out.write("                                                    <option value=\"BY\">Belarus</option>\n");
      out.write("                                                    <option value=\"PW\">Belau</option>\n");
      out.write("                                                    <option value=\"BE\">Belgium</option>\n");
      out.write("                                                    <option value=\"BZ\">Belize</option>\n");
      out.write("                                                    <option value=\"BJ\">Benin</option>\n");
      out.write("                                                    <option value=\"BM\">Bermuda</option>\n");
      out.write("                                                    <option value=\"BT\">Bhutan</option>\n");
      out.write("                                                    <option value=\"BO\">Bolivia</option>\n");
      out.write("                                                    <option value=\"BQ\">Bonaire, Saint Eustatius and Saba</option>\n");
      out.write("                                                    <option value=\"BA\">Bosnia and Herzegovina</option>\n");
      out.write("                                                    <option value=\"BW\">Botswana</option>\n");
      out.write("                                                    <option value=\"BV\">Bouvet Island</option>\n");
      out.write("                                                    <option value=\"BR\">Brazil</option>\n");
      out.write("                                                    <option value=\"IO\">British Indian Ocean Territory</option>\n");
      out.write("                                                    <option value=\"VG\">British Virgin Islands</option>\n");
      out.write("                                                    <option value=\"BN\">Brunei</option>\n");
      out.write("                                                    <option value=\"BG\">Bulgaria</option>\n");
      out.write("                                                    <option value=\"BF\">Burkina Faso</option>\n");
      out.write("                                                    <option value=\"BI\">Burundi</option>\n");
      out.write("                                                    <option value=\"KH\">Cambodia</option>\n");
      out.write("                                                    <option value=\"CM\">Cameroon</option>\n");
      out.write("                                                    <option value=\"CA\">Canada</option>\n");
      out.write("                                                    <option value=\"CV\">Cape Verde</option>\n");
      out.write("                                                    <option value=\"KY\">Cayman Islands</option>\n");
      out.write("                                                    <option value=\"CF\">Central African Republic</option>\n");
      out.write("                                                    <option value=\"TD\">Chad</option>\n");
      out.write("                                                    <option value=\"CL\">Chile</option>\n");
      out.write("                                                    <option value=\"CN\">China</option>\n");
      out.write("                                                    <option value=\"CX\">Christmas Island</option>\n");
      out.write("                                                    <option value=\"CC\">Cocos (Keeling) Islands</option>\n");
      out.write("                                                    <option value=\"CO\">Colombia</option>\n");
      out.write("                                                    <option value=\"KM\">Comoros</option>\n");
      out.write("                                                    <option value=\"CG\">Congo (Brazzaville)</option>\n");
      out.write("                                                    <option value=\"CD\">Congo (Kinshasa)</option>\n");
      out.write("                                                    <option value=\"CK\">Cook Islands</option>\n");
      out.write("                                                    <option value=\"CR\">Costa Rica</option>\n");
      out.write("                                                    <option value=\"HR\">Croatia</option>\n");
      out.write("                                                    <option value=\"CU\">Cuba</option>\n");
      out.write("                                                    <option value=\"CW\">CuraÇao</option>\n");
      out.write("                                                    <option value=\"CY\">Cyprus</option>\n");
      out.write("                                                    <option value=\"CZ\">Czech Republic</option>\n");
      out.write("                                                    <option value=\"DK\">Denmark</option>\n");
      out.write("                                                    <option value=\"DJ\">Djibouti</option>\n");
      out.write("                                                    <option value=\"DM\">Dominica</option>\n");
      out.write("                                                    <option value=\"DO\">Dominican Republic</option>\n");
      out.write("                                                    <option value=\"EC\">Ecuador</option>\n");
      out.write("                                                    <option value=\"EG\">Egypt</option>\n");
      out.write("                                                    <option value=\"SV\">El Salvador</option>\n");
      out.write("                                                    <option value=\"GQ\">Equatorial Guinea</option>\n");
      out.write("                                                    <option value=\"ER\">Eritrea</option>\n");
      out.write("                                                    <option value=\"EE\">Estonia</option>\n");
      out.write("                                                    <option value=\"ET\">Ethiopia</option>\n");
      out.write("                                                    <option value=\"FK\">Falkland Islands</option>\n");
      out.write("                                                    <option value=\"FO\">Faroe Islands</option>\n");
      out.write("                                                    <option value=\"FJ\">Fiji</option>\n");
      out.write("                                                    <option value=\"FI\">Finland</option>\n");
      out.write("                                                    <option value=\"FR\">France</option>\n");
      out.write("                                                    <option value=\"GF\">French Guiana</option>\n");
      out.write("                                                    <option value=\"PF\">French Polynesia</option>\n");
      out.write("                                                    <option value=\"TF\">French Southern Territories</option>\n");
      out.write("                                                    <option value=\"GA\">Gabon</option>\n");
      out.write("                                                    <option value=\"GM\">Gambia</option>\n");
      out.write("                                                    <option value=\"GE\">Georgia</option>\n");
      out.write("                                                    <option value=\"DE\">Germany</option>\n");
      out.write("                                                    <option value=\"GH\">Ghana</option>\n");
      out.write("                                                    <option value=\"GI\">Gibraltar</option>\n");
      out.write("                                                    <option value=\"GR\">Greece</option>\n");
      out.write("                                                    <option value=\"GL\">Greenland</option>\n");
      out.write("                                                    <option value=\"GD\">Grenada</option>\n");
      out.write("                                                    <option value=\"GP\">Guadeloupe</option>\n");
      out.write("                                                    <option value=\"GT\">Guatemala</option>\n");
      out.write("                                                    <option value=\"GG\">Guernsey</option>\n");
      out.write("                                                    <option value=\"GN\">Guinea</option>\n");
      out.write("                                                    <option value=\"GW\">Guinea-Bissau</option>\n");
      out.write("                                                    <option value=\"GY\">Guyana</option>\n");
      out.write("                                                    <option value=\"HT\">Haiti</option>\n");
      out.write("                                                    <option value=\"HM\">Heard Island and McDonald Islands</option>\n");
      out.write("                                                    <option value=\"HN\">Honduras</option>\n");
      out.write("                                                    <option value=\"HK\">Hong Kong</option>\n");
      out.write("                                                    <option value=\"HU\">Hungary</option>\n");
      out.write("                                                    <option value=\"IS\">Iceland</option>\n");
      out.write("                                                    <option value=\"IN\">India</option>\n");
      out.write("                                                    <option value=\"ID\">Indonesia</option>\n");
      out.write("                                                    <option value=\"IR\">Iran</option>\n");
      out.write("                                                    <option value=\"IQ\">Iraq</option>\n");
      out.write("                                                    <option value=\"IM\">Isle of Man</option>\n");
      out.write("                                                    <option value=\"IL\">Israel</option>\n");
      out.write("                                                    <option value=\"IT\">Italy</option>\n");
      out.write("                                                    <option value=\"CI\">Ivory Coast</option>\n");
      out.write("                                                    <option value=\"JM\">Jamaica</option>\n");
      out.write("                                                    <option value=\"JP\">Japan</option>\n");
      out.write("                                                    <option value=\"JE\">Jersey</option>\n");
      out.write("                                                    <option value=\"JO\">Jordan</option>\n");
      out.write("                                                    <option value=\"KZ\">Kazakhstan</option>\n");
      out.write("                                                    <option value=\"KE\">Kenya</option>\n");
      out.write("                                                    <option value=\"KI\">Kiribati</option>\n");
      out.write("                                                    <option value=\"KW\">Kuwait</option>\n");
      out.write("                                                    <option value=\"KG\">Kyrgyzstan</option>\n");
      out.write("                                                    <option value=\"LA\">Laos</option>\n");
      out.write("                                                    <option value=\"LV\">Latvia</option>\n");
      out.write("                                                    <option value=\"LB\">Lebanon</option>\n");
      out.write("                                                    <option value=\"LS\">Lesotho</option>\n");
      out.write("                                                    <option value=\"LR\">Liberia</option>\n");
      out.write("                                                    <option value=\"LY\">Libya</option>\n");
      out.write("                                                    <option value=\"LI\">Liechtenstein</option>\n");
      out.write("                                                    <option value=\"LT\">Lithuania</option>\n");
      out.write("                                                    <option value=\"LU\">Luxembourg</option>\n");
      out.write("                                                    <option value=\"MO\">Macao S.A.R., China</option>\n");
      out.write("                                                    <option value=\"MK\">Macedonia</option>\n");
      out.write("                                                    <option value=\"MG\">Madagascar</option>\n");
      out.write("                                                    <option value=\"MW\">Malawi</option>\n");
      out.write("                                                    <option value=\"MY\">Malaysia</option>\n");
      out.write("                                                    <option value=\"MV\">Maldives</option>\n");
      out.write("                                                    <option value=\"ML\">Mali</option>\n");
      out.write("                                                    <option value=\"MT\">Malta</option>\n");
      out.write("                                                    <option value=\"MH\">Marshall Islands</option>\n");
      out.write("                                                    <option value=\"MQ\">Martinique</option>\n");
      out.write("                                                    <option value=\"MR\">Mauritania</option>\n");
      out.write("                                                    <option value=\"MU\">Mauritius</option>\n");
      out.write("                                                    <option value=\"YT\">Mayotte</option>\n");
      out.write("                                                    <option value=\"MX\">Mexico</option>\n");
      out.write("                                                    <option value=\"FM\">Micronesia</option>\n");
      out.write("                                                    <option value=\"MD\">Moldova</option>\n");
      out.write("                                                    <option value=\"MC\">Monaco</option>\n");
      out.write("                                                    <option value=\"MN\">Mongolia</option>\n");
      out.write("                                                    <option value=\"ME\">Montenegro</option>\n");
      out.write("                                                    <option value=\"MS\">Montserrat</option>\n");
      out.write("                                                    <option value=\"MA\">Morocco</option>\n");
      out.write("                                                    <option value=\"MZ\">Mozambique</option>\n");
      out.write("                                                    <option value=\"MM\">Myanmar</option>\n");
      out.write("                                                    <option value=\"NA\">Namibia</option>\n");
      out.write("                                                    <option value=\"NR\">Nauru</option>\n");
      out.write("                                                    <option value=\"NP\">Nepal</option>\n");
      out.write("                                                    <option value=\"NL\">Netherlands</option>\n");
      out.write("                                                    <option value=\"AN\">Netherlands Antilles</option>\n");
      out.write("                                                    <option value=\"NC\">New Caledonia</option>\n");
      out.write("                                                    <option value=\"NZ\">New Zealand</option>\n");
      out.write("                                                    <option value=\"NI\">Nicaragua</option>\n");
      out.write("                                                    <option value=\"NE\">Niger</option>\n");
      out.write("                                                    <option value=\"NG\">Nigeria</option>\n");
      out.write("                                                    <option value=\"NU\">Niue</option>\n");
      out.write("                                                    <option value=\"NF\">Norfolk Island</option>\n");
      out.write("                                                    <option value=\"KP\">North Korea</option>\n");
      out.write("                                                    <option value=\"NO\">Norway</option>\n");
      out.write("                                                    <option value=\"OM\">Oman</option>\n");
      out.write("                                                    <option value=\"PK\">Pakistan</option>\n");
      out.write("                                                    <option value=\"PS\">Palestinian Territory</option>\n");
      out.write("                                                    <option value=\"PA\">Panama</option>\n");
      out.write("                                                    <option value=\"PG\">Papua New Guinea</option>\n");
      out.write("                                                    <option value=\"PY\">Paraguay</option>\n");
      out.write("                                                    <option value=\"PE\">Peru</option>\n");
      out.write("                                                    <option value=\"PH\">Philippines</option>\n");
      out.write("                                                    <option value=\"PN\">Pitcairn</option>\n");
      out.write("                                                    <option value=\"PL\">Poland</option>\n");
      out.write("                                                    <option value=\"PT\">Portugal</option>\n");
      out.write("                                                    <option value=\"QA\">Qatar</option>\n");
      out.write("                                                    <option value=\"IE\">Republic of Ireland</option>\n");
      out.write("                                                    <option value=\"RE\">Reunion</option>\n");
      out.write("                                                    <option value=\"RO\">Romania</option>\n");
      out.write("                                                    <option value=\"RU\">Russia</option>\n");
      out.write("                                                    <option value=\"RW\">Rwanda</option>\n");
      out.write("                                                    <option value=\"ST\">São Tomé and Príncipe</option>\n");
      out.write("                                                    <option value=\"BL\">Saint Barthélemy</option>\n");
      out.write("                                                    <option value=\"SH\">Saint Helena</option>\n");
      out.write("                                                    <option value=\"KN\">Saint Kitts and Nevis</option>\n");
      out.write("                                                    <option value=\"LC\">Saint Lucia</option>\n");
      out.write("                                                    <option value=\"SX\">Saint Martin (Dutch part)</option>\n");
      out.write("                                                    <option value=\"MF\">Saint Martin (French part)</option>\n");
      out.write("                                                    <option value=\"PM\">Saint Pierre and Miquelon</option>\n");
      out.write("                                                    <option value=\"VC\">Saint Vincent and the Grenadines</option>\n");
      out.write("                                                    <option value=\"SM\">San Marino</option>\n");
      out.write("                                                    <option value=\"SA\">Saudi Arabia</option>\n");
      out.write("                                                    <option value=\"SN\">Senegal</option>\n");
      out.write("                                                    <option value=\"RS\">Serbia</option>\n");
      out.write("                                                    <option value=\"SC\">Seychelles</option>\n");
      out.write("                                                    <option value=\"SL\">Sierra Leone</option>\n");
      out.write("                                                    <option value=\"SG\">Singapore</option>\n");
      out.write("                                                    <option value=\"SK\">Slovakia</option>\n");
      out.write("                                                    <option value=\"SI\">Slovenia</option>\n");
      out.write("                                                    <option value=\"SB\">Solomon Islands</option>\n");
      out.write("                                                    <option value=\"SO\">Somalia</option>\n");
      out.write("                                                    <option value=\"ZA\">South Africa</option>\n");
      out.write("                                                    <option value=\"GS\">South Georgia/Sandwich Islands</option>\n");
      out.write("                                                    <option value=\"KR\">South Korea</option>\n");
      out.write("                                                    <option value=\"SS\">South Sudan</option>\n");
      out.write("                                                    <option value=\"ES\">Spain</option>\n");
      out.write("                                                    <option value=\"LK\">Sri Lanka</option>\n");
      out.write("                                                    <option value=\"SD\">Sudan</option>\n");
      out.write("                                                    <option value=\"SR\">Suriname</option>\n");
      out.write("                                                    <option value=\"SJ\">Svalbard and Jan Mayen</option>\n");
      out.write("                                                    <option value=\"SZ\">Swaziland</option>\n");
      out.write("                                                    <option value=\"SE\">Sweden</option>\n");
      out.write("                                                    <option value=\"CH\">Switzerland</option>\n");
      out.write("                                                    <option value=\"SY\">Syria</option>\n");
      out.write("                                                    <option value=\"TW\">Taiwan</option>\n");
      out.write("                                                    <option value=\"TJ\">Tajikistan</option>\n");
      out.write("                                                    <option value=\"TZ\">Tanzania</option>\n");
      out.write("                                                    <option value=\"TH\">Thailand</option>\n");
      out.write("                                                    <option value=\"TL\">Timor-Leste</option>\n");
      out.write("                                                    <option value=\"TG\">Togo</option>\n");
      out.write("                                                    <option value=\"TK\">Tokelau</option>\n");
      out.write("                                                    <option value=\"TO\">Tonga</option>\n");
      out.write("                                                    <option value=\"TT\">Trinidad and Tobago</option>\n");
      out.write("                                                    <option value=\"TN\">Tunisia</option>\n");
      out.write("                                                    <option value=\"TR\">Turkey</option>\n");
      out.write("                                                    <option value=\"TM\">Turkmenistan</option>\n");
      out.write("                                                    <option value=\"TC\">Turks and Caicos Islands</option>\n");
      out.write("                                                    <option value=\"TV\">Tuvalu</option>\n");
      out.write("                                                    <option value=\"UG\">Uganda</option>\n");
      out.write("                                                    <option value=\"UA\">Ukraine</option>\n");
      out.write("                                                    <option value=\"AE\">United Arab Emirates</option>\n");
      out.write("                                                    <option selected=\"selected\" value=\"GB\">United Kingdom (UK)</option>\n");
      out.write("                                                    <option value=\"US\">United States (US)</option>\n");
      out.write("                                                    <option value=\"UY\">Uruguay</option>\n");
      out.write("                                                    <option value=\"UZ\">Uzbekistan</option>\n");
      out.write("                                                    <option value=\"VU\">Vanuatu</option>\n");
      out.write("                                                    <option value=\"VA\">Vatican</option>\n");
      out.write("                                                    <option value=\"VE\">Venezuela</option>\n");
      out.write("                                                    <option value=\"VN\">Vietnam</option>\n");
      out.write("                                                    <option value=\"WF\">Wallis and Futuna</option>\n");
      out.write("                                                    <option value=\"EH\">Western Sahara</option>\n");
      out.write("                                                    <option value=\"WS\">Western Samoa</option>\n");
      out.write("                                                    <option value=\"YE\">Yemen</option>\n");
      out.write("                                                    <option value=\"ZM\">Zambia</option>\n");
      out.write("                                                    <option value=\"ZW\">Zimbabwe</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </p>\n");
      out.write("\n");
      out.write("                                            <p class=\"form-row form-row-wide\"><input type=\"text\" id=\"calc_shipping_state\" name=\"calc_shipping_state\" placeholder=\"State / county\" value=\"\" class=\"input-text\"> </p>\n");
      out.write("\n");
      out.write("                                            <p class=\"form-row form-row-wide\"><input type=\"text\" id=\"calc_shipping_postcode\" name=\"calc_shipping_postcode\" placeholder=\"Postcode / Zip\" value=\"\" class=\"input-text\"></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <p><button class=\"button\" value=\"1\" name=\"calc_shipping\" type=\"submit\">Update Totals</button></p>\n");
      out.write("\n");
      out.write("                                        </section>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>                        \n");
      out.write("                        </div>                    \n");
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
      out.write("                                <li><a href=\"#\">My account</a></li>\n");
      out.write("                                <li><a href=\"#\">Order history</a></li>\n");
      out.write("                                <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                                <li><a href=\"#\">Vendor contact</a></li>\n");
      out.write("                                <li><a href=\"#\">Front page</a></li>\n");
      out.write("                            </ul>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-menu\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">Categories</h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Mobile Phone</a></li>\n");
      out.write("                                <li><a href=\"#\">Home accesseries</a></li>\n");
      out.write("                                <li><a href=\"#\">LED TV</a></li>\n");
      out.write("                                <li><a href=\"#\">Computer</a></li>\n");
      out.write("                                <li><a href=\"#\">Gadets</a></li>\n");
      out.write("                            </ul>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-newsletter\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">Newsletter</h2>\n");
      out.write("                            <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\n");
      out.write("                            <div class=\"newsletter-form\">\n");
      out.write("                                <form action=\"#\">\n");
      out.write("                                    <input type=\"email\" placeholder=\"Type your email\">\n");
      out.write("                                    <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End footer top area -->\n");
      out.write("\n");
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
      out.write("        </div> <!-- End footer bottom area -->\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("shop");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.SHOP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty shop}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <table border=\"1\" class=\"shop_table\">\n");
        out.write("                                        <thead>\n");
        out.write("                                            <tr>\n");
        out.write("                                                <td>No.</td>\n");
        out.write("                                                <td>Code</td>\n");
        out.write("                                                <td class=\"product-name\">Name</td>\n");
        out.write("                                                <td class=\"product-price\">Price</td>\n");
        out.write("                                                <td class=\"product-f-image\">Image</td>\n");
        out.write("                                                <td class=\"product-quantity\">Quantity</td>\n");
        out.write("                                                <td>Action</td>\n");
        out.write("                                            </tr>\n");
        out.write("                                        </thead>\n");
        out.write("                                        <tbody>\n");
        out.write("                                        <form action=\"ControllerCartBean\">\n");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            <tr>\n");
        out.write("                                                ");
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                <td colspan=\"2\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${add}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Add more</a></td>\n");
        out.write("                                                <td><input type=\"submit\" value=\"Remove\" name=\"action\" /></td>\n");
        out.write("                                            </tr>\n");
        out.write("                                        </form>\n");
        out.write("                                        </tbody>\n");
        out.write("                                    </table>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_1.setVar("count");
    _jspx_th_c_set_1.setValue(new String("0"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("rows");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.sanpham.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td class=\"product-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.sanpham.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td class=\"product-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.sanpham.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td class=\"product-price\"><img style=\"height:100px;width: 100px;\" src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.sanpham.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/></td>\n");
          out.write("                                                    <td class=\"product-quantity\"><input type=\"number\" size=\"4\" class=\"input-text qty text\" title=\"Qty\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" min=\"0\" step=\"1\"></td>\n");
          out.write("                                                    <td class=\"product-remove\"><input type=\"checkbox\" name=\"rmv\"\n");
          out.write("                                                                                      value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.sanpham.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /></td>\n");
          out.write("                                                </tr>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("count");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_0.setVar("add");
    _jspx_th_c_url_0.setValue("ControllerCartBean");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_0.setName("action");
    _jspx_th_c_param_0.setValue("AddMore");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }
}
