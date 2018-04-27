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
        <h1>Edit Customer</h1>

        <div class="signup__container">

            <div class="container__child signup__form">
                <form action="ControllerCustomer">

                    <label>Username:${ND.username}   <input type="hidden" name="txtUser" value="${ND.username}" class="form-control"/></label><br/>



                    <label>Password:</label>
                    <input type="text" name="txtPass" value="${ND.password}" class="form-control"/><br/>


                    <label>Last name:</label>
                    <input type="text" name="txtLast" value="${ND.hoten}" class="form-control"/>


                    <label>Gioi tinh(Nam check vao o con nu khong can check): </label><input type="checkbox" name="chkGT" value="gioitinh"/>

                    <br/>
                    <label>Email:</label>
                    <input type="text" name="txtEmail" value="${ND.email}" class="form-control"/>


                    <label>Quyen admin: </label><input type="checkbox" name="chkAdmin" value="admin" /><br/>


                    <input type="submit" name="action" value="Update"/>


                </form>  
            </div>
        </div>

    </body>
</html>
