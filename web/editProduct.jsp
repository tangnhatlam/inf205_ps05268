<%-- 
    Document   : editProduct
    Created on : 02-10-2017, 22:31:59
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<link rel="stylesheet" href="style.css">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                                <li><a href="login.jsp"><i class="fa fa-user"></i>Log out</a></li>
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
                            <a href="cart.html">Cart - <span class="cart-amunt">$100</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a>
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
                            <li ><a href="products.jsp">Product</a></li>
                            <li><a href="newProduct.jsp">New Product</a></li>
                            <li class="active"><a href="customer_edit.jsp">Customer</a></li>
                        </ul>
                    </div>  
                </div>
            </div>
        </div> <!-- End mainmenu area -->
        <h1>Edit Product</h1>
        
        <div class="signup__container">

            <div class="container__child signup__form">
                <form action="ControllerProducts" class="form-control">
                    <div class="form-group">
                        Code:${SP.code}   <input type="hidden" name="txtCode" value="${SP.code}" class="form-control"/>

                    </div>
                    <div class="form-group">
                        <label>Name:</label>
                        <input type="text" name="txtName" value="${SP.name}" class="form-control"/><br/>
                    </div>
                    <div class="form-group">
                        <label>Price:</label>
                        <input type="text" name="txtPrice" value="${SP.price}" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label>Image:</label>
                        <image  style="height: 150px;width: 150px;" name="image" value="${SP.image}" src="img/${SP.image}" class="form-control"/><br/>
                        <input type="file" name="uploadFile"/>
                    </div>
                    <div class="form-group">
                        <input type="submit" name="action" value="Update"/>
                    </div> 

                </form>  
            </div>
        </div>
        
    </body>
</html>
