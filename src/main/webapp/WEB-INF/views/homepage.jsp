<%-- 
    Document   : homepage
    Created on : 23 Μαϊ 2020, 10:43:10 μμ
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <meta name=”viewport” content="width=device-width" initial-scale=1  shrink-to-fit= no″>
        <meta charset="utf-8" />

        <meta name="description" content="" />
        <meta name="author" content="" />
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



    </head>

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
                    <
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead">
            <div class="container">
                <div class="masthead-subheading">We work for your mind, body and spirit</div>
                <div class="masthead-heading text-uppercase">Start the journey with us! </div>
                <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="#team">About us</a>
                <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="#services">Explore</a>
            </div>
        </header>

        <!-- Service-->
        <section class="page-section bg-light" id="team">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">INSPIRED</h2>
                    <h3 class="section-subheading text-muted">We are committed to a holistic and complex approach to your health.</h3>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="team-member">
                            <img class="mx-auto rounded-circle" src="assets/img/rate.png" alt="" />
                            <h4>Consultation</h4>
                            <p class="text-muted">The human body is a complex organism with the innate ability to heal itself when we learn how to listen to it and respond by supporting its needs.Our experts offer recommendations on herbs, nutritional supplements, lifestyle modification, exercise, detoxification and the concept of food-as-medicine to help put your health back on track.</p>

                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="team-member">
                            <img class="mx-auto rounded-circle" src="assets/img/nutricon.jpg" alt="" />
                            <h4>Nutrition</h4>
                            <p class="text-muted">Diet and exercise go hand-in-hand when it comes to health and fitness.Nutrition services can include programs to help with:
                                weight loss, muscle building, supplementation, increasing performance, diabetes management, or even kids and family meal planning</p>

                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="team-member">
                            <img class="mx-auto rounded-circle" src="assets/img/icon yogA.png" alt="" />
                            <h4>Fitness</h4>
                            <p class="text-muted">Getting the best results from your fitness routine takes more than hard work.With our specialists on your side, you will not only work out harder, but smarter.</p>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8 mx-auto text-center"><p class="large text-muted">
                            </button>
                            <a class="btn btn-outline-primary btn-md text-uppercase" href="about.html">Our story</a></div>

                </div>
            </div>
        </section>

        <!-- Nutrition Grid-->

        <section class="page-section bg-light" id="services">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">Nutrition</h2>
                    <h3 class="section-subheading text-muted">To eat is a necessity, but to eat intelligently is an art </h3>
                    <a class="btn btn-outline-primary" href="hover.html"> View All</a>

                </div>  
                <div class="container my-4">


                    <!--Carousel Wrapper-->
                    <div id="multi-item-example" class="carousel slide carousel-multi-item" data-ride="carousel">

                        <!--Controls-->
                        <div class="controls-top">


                            <a class="btn-floating" href="#multi-item-example" data-slide="prev"><i class="fa fa-chevron-left"></i></a>
                            <a class="btn-floating" href="#multi-item-example" data-slide="next"><i class="fa fa-chevron-right"></i></a>
                        </div>
                        <!--/.Controls-->

                        <!--Indicators-->
                        <ol class="carousel-indicators">
                            <li data-target="#multi-item-example" data-slide-to="0" class="active"></li>
                            <li data-target="#multi-item-example" data-slide-to="1"></li>
                            <li data-target="#multi-item-example" data-slide-to="2"></li>
                        </ol>
                        <!--/.Indicators-->

                        <!--Slides-->
                        <div class="carousel-inner" role="listbox">

                            <!--First slide-->
                            <div class="carousel-item active">

                                <div class="row">


                                    <div class="col-md-4">
                                        <div class="card mb-2">
                                            <img class="card-img-top" src="assets/img/medit.jpg"
                                                 alt="Card image cap">
                                            <div class="card-body">
                                                <h4 class="card-title">Mediterranean diet</h4>
                                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                    card's content.</p>
                                                <a class="btn btn-primary">Purchase</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-md-4 clearfix d-none d-md-block">
                                        <div class="card mb-2">
                                            <img class="card-img-top" src="assets/img/steak2.jpg"
                                                 alt="Card image cap">
                                            <div class="card-body">
                                                <h4 class="card-title">Protein diet</h4>
                                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                    card's content.</p>
                                                <a class="btn btn-primary">Purchase</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-md-4 clearfix d-none d-md-block">
                                        <div class="card mb-2">
                                            <img class="card-img-top" src="assets/img/finalketo.jpg"
                                                 alt="Card image cap">
                                            <div class="card-body">
                                                <h4 class="card-title">Keto diet</h4>
                                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                    card's content.</p>
                                                <a class="btn btn-primary">Purchase</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <!--/.First slide-->

                            <!--Second slide-->
                            <div class="carousel-item">

                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="card mb-2">
                                            <img class="card-img-top" src="assets/img/thispaleo.jpg"
                                                 alt="Card image cap">
                                            <div class="card-body">
                                                <h4 class="card-title">Paleo diet</h4>
                                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                    card's content.</p>
                                                <a class="btn btn-primary">Purchase</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-md-4 clearfix d-none d-md-block">
                                        <div class="card mb-2">
                                            <img class="card-img-top" src="assets/img/finalmacro.jpg"
                                                 alt="Card image cap">
                                            <div class="card-body">
                                                <h4 class="card-title">Macrobiotic diet</h4>
                                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                    card's content.</p>
                                                <a class="btn btn-primary">Purchase</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-md-4 clearfix d-none d-md-block">
                                        <div class="card mb-2">
                                            <img class="card-img-top" src="assets/img/mush.jpg"
                                                 alt="Card image cap">
                                            <div class="card-body">
                                                <h4 class="card-title">Homemade diet</h4>
                                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                    card's content.</p>
                                                <a class="btn btn-primary">Purchase</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <!--/.Second slide-->



                        </div>
                        <!--/.Slides-->

                    </div>
                    <!--/.Carousel Wrapper-->
                    </section>
















                    <!--Fitness grid-->

                    <section class="page-section bg-light" id="service">
                        <div class="container">
                            <div class="text-center">
                                <h2 class="section-heading text-uppercase">Fitness</h2>
                                <h3 class="section-subheading text-muted">Only a healthy and strong body creates a healthy mind and soul</h3>
                                <a class="btn btn-outline-primary" href="fitness.html"> View All</a>
                            </div>
                            <div class="container my-4">


                                <!--Carousel Wrapper-->
                                <div id="multi-item-example2" class="carousel slide carousel-multi-item" data-ride="carousel">

                                    <!--Controls-->
                                    <div class="controls-top">
                                        <a class="btn-floating" href="#multi-item-example2" data-slide="prev"><i class="fa fa-chevron-left"></i></a>
                                        <a class="btn-floating" href="#multi-item-example2" data-slide="next"><i class="fa fa-chevron-right"></i></a>
                                    </div>
                                    <!--/.Controls-->

                                    <!--Indicators-->
                                    <ol class="carousel-indicators">
                                        <li data-target="#multi-item-example2" data-slide-to="0" class="active"></li>
                                        <li data-target="#multi-item-example2" data-slide-to="1"></li>
                                        <li data-target="#multi-item-example2" data-slide-to="2"></li>
                                    </ol>
                                    <!--/.Indicators-->

                                    <!--Slides-->
                                    <div class="carousel-inner" role="listbox">

                                        <!--First slide-->
                                        <div class="carousel-item active">

                                            <div class="row">
                                                <div class="col-md-4">
                                                    <div class="card mb-2">
                                                        <img class="card-img-top" src="assets/img/yoga.jpg"
                                                             alt="Card image cap">
                                                        <div class="card-body">
                                                            <h4 class="card-title">Yoga</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                                card's content.</p>
                                                            <a class="btn btn-primary">Purchase</a>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="col-md-4 clearfix d-none d-md-block">
                                                    <div class="card mb-2">
                                                        <img class="card-img-top" src="assets/img/boot.jpg"
                                                             alt="Card image cap">
                                                        <div class="card-body">
                                                            <h4 class="card-title">Bootcamp classes</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                                card's content.</p>
                                                            <a class="btn btn-primary">Purchase</a>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="col-md-4 clearfix d-none d-md-block">
                                                    <div class="card mb-2">
                                                        <img class="card-img-top" src="assets/img/weight.jpg"
                                                             alt="Card image cap">
                                                        <div class="card-body">
                                                            <h4 class="card-title">Weight training</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                                card's content.</p>
                                                            <a class="btn btn-primary">Purchase</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                        <!--/.First slide-->

                                        <!--Second slide-->
                                        <div class="carousel-item">

                                            <div class="row">
                                                <div class="col-md-4">
                                                    <div class="card mb-2">
                                                        <img class="card-img-top" src="assets/img/ptr.jpg"
                                                             alt="Card image cap">
                                                        <div class="card-body">
                                                            <h4 class="card-title">Personal coaching</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                                card's content.</p>
                                                            <a class="btn btn-primary">Purchase</a>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="col-md-4 clearfix d-none d-md-block">
                                                    <div class="card mb-2">
                                                        <img class="card-img-top" src="assets/img/ccc.jpeg"
                                                             alt="Card image cap">
                                                        <div class="card-body">
                                                            <h4 class="card-title">Crossfit</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                                card's content.</p>
                                                            <a class="btn btn-primary">Purchase</a>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="col-md-4 clearfix d-none d-md-block">
                                                    <div class="card mb-2">
                                                        <img class="card-img-top" src="assets/img/box.jpg"
                                                             alt="Card image cap">
                                                        <div class="card-body">
                                                            <h4 class="card-title">Boxing</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                                                card's content.</p>
                                                            <a class="btn btn-primary">Purchase</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                        <!--/.Second slide-->



                                    </div>
                                    <!--/.Slides-->

                                </div>
                                <!--/.Carousel Wrapper-->

                            </div>
                    </section>

                    <!-- Contact-->
                    <section class="page-section" id="contact">
                        <div class="container">
                            <div class="text-center">
                                <h2 class="section-heading text-uppercase">Leave us a message!</h2>
                                <h3 class="section-subheading text-muted">Lorem ipsum dolor sit amet consectetur.</h3>
                            </div>
                            <form id="contactForm" name="sentMessage" novalidate="novalidate">
                                <div class="row align-items-stretch mb-5">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input class="form-control" id="name" type="text" placeholder="Your Name *" required="required" data-validation-required-message="Please enter your name." />
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" id="email" type="email" placeholder="Your Email *" required="required" data-validation-required-message="Please enter your email address." />
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group mb-md-0">
                                            <input class="form-control" id="phone" type="tel" placeholder="Your Phone *" required="required" data-validation-required-message="Please enter your phone number." />
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group form-group-textarea mb-md-0">
                                            <textarea class="form-control" id="message" placeholder="Your Message *" required="required" data-validation-required-message="Please enter a message."></textarea>
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="text-center">
                                    <div id="success"></div>
                                    <button class="btn btn-primary btn-xl text-uppercase" id="sendMessageButton" type="submit">Send Message</button>
                                </div>
                            </form>
                        </div>
                    </section>
                    <!-- Footer-->
                    <footer class="footer py-4">
                        <div class="container">
                            <div class="row align-items-center">
                                <div class="col-lg-4 text-lg-left">Copyright © Inspired 2020</div>
                                <div class="col-lg-4 my-3 my-lg-0">
                                    <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-twitter"></i></a><a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a><a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-linkedin-in"></i></a>
                                </div>
                                <div class="col-lg-4 text-lg-right"><a class="mr-3" href="#!">Privacy Policy</a><a href="#!">Terms of Use</a></div>
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



