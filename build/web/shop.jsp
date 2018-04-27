<%-- 
    Document   : index
    Created on : 02-10-2017, 22:08:47
    Author     : Administrator
--%>
<%@page import="java.util.ArrayList"%>
<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet" href="css/font-awesome.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="css/responsive.css">
<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="style.css">
<!DOCTYPE html>
<!--
        ustora by freshdesignweb.com
        Twitter: https://twitter.com/freshdesignweb
        URL: https://www.freshdesignweb.com/ustora/
-->
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Shop Page- Ustora Demo</title>

        <!-- Google Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>

        <div class="header-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="user-menu">
                            <ul>
                                <li><a href="#"><i class="fa fa-user"></i>${sessionScope.USER}</a></li>
                                <li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>
                                <li><a href="#"><i class="fa fa-user"></i> My Cart</a></li>
                                <li><a href="#"><i class="fa fa-user"></i> Checkout</a></li>
                                <li><a href="login.jsp"><i class="fa fa-user"></i> Login</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="header-right">
                            <ul class="list-unstyled list-inline">
                                <li class="dropdown dropdown-small">
                                    <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">currency :</span><span class="value">USD </span><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">USD</a></li>
                                        <li><a href="#">INR</a></li>
                                        <li><a href="#">GBP</a></li>
                                    </ul>
                                </li>

                                <li class="dropdown dropdown-small">
                                    <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">language :</span><span class="value">English </span><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">English</a></li>
                                        <li><a href="#">French</a></li>
                                        <li><a href="#">German</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End header area -->

        <div class="site-branding-area">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="logo">
                            <h1><a href="./"><img src="img/logo.png"></a></h1>
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <div class="shopping-item">
                            <a href="showcart.jsp">Cart - <span class="cart-amunt"></span> <i class="fa fa-shopping-cart"></i> <span class="product-count"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End site branding area -->

        <div class="mainmenu-area">
            <div class="container">
                <div class="row">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div> 
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="index.jsp">Home</a></li>
                            <li class="active"><a href="shop.jsp">Shop page</a></li>
                            <li><a href="showcart.jsp">Cart</a></li>
                        </ul>
                    </div>  
                </div>
            </div>
        </div> <!-- End mainmenu area -->

        <div class="product-big-title-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="product-bit-title text-center">
                            <h2>Shop</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="single-product-area">
            <div class="zigzag-bottom"></div>
            <div class="container">
                <div class="row">
                    <div>
                        <%
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
                        %>
                        <ul class="pagination">    
                            <%                //Button Previous
                                int back = 0;
                                if (pages == 0 || pages == 1) {
                                    back = 1;//Luon la page 1
                                } else {
                                    back = pages - 1;//Neu pages tu 2 tro len thi back tru 1
                                }
                            %>
                            <li><a href="shop.jsp?pages=<%=back%>"><i></i><<</a></li>
                                        <%
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
                                            for (int i = 1; i <= loop; i++) {%>
                                        <% if (pages == i) {%> 

                            <li><span><a href="shop.jsp?pages=<%=i%>"><%=i%></a></span></li>
                                        <%} else {%>
                            <li><a href="shop.jsp?pages=<%=i%>"><%=i%></a> </li>

                            <%}
            }%>
                            <%
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
                            %>
                            <li ><a href="shop.jsp?pages=<%=next%>"><i class="next"></i>>></a></li>
                        </ul>
                    </div>

                </div>

                
            </div>
        </div>


        <div class="footer-top-area">
            <div class="zigzag-bottom"></div>
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="footer-about-us">
                            <h2>u<span>Stora</span></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>
                            <div class="footer-social">
                                <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">User Navigation </h2>
                            <ul>
                                <li><a href="">My account</a></li>
                                <li><a href="">Order history</a></li>
                                <li><a href="">Wishlist</a></li>
                                <li><a href="">Vendor contact</a></li>
                                <li><a href="">Front page</a></li>
                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">Categories</h2>
                            <ul>
                                <li><a href="">Mobile Phone</a></li>
                                <li><a href="">Home accesseries</a></li>
                                <li><a href="">LED TV</a></li>
                                <li><a href="">Computer</a></li>
                                <li><a href="">Gadets</a></li>
                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-newsletter">
                            <h2 class="footer-wid-title">Newsletter</h2>
                            <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                            <div class="newsletter-form">
                                <input type="email" placeholder="Type your email">
                                <input type="submit" value="Subscribe">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-bottom-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="copyright">
                            <p>&copy; 2015 uCommerce. All Rights Reserved. <a href="http://www.freshdesignweb.com" target="_blank">freshDesignweb.com</a></p>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="footer-card-icon">
                            <i class="fa fa-cc-discover"></i>
                            <i class="fa fa-cc-mastercard"></i>
                            <i class="fa fa-cc-paypal"></i>
                            <i class="fa fa-cc-visa"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Latest jQuery form server -->
        <script src="https://code.jquery.com/jquery.min.js"></script>

        <!-- Bootstrap JS form CDN -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

        <!-- jQuery sticky menu -->
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.sticky.js"></script>

        <!-- jQuery easing -->
        <script src="js/jquery.easing.1.3.min.js"></script>

        <!-- Main Script -->
        <script src="js/main.js"></script>
    </body>
</html>