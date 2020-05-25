<%-- 
    Document   : administrator
    Created on : 25 Μαϊ 2020, 10:58:39 πμ
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="windows-1253"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1253">
        <title>JSP Page</title>
   
        
        
        
        <!DOCTYPE html>

   
       
         
            <meta charset="utf-8" />
           
           
            <title>Inspired - Athens Fitness and Wellness Centre</title>
            
            
            <link rel="icon" type="image/x-icon" href="assets/img/wellness.png" />
            <!-- Font Awesome icons (free version)-->
            <script src="https://use.fontawesome.com/releases/v5.12.1/js/all.js" crossorigin="anonymous"></script>
            <!-- Google fonts-->
            <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
            <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
            <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
            <!-- Core theme CSS (includes Bootstrap)-->
       <!---  <link href="css/styles.css" rel="stylesheet" /> --> 
            <link href="css/styles.css" rel="stylesheet" />
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

       
        <title>Clients</title>
    </head>







    <body>



        <body id="page-top">
            <!-- Navigation-->
            <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
                <div class="container">
                    <a class="navbar-brand js-scroll-trigger" href="#page-top">Inspired<img src="assets/img/wellness.png" /></a><button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                   
                    <div class="collapse navbar-collapse" id="navbarResponsive">
                        <ul class="navbar-nav text-uppercase ml-auto my-2 my-lg-0">
                            <li class="nav-item"><a class="nav-link js-scroll-trigger" href="homepage.html">Home</a></li>
                            <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#services">Nutrition</a></li>
                            <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#service">Fitness</a></li>
                            <li class="nav-item"><a class="nav-link js-scroll-trigger" href="member.html">Members section</a></li>
                            <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#team">About</a></li>
                            <li class="nav-item"><a class="nav-link js-scroll-trigger" href="contactpage.html">Contact</a></li>
                            <li class="nav-item"><a class="nav-link portal-sign-in btn btn--full btn--ghost" href="">Login</a></li>
                            <li class="nav-item"><a class="nav-link js-SignUpBtn btn btn-orange btn--full" href="">SIGN UP</a></li>
                        
                           
                                
                       </ul>
                       
                    </div>
                </div>
            </nav>
            <!-- Masthead-->
            
                <div class="container">
                 
        
            

























        
        <!--Clients-->
        <div class="container-fluid" id="navbarid">
        </div>
        <div id="includedContent"></div>
        <h1>Clients</h1>
        <!--<h1>Users</h1>-->
        <div class="container">
            <table class="table table-hover">
                <thead class="bg-primary text-white">
                    <tr>
                        <th>First name</th>
                        <th>Last name</th>
                        <th>Product</th>
                        <th class="text-right"> Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${users}" var="user">
                        <tr>
                            <td>${user.firstName}</td>
                            <td>${user.lastName}</td>
                            <td>${user.email}</td>
        
                    <!--      <td align="right">
                                <a href="<c:url value='${editurl}/${user.id}' />" class="btn btn-warning">
                                    <span class="fa fa-pencil"></span> Update
                                </a>
                                <a href="<c:url value='${deleteurl}/${user.id}' />" class="btn btn-danger">
                                    <span class="fa fa-trash"></span> Delete
                                </a>
                        <!--        </td>-->  
                        </tr>
                </c:forEach>

                </tbody>

            </table>
            <a href="new" class="btn btn-success">
                <span class="fa fa-plus"></span> Add
            </a>
        </div>

        <div id="msg">${msg}</div>
    
    
    
    
    <!--All products purchased-->
    
     <div class="container-fluid" id="navbarid">
        </div>
        <div id="includedContent"></div>
        <h1>Oders' List</h1>
        <!--<h1>Users</h1>-->
        <div class="container">
            <table class="table table-hover">
                <thead class="bg-primary text-white">
                    <tr>
                        <th>Product name</th>
                        <th>Purchase Date</th>
                        <th>Clients</th>
                        <th class="text-right"> Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${orders}" var="order">
                        <tr>
                            <td>${product.name}</td>
                            <td>${order.purchaseDate}</td>
                            <td>${order.subscriptionsList}</td>
        
                        <!-- <td align="right">
                                <a href="<c:url value='${editurl}/${order.id}' />" class="btn btn-warning">
                                    <span class="fa fa-pencil"></span> Update
                                </a>
                                <a href="<c:url value='${deleteurl}/${order.id}' />" class="btn btn-danger">
                                    <span class="fa fa-trash"></span> Delete
                                </a>
                            </td>--> 
                        </tr>
                    </c:forEach>
  
                </tbody>

            </table>
            <a href="new" class="btn btn-success">
                <span class="fa fa-plus"></span> Add
            </a>
        </div>

        <div id="msg">${msg}</div>
    
    
    
 
    
    
    
    
    </body>
</html>
