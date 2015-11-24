<%--
  Created by IntelliJ IDEA.
  User: brunyatko
  Date: 23.11.15
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Contact</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <style>
        .jumbotron {
            background-color: #00bfff;
            color: #fff;
            padding: 100px 25px;
        }
        .bg-grey {
            background-color: #f6f6f6;
        }
        .container-fluid {
            padding: 60px 50px;
        }
        .logo-small {
            color: #0000ff;
            font-size: 20px;
        }
        .logo {
            color: #0000ff;
            font-size: 200px;
        }
        .thumbnail {
            padding: 0 0 15px 0;
            border: none;
            border-radius: 0;
        }
        .thumbnail img {
            width: 100%;
            height: 100%;
            margin-bottom: 10px;
        }
        .navbar {
            margin-bottom: 0;
            background-color: #00bfff;
            z-index: 9999;
            border: 0;
            font-size: 12px !important;
            line-height: 1.42857143 !important;
            letter-spacing: 4px;
            border-radius: 0;
            font-family: Montserrat, sans-serif;
        }
        .navbar li a, .navbar .navbar-brand {
            color: #fff !important;
        }
        .navbar-nav li a:hover, .navbar-nav li.active a {
            color: #00bfff !important;
            background-color: #fff !important;
        }
        .navbar-default .navbar-toggle {
            border-color: transparent;
            color: #fff !important;
        }
        footer .glyphicon {
            font-size: 20px;
            margin-bottom: 20px;
            color: #00bfff;
        }
        .slideanim {
            visibility:hidden;
        }
        .slide {
            animation-name: slide;
            -webkit-animation-name: slide;
            animation-duration: 1s;
            -webkit-animation-duration: 1s;
            visibility: visible;
        }
        @keyframes slide {
            0% {
                opacity: 0;
                -webkit-transform: translateY(70%);
            }
            100% {
                opacity: 1;
                -webkit-transform: translateY(0%);
            }
        }
        @-webkit-keyframes slide {
            0% {
                opacity: 0;
                -webkit-transform: translateY(70%);
            }
            100% {
                opacity: 1;
                -webkit-transform: translateY(0%);
            }
        }

        @media screen and (max-width: 768px) {
            .col-sm-4 {
                text-align: center;
                margin: 25px 0;
            }
        }
    </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#myPage">Friend Zone</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#about">ABOUT</a></li>
                <li><a href="#contact">CONTACT</a></li>
                <li><a href="#album">ALBUM</a></li>
                <li><a href="#friends">FRIENDS</a></li>
                <li><a href="#hobby">HOBBY</a></li>
                <li><a href="#message">MESSAGE</a></li>
                <li><a href="#post">POST</a></li>
                <li><a href="#place">PLACE</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="jumbotron text-center">
    <h1>Friend Zone</h1>
    <%--<p>We specialize in blablabla</p>--%>
    <form class="form-inline">
        <input type="email" class="form-control" size="50" placeholder="Contact name" required>
        <button type="button" class="btn btn-primary">Search</button>
    </form>
</div>

<!-- Container (About Section) -->
<div id="about" class="container-fluid">
    <div class="row">
        <div class="col-sm-8">
            <h2>About Friend Zone Page</h2>
            <%--<h4>Lorem ipsum..</h4>--%>
            <%--<p>Lorem ipsum..</p>--%>
            <button class="btn btn-default btn-lg">Add new Contact</button>
        </div>
    </div>
</div>

<div class="container-fluid bg-grey">
    <div class="row">
        <div class="col-sm-4">
            <span class="glyphicon glyphicon-globe logo"></span>
        </div>
        <div class="col-sm-8">
            <h2>Our Values</h2>
            <h4><strong>MISSION:</strong> Our mission lorem ipsum..</h4>
            <p><strong>VISION:</strong> Our vision Lorem ipsum..</p>
        </div>
    </div>
</div>

<!-- Container (Contact Section) -->
<div id="contact" class="container-fluid text-center bg-grey">
    <h2>CONTACT</h2>
    <img src="bird.jpg" class="img-responsive img-circle" style="display:inline" alt="Bird" width="350" height="350">
    <h4><strong>My Name:</strong> Elena Bruyako</h4>
    <h4><strong>My Birthdate:</strong> 1990-08-02</h4>
</div>

<!-- Container (Album Section) -->
<div id="album" class="container-fluid text-center bg-grey">
    <h2>ALBUM</h2><br>
    <h4>Where I was</h4>
    <div class="row text-center">
        <div class="col-sm-4">
            <div class="thumbnail">
                <img src="paris.jpg" alt="Paris" width="400" height="300">
                <p><strong>Paris</strong></p>
                <%--<p>Yes, we built Paris</p>--%>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <img src="newyork.jpg" alt="New York" width="400" height="300">
                <p><strong>New York</strong></p>
                <%--<p>We built New York</p>--%>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <img src="sanfran.jpg" alt="San Francisco" width="400" height="300">
                <p><strong>San Francisco</strong></p>
                <%--<p>Yes, San Fran is ours</p>--%>
            </div>
        </div>
    </div>
</div>

<!-- Container (Friend Section) -->
<div id="friends" class="container-fluid text-center bg-grey">
    <h2>Friends</h2><br>
    <div class="row text-center">
        <div class="col-sm-4">
            <div class="thumbnail">
                <img src="bird.jpg" class="img-responsive img-circle margin" style="display:inline" alt="Bird" width="350" height="350">
                <h4><strong>Name:</strong> Anton Valiuh</h4>
                <h4><strong>Birthdate:</strong> 1987-05-11</h4>
                <%--<p>Yes, we built Paris</p>--%>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <img src="bird.jpg" class="img-responsive img-circle margin" style="display:inline" alt="Bird" width="350" height="350">
                <h4><strong>Name:</strong> Julia Oleksenko</h4>
                <h4><strong>Birthdate:</strong> 1989-12-26</h4>
                <%--<p>We built New York</p>--%>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <img src="bird.jpg" class="img-responsive img-circle margin" style="display:inline" alt="Bird" width="350" height="350">
                <h4><strong>Name:</strong> Elena Bruyako</h4>
                <h4><strong>Birthdate:</strong> 1990-08-02</h4>
                <%--<p>Yes, San Fran is ours</p>--%>
            </div>
        </div>
    </div>
</div>

<!-- Container (Hobby Section) -->
<div id="hobby" class="container-fluid text-center bg-grey">
    <h2>HOBBY</h2><br>
    <div class="row text-right">
        <p>Add new Hobby:
            <button type="button" class="btn btn-default btn-sm">
                <span class="glyphicon glyphicon-plus"></span> Add
            </button>
        </p>
    </div>
    <div class="row text-center">
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
    </div>
</div>

<!-- Container (Post Section) -->
<div id="post" class="container-fluid text-center bg-grey">
    <h2>POST</h2><br>
    <div class="row text-right">
        <p>Add new Post:
            <button type="button" class="btn btn-default btn-sm">
                <span class="glyphicon glyphicon-plus"></span> Add
            </button>
        </p>
    </div>
    <div class="row text-center">
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
    </div>
</div>

<!-- Container (Place Section) -->
<div id="place" class="container-fluid text-center bg-grey">
    <h2>PLACE</h2><br>
    <div class="row text-right">
        <p>Add new Place:
            <button type="button" class="btn btn-default btn-sm">
                <span class="glyphicon glyphicon-plus"></span> Add
            </button>
        </p>
    </div>
    <div class="row text-center">
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="thumbnail">
                <h2>Title</h2>
                <h4><strong>Description:</strong> lorem ipsum..</h4>
                <%--<p><strong>Title</strong></p>--%>
                <%--<p>Discription</p>--%>
                <p>
                    <a href="#">
                        <span class="glyphicon glyphicon-remove"></span>
                    </a>
                </p>
            </div>
        </div>
    </div>
</div>

<!-- Container (GoogleMap Section) -->
<div id="googleMap" style="height:400px;width:100%;"></div>

<!-- Add Google Maps -->
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script>
    var myCenter = new google.maps.LatLng(48.461464, 35.050156);

    function initialize() {
        var mapProp = {
            center:myCenter,
            zoom:12,
            scrollwheel:true,
            draggable:true,
            mapTypeId:google.maps.MapTypeId.ROADMAP
        };

        var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

        var marker = new google.maps.Marker({
            position:myCenter
        });

        marker.setMap(map);
    }

    google.maps.event.addDomListener(window, 'load', initialize);
</script>


<%--<button type="button" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-plus logo-small"></span>--%>

<footer class="container-fluid text-center">
    <a href="#myPage" title="To Top">
        <span class="glyphicon glyphicon-chevron-up"></span>
    </a>
</footer>

<script>
    $(document).ready(function(){
        // Add smooth scrolling to all links in navbar + footer link
        $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

            // Prevent default anchor click behavior
            event.preventDefault();

            // Store hash
            var hash = this.hash;

            // Using jQuery's animate() method to add smooth page scroll
            // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
            $('html, body').animate({
                scrollTop: $(hash).offset().top
            }, 900, function(){

                // Add hash (#) to URL when done scrolling (default click behavior)
                window.location.hash = hash;
            });
        });

        // Slide in elements on scroll
        $(window).scroll(function() {
            $(".slideanim").each(function(){
                var pos = $(this).offset().top;

                var winTop = $(window).scrollTop();
                if (pos < winTop + 600) {
                    $(this).addClass("slide");
                }
            });
        });
    })
</script>


<!-- Container (Friends Section) -->
<%--<div id="friends" class="container-fluid text-center bg-grey">--%>

<%--</div>--%>

<!-- Container (Hobby Section) -->
<%--<div id="hobby" class="container-fluid text-center bg-grey">--%>

<%--</div>--%>

<!-- Container (Message Section) -->
<%--<div id="message" class="container-fluid text-center bg-grey">--%>

<%--</div>--%>

<!-- Container (Place Section) -->
<%--<div id="place" class="container-fluid text-center bg-grey">--%>

<%--</div>--%>

<!-- Container (Post Section) -->
<%--<div id="post" class="container-fluid text-center bg-grey">--%>

<%--</div>--%>
<%--<nav class="navbar navbar-inverse">--%>
    <%--<div class="container-fluid">--%>
        <%--<div class="navbar-header">--%>
            <%--<a class="navbar-brand" href="#">Friend Zone</a>--%>
        <%--</div>--%>
        <%--<div>--%>
            <%--<ul class="nav navbar-nav">--%>
                <%--<li class="active"><a href="#">Home</a></li>--%>
                <%--<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Page 1-1</a></li>--%>
                        <%--<li><a href="#">Page 1-2</a></li>--%>
                        <%--<li><a href="#">Page 1-3</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<li><a href="#">Page 2</a></li>--%>
                <%--<li><a href="#">Page 3</a></li>--%>
            <%--</ul>--%>
            <%--<ul class="nav navbar-nav navbar-right">--%>
                <%--<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>--%>
                <%--<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>--%>
            <%--</ul>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</nav>--%>

<%--<div class="container">--%>
    <%--<h3>Right Aligned Navbar</h3>--%>
    <%--<p>The .navbar-right class is used to right-align navigation bar buttons.</p>--%>
<%--</div>--%>

<%--<div class="container-fluid">--%>
    <%--<div class="page-header text-centred">--%>
        <%--<h1>Java Friend Zone</h1>--%>
    <%--</div>--%>
    <%--<form class="well form-inline">--%>
        <%--<input type="text" class="span3" placeholder="Username..." required autofocus>--%>
        <%--<input type="text" class="span3" placeholder="Password..." required>--%>
        <%--<button class="btn btn-primary">Sign in</button>--%>
        <%--<label class="checkbox pull-left">--%>
            <%--<input type="checkbox" value="remember-me">--%>
            <%--Remember me--%>
        <%--</label>--%>
    <%--</form>--%>
    <%--<form class="navbar-form navbar-left" role="search">--%>
        <%--<div class="form-group">--%>
            <%--<input type="text" class="form-control" placeholder="Search...">--%>
        <%--</div>--%>
        <%--<button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>--%>
        <%--<button class="btn btn-primary">Add contact</button>--%>
    <%--</form>--%>
    <%--<div class="container">--%>
        <%--<div class="row">--%>
            <%--<div class="col-sm-6 col-md-4 col-md-offset-4">--%>
                <%--<h1 class="text-center login-title">Sign in</h1>--%>
                <%--<div class="account-wall">--%>
                    <%--<form class="form-signin">--%>
                        <%--<input type="text" class="form-control" placeholder="Email" required autofocus>--%>
                        <%--<input type="password" class="form-control" placeholder="Password" required>--%>
                        <%--<button class="btn btn-lg btn-primary btn-block" type="submit">--%>
                            <%--Sign in</button>--%>
                        <%--<label class="checkbox pull-left">--%>
                            <%--<input type="checkbox" value="remember-me">--%>
                            <%--Remember me--%>
                        <%--</label>--%>
                    <%--</form>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/core/my-script.js"></script>

</body>
</html>
