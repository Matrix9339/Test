<%-- 
    Document   : bus
    Created on : 17 Nov, 2023, 8:44:22 PM
    Author     : Himanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bus</title>
    <link rel="stylesheet" href="css/bus.css">
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

    <div class="cont">
        <img src="Img/coming soon.jpeg" alt="">
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
