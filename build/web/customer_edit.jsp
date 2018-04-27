<%-- 
    Document   : products
    Created on : 02-10-2017, 21:56:56
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="style.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                            <li><a href="index_admin.jsp">Home</a></li>
                            <li><a href="products.jsp">Product</a></li>
                            <li><a href="newProduct.jsp">New Product</a></li>
                            <li class="active"><a href="customer_edit.jsp">Customer</a></li>
                        </ul>
                    </div>  
                </div>
            </div>
        </div> <!-- End mainmenu area -->
        <h1>Customer</h1>
        <form action="ControllerCustomer">
            Nhập tên SP: <input type="text" name="txtTen" value=""/>
            <input type="submit" name="action" value="Search"/>
        </form>
        <table border="1" class="shop_table">
            <tr>
                <td class="product-name">Username</td>
                <td class="product-price">Password</td>
                <td>Last name</td>
                <td>Gioi tinh</td>
                <td>Email</td>
                <td>Role</td>
                <td class="product-remove">Edit</td>
                <td class="product-remove">Delete</td>
            </tr>
            <c:forEach var="rows" items="${listND}">
                <form action="ControllerCustomer">
                    <tr>
                        <td>${rows.username}</td>
                        <td class="product-name">${rows.password}</td>
                        <td class="product-price">${rows.hoten}</td>
                        <td>${rows.gioitinh}</td>
                        <td>${rows.email}</td>
                        <td>${rows.role}</td>
                            <c:url var="del" value="ControllerCustomer">
                                <c:param name="action" value="Edit"/>
                                <c:param name="txtUser" value="${rows.username}"/>
                                <c:param name="txtPass" value="${rows.password}"/>
                                <c:param name="txtLast" value="${rows.hoten}"/>
                                <c:param name="txtGT" value="${rows.gioitinh}"/>
                                <c:param name="txtEmail" value="${rows.email}"/>
                                <c:param name="txtRole" value="${rows.role}"/>
                            </c:url>

                        <td class="product-remove"><a href="${del}" style="text-decoration: none;">Edit</a></td>
                        <td>
                            <input type="hidden" name="txtUser" value="${rows.username}"/>
                            <input type="submit" name="action" value="Delete"/>
                        </td>
                    </tr>
                </form>
            </c:forEach>

        </table>
        <br/>
    </body>
</html>
