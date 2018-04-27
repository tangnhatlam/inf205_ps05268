<%-- 
    Document   : register
    Created on : Oct 20, 2017, 11:35:00 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Login Form</title>
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
        <script>
            @function remy($value) {
            @return ($value / 16px) * 1rem;
            }
        </script>
        <style>



            body {
                font: 100% / 1.414 "Open Sans", "Roboto", arial, sans-serif;
                background: #e9e9e9;
            }
            a,
            [type="submit"] {transition: all .25s ease-in;}
            
            
            
            .signup__thumbnail {
                position: relative;
                padding: 2rem;
                display: flex;
                flex-wrap: wrap;
                align-items: center;
                background: url(http://ultraimg.com/images/spectre-login.jpg);
                background-repeat: no-repeat;
                background-position: top center;
                background-size: cover;
            }
            .thumbnail__logo,
            .thumbnail__content,
            .thumbnail__links {
                position: relative;
                z-index: 2;  
            }
            .thumbnail__logo {align-self: flex-start;}
            .logo__shape {fill: #fff;}
            .logo__text {
                display: inline-block;
                font-size: .8rem;
                font-weight: 700;
                vertical-align: bottom;
            }
            .thumbnail__content {align-self: center;}
            h1,
            h2 {
                font-weight: 300;
                color: rgba(255,255,255,1);
            }
            .heading--primary {font-size: 1.999rem;}
            .heading--secondary {font-size: 1.414rem;}
            .thumbnail__links {
                align-self: flex-end;
                width: 100%;
            }
            .thumbnail__links a {
                font-size: 1rem;
                color: #fff;
                &:focus,
                    &:hover {color: rgba(255,255,255,.5);}
            }
            .signup__form {
                padding: 2.5rem;
                background: #fafafa;
            }
            label {
                font-size: .85rem;
                text-transform: uppercase;
                color: #ccc;
            }
            .form-control {
                background-color: transparent;
                border-top: 0;
                border-right: 0;
                border-left: 0;
                border-radius: 0;
                &:focus {border-color: #111;}
            }
            [type="text"] {color: #111;}
            [type="password"] {color: #111;}
            .btn--form {
                padding: .5rem 2.5rem;
                font-size: .95rem;
                font-weight: 600;
                text-transform: uppercase;
                color: #fff;
                background: #111;
                border-radius: remy(35px);
                &:focus,
                    &:hover {background: lighten(#111, 13%);}
            }
            .signup__link {
                font-size: .8rem;
                font-weight: 600;
                text-decoration: underline;
                color: #999;
                &:focus,
                    &:hover {color: darken(#999, 13%);}
            }
        </style>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>

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
                            <li><a href="products.jsp">Product</a></li>
                            <li><a href="showcart.jsp">Cart</a></li>
                        </ul>
                    </div>  
                </div>
            </div>
        </div> <!-- End mainmenu area -->
        <div class="signup__container">
           
            <div class="container__child signup__form">
                <form action="ControllerCustomer" method="post">
                    <div class="form-group">
                        <label>Username</label>
                        <input class="form-control" type="text" name="username" id="username" placeholder="tangnhatlam" required />
                    </div>
                    <div class="form-group">
                        <label>Email</label>
                        <input class="form-control" type="text" name="email" id="email" placeholder="lamtnps05268@gmail.com" required />
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input class="form-control" type="password" name="password" id="password" placeholder="********" required />
                    </div>
                    <div class="form-group">
                        <label>Lastname</label>
                        <input class="form-control" type="text" name="lastname" id="username" placeholder="Tang Nhat Lam" required />
                    </div>
                    <div class="form-group">
                        <label>Admin</label><input type="checkbox" name="chkAdmin" value="ADMIN" />
                    </div>
                    <div class="form-group">
                        <label>Gioi tinh(Nam check vao o con nu khong can check): </label><input type="checkbox" name="chkGT" value="gioitinh" />
                    </div>
                    <div class="m-t-lg">
                        <ul class="list-inline">
                            <li>
                                <input class="btn btn--form" type="submit" name="action" value="Register" />
                            </li>

                        </ul>
                    </div>
                </form>  
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
    </body>
</html>
