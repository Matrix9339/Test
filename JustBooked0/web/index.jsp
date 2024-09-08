<%@page import="com.mysql.cj.Session"%>
<%
    if(session.getAttribute("name")==null){
        response.sendRedirect("login_page.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JustBooked</title>
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/footer.css">
    <style>
        body{
            margin: 0px;
            padding: 0px;
            height: 100vh;
            width: 100vw;
            background-image: url('Img/lbg.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center center;
            background-attachment: fixed;
        }
    </style>
</head>

<body>
    <header>
        <div class="head">
            <div class="left">
                <img src="Img/logo.png" alt="">
                <a href="index.jsp">
                    JustBooked
                </a>
            </div>
            <div class="mid">

                <a href="Air_ticket.jsp">
                    <img src="Img/aero logo.png" alt="">
                    Flights
                </a>

                <a href="train.jsp">
                    <img src="Img/train-logo.png" alt="">
                    Trains
                </a>
                <a href="cab.jsp">
                    <img src="Img/car-logo.png" alt="">
                    Cabs
                </a>
                <a href="bus.jsp">
                    <img src="Img/bus logo.png" alt="">
                    Bus
                </a>
                <a href="hotel.jsp">
                    <img src="Img/hotel-logo.png" alt="">
                    Hotels
                </a>
            </div>
            <div class="right">
                <a href="login_page.jsp">
                    Logout
                </a>
                <a href="logout">
                    <%=session.getAttribute("name")%>
                </a>
                
            </div>
        </div>
    </header>

    <div class="body">
        <div class="t1">
            <img src="Img/lp0.jpg" alt="">
            <div class="box1">PLAN YOUR VACATIONS</div>
            <div class="box2">BOOK NOW AND SAVE MONEY</div>
        </div>

        <div class="t2">

            <h2>POPULAR TOURS</h2>

            <div class="t2img">
                <div class="i1">
                    <img src="Img/rome.jpg" alt="">
                    <div class="i1d">
                        <div class="i1d1">
                            ROME
                        </div>
                        <div class="i1d2">
                            FROM
                        </div>
                        <div class="i1d3">
                            $1,999
                        </div>
                    </div>
                    
                </div>
                <div class="i2">
                    <div class="i2d">
                        <img src="Img/hawaii.jpg" alt="">
                        <div class="i2d1">
                            HAWAII
                        </div>
                        <div class="i2d2">
                            FROM
                        </div>
                        <div class="i2d3">
                            $3,999
                        </div>
                    </div>
                </div>
                <div class="i3">
                    <img src="Img/dubai.jpg" alt="">
                    <div class="i3d">
                        <div class="i3d1">
                            DUBAI
                        </div>
                        <div class="i3d2">
                            FROM
                        </div>
                        <div class="i3d3">
                            $5,599
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="t3">
            <h2>ENJOY YOUR VACATION WITH US!</h2>
            <div class="d">
                <img src="Img/t3.jpg" alt="">
            </div>
            <div class="t3d">
                "The more you travel, the more you learn about new places, new cultures, and new people. This is your time to explore the unknown and see the unseen. Make the best out of it. Stay safe and enjoy!"
            </div>
        </div>

        <div class="t4">
            
        </div>
    </div>
</body>

<footer>
    <p class="op">
        <ul>
            <h3>OUR PRODUCTS</h3>

            <li>Domestic Hotels</li>
            <li>International Hotels</li>
            <li>Domestic Flights</li>
            <li>International Flights</li>
            <li>Multi-City Flights</li>
            <li>Couple Friendly Hotels</li>
            <li>Nearby Getaways</li>
            <li>Bus Booking</li>
            <li>Cab Booking</li>
            <li>Airport Cabs Booking</li>
            <li>Outstation Cabs Booking</li>
            <li>Train Booking</li>
            <li>Go Stay</li>
            <li>Trip Money</li>
            <li>Goibibo Advertising Solutions</li>
        </ul>
    </p>

    <p class="au">
        <ul>
            <a href="aboutus.jsp"><h3>ABOUT US</h3></a>
            <li>Investor Relations</li>
            <li>Management</li>
            <li>Terms of Services</li>
            <li>User Agreement</li>
            <li>Privacy</li>
            <li>Careers</li>
            <li>YouTube Channel</li>
            <li>Technology@JustBooked</li>
            <li>Customer Support</li>
            <li>Facebook Page</li>
            <li>Twitter Handle</li>
        </ul>
    </p>

    <p class="te">
        <ul>
            <h3>TRAVEL ESSENTIALS</h3>

            <li>PNR Status</li>
            <li>Offers</li>
            <li>Airline Routes</li>
            <li>Train Running Status</li>
        </ul>
    </p>

    <p class="ml">
        <ul>
            <h3>MORE LINKS</h3>
            
            <li>Cheap Flights</li>
            <li>Hotels Near Me</li>
            <li>My Bookings</li>
            <li>Cancellation</li>
            <li>My Account</li>
            <li>Wallet</li>
            <li>Advertise with Us</li>
        </ul>
    </p>

</footer>
</html>