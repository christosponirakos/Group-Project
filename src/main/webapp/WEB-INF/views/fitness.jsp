<%-- 
    Document   : fitness
    Created on : 23 Μαϊ 2020, 11:08:32 μμ
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <head>
         <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/styles.css" rel="stylesheet" />

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">
    <link rel="icon" type="image/x-icon" href="assets/img/wellness.png" />

    <title>Fitness products</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
        <style>


        header.masthead {
            padding-top: 10.5rem;
            padding-bottom: 6rem;
            text-align: center;
            color: rgb(13, 27, 32);
            background-image: url("../assets/img/gym2.jpg");
            background-repeat: no-repeat;
            background-attachment: scroll;
            background-position: center center;
            background-size: cover;
        }
        .hovereffect {
            width: 100%;
            height: 100%;
            float: left;
            overflow: hidden;
            position: relative;
            text-align: center;
            cursor: default;
            background: #147997;
        }

        .hovereffect .overlay {
            width: 100%;
            height: 100%;
            position: absolute;
            overflow: hidden;
            top: 0;
            left: 0;
            padding: 50px 20px;
        }

        .hovereffect img {
            display: block;
            position: relative;
            max-width: none;
            width: calc(100% + 20px);
            -webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
            transition: opacity 0.35s, transform 0.35s;
            -webkit-transform: translate3d(-10px, 0, 0);
            transform: translate3d(-10px, 0, 0);
            -webkit-backface-visibility: hidden;
            backface-visibility: hidden;
        }

        .hovereffect:hover img {
            opacity: 0.4;
            filter: alpha(opacity=40);
            -webkit-transform: translate3d(0, 0, 0);
            transform: translate3d(0, 0, 0);
        }

        .hovereffect h2 {
            text-transform: uppercase;
            color: #fff;
            text-align: center;
            position: relative;
            font-size: 17px;
            overflow: hidden;
            padding: 0.5em 0;
            background-color: transparent;
        }

        .hovereffect h2:after {
            position: absolute;
            bottom: 0;
            left: 0;
            width: 100%;
            height: 2px;
            background: #fff;
            content: '';
            -webkit-transition: -webkit-transform 0.35s;
            transition: transform 0.35s;
            -webkit-transform: translate3d(-100%, 0, 0);
            transform: translate3d(-100%, 0, 0);
        }

        .hovereffect:hover h2:after {
            -webkit-transform: translate3d(0, 0, 0);
            transform: translate3d(0, 0, 0);
        }

        .hovereffect a,
        .hovereffect p {
            color: #FFF;
            opacity: 0;
            filter: alpha(opacity=0);
            -webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
            transition: opacity 0.35s, transform 0.35s;
            -webkit-transform: translate3d(100%, 0, 0);
            transform: translate3d(100%, 0, 0);
        }

        .hovereffect:hover a,
        .hovereffect:hover p {
            opacity: 1;
            filter: alpha(opacity=100);
            -webkit-transform: translate3d(0, 0, 0);
            transform: translate3d(0, 0, 0);
        }
        
    </style>

</head>

<body id="page-top">
    <!-- Navigation-->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
        <div class="container">
            <a class="navbar-brand js-scroll-trigger" href="#page-top"><img src="assets/img/wellness.png" /></a><button
                class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false"
                aria-label="Toggle navigation">Menu<i class="fas fa-bars ml-1"></i></button>



            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav text-uppercase ml-auto">
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="homepage.html">Home</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="hover.html">Nutrition</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="fitness.html">Fitness</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="member.html">Members section</a>
                    </li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="about.html">About</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="contactpage.html">Contact</a></li>
                    <li class="nav-item"><a class="nav-link portal-sign-in btn btn--full btn--ghost"
                            href="log.html">Login</a></li>
                </ul>
            </div>
        </div>






        <form class="form-inline my-2 my-lg-0">
            <div class="input-group input-group-sm">
                <input type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm"
                    placeholder="Search...">
                <div class="input-group-append">
                    <button type="button" class="btn btn-secondary btn-number">
                        <i class="fa fa-search"></i>
                    </button>
                </div>
            </div>
            <a class="btn btn-primary btn-sm ml-3" href="shoppingcard.html">
                <i class="fa fa-shopping-cart"></i> My Shopping Card
                <span class="badge badge-light"></span>
            </a>
        </form>
        </div>
        </div>
    </nav>

    <!-- Masthead-->
    <header class="masthead">
        <div class="container">
            <section class="page-section bg-light" id="services">
                <div class="container">
                    <div class="text-center">
                        <h2 class="section-heading text-uppercase">Fitness</h2>
                        <h3 class="section-subheading text-muted">Only a healthy and strong body creates a healthy mind
                            and soul</h3>
                    </div>
                    <div class="row">





                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--    <div class="services-item">
                               <a class="services1-link" data-toggle="modal" href="#services1"
                                        ><div class="services1-hover">
                                            <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                        </div> -->
                                    <img class="img-fluid" src="assets/img/boot.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>Bootcamp classes</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                    </div>
                                    <div class="services-caption">
                                        <!--  <div class="services-caption-heading">Bootcamp classes</div>-->
                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                        


                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--    <div class="services-item">
                                <a class="services1-link" data-toggle="modal" href="#services1"
                                         ><div class="services1-hover">
                                             <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                         </div> -->
                                    <img class="img-fluid" src="assets/img/fit2.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>CROSSFIT</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                </div>
                                    <div class="services-caption">
                                        <!--  <div class="services-caption-heading">Crossfit</div>-->
                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                        

                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--    <div class="services-item">
                               <a class="services1-link" data-toggle="modal" href="#services1"
                                        ><div class="services1-hover">
                                            <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                        </div> -->
                                    <img class="img-fluid" src="assets/img/fit6.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>BOXING</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                </div>
                                    <div class="services-caption">
                                        <!--   <div class="services-caption-heading">Boxing </div>-->

                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                  
                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--  <a class="services2-link" data-toggle="modal" href="#services2"
            ><div class="services2-hover">
                <div class="services2-hover-content"><i class="fas fa-plus fa-3x"></i></div>
            </div>-->
                                    <img class="img-fluid" src="assets/img/w.jpeg" alt="" />
                                    <div class="overlay">
                                        <h2>WEIGHT TRAINING</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                </div>
                                    <div class="services-caption">
                                        <!--  <div class="services-caption-heading">Weight training</div>-->
                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                       
                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--    <div class="services-item">
           <a class="services1-link" data-toggle="modal" href="#services1"
                    ><div class="services1-hover">
                        <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                    </div> -->
                                    <img class="img-fluid" src="assets/img/eld.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>ELDERLY STRENGTH TRAINING</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div> 
                                </div>
                                    <div class="services-caption">
                                   
                               
                                        <!--- <div class="services-caption-heading">Elderly Strength training</div>-->
                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                       



                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--    <div class="services-item">
                               <a class="services1-link" data-toggle="modal" href="#services1"
                                        ><div class="services1-hover">
                                            <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                        </div> -->
                                    <img class="img-fluid" src="assets/img/fit5.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>CYCLING</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                </div>
                                    <div class="services-caption">
                                   
                                        <!---  <div class="services-caption-heading">Cycling</div>-->
                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                      

                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--    <div class="services-item">
                               <a class="services1-link" data-toggle="modal" href="#services1"
                                        ><div class="services1-hover">
                                            <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                        </div> -->
                                    <img class="img-fluid" src="assets/img/yoga.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>YOGA</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                </div>
                                    <div class="services-caption">
                                        <!--    <div class="services-caption-heading">Yoga</div> -->
                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                      






                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--        <a class="services1-link" data-toggle="modal" href="#services1"
                                 ><div class="services1-hover">
                                     <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                 </div> -->
                                    <img class="img-fluid" src="assets/img/personal.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>PERSONAL TRAINING</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                </div>
                                    <div class="services-caption">
                                        <!---   <div class="services-caption-heading">Personal Training </div>-->
                                        <div class="services-caption-subheading text-muted">Explore a 3-month training
                                            plan and take advantage of professional consultation, body composition
                                            report and analysis, warm-up, cool down, and a recommended exercise plan
                                            that address each participants’ goals</div>
                                    </div>
                                </div>
                            </div>
                      


                        <div class="col-lg-4 col-sm-6 mb-4">
                            <div class="services-item">
                                <div class="hovereffect">
                                    <!--    <div class="services-item">
                               <a class="services1-link" data-toggle="modal" href="#services1"
                                        ><div class="services1-hover">
                                            <div class="services1-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                        </div> -->
                                    <img class="img-fluid" src="assets/img/FAMILY.jpg" alt="" />
                                    <div class="overlay">
                                        <h2>FAMILY TRAINING</h2>
                                        <p><a href="#">PURCHASE</a></p>
                                    </div>
                                </div>
                                    <div class="services-caption">
                                        <!--  <div class="services-caption-heading">Family training</div>-->
                                        <div class="services-caption-subheading text-muted">Create an individualized
                                            workout and training regimen for you. All of this is designed for you to be
                                            able to meet your personal fitness goals.</div>
                                    </div>
                                </div>
                            </div>
                        


            </section>

            <!-- Footer-->
            <footer class="footer py-4">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-lg-4 text-lg-left">Copyright © Inspired 2020</div>
                        <div class="col-lg-4 my-3 my-lg-0">
                            <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-twitter"></i></a><a
                                class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a><a
                                class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-linkedin-in"></i></a>
                        </div>
                        <div class="col-lg-4 text-lg-right"><a class="mr-3" href="#!">Privacy Policy</a><a
                                href="#!">Terms of Use</a></div>
                    </div>
                </div>
            </footer>





            <!-- Bootstrap core JS-->
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
            <!-- Third party plugin JS-->
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
            <!-- Core theme JS-->
            <script src="js/scripts.js"></script>



</body>

</html>
    
