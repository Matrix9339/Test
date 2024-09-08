<%-- 
    Document   : Air_ticket
    Created on : 17 Nov, 2023, 8:34:35 PM
    Author     : Himanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Air_ticket</title>
    <link rel="stylesheet" href="css/footer.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
   
    <link
        href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300&family=Handjet:wght@300&family=Lumanosimo&family=Raleway:wght@100;400&family=Ubuntu:wght@300&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="css/Air_ticket.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/navbar.css">
    <style>
        body {
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
        
        <div class="tb1">
            <div class="imgt1">
                <img src="Img/bg3.jpg" alt="">
            </div>
            <div class="bdift">
                Book Domestic and International Flight Tickets
            </div>
            <div class="and">
                &
            </div>
            <div class="gef">
                Get Exciting Offers
            </div>
        </div>
        <form action="#" method="post">
            
        
        <div class="tb2">
            
            <div class="r1"> 
                Trip |
                <input type="radio" name="way" id="">
                One-way
            
                <input type="radio" name="way" id="">
                Round-way
            
                <input type="radio" name="way" id="">
                Multi-city
            </div>
            <div class="r1p2">
                
                    Class & Cabin | 
                    <input list = "class" name="cabin"/>
                    <datalist id="class" >
                        <option value="Business x8000"></option>
                        <option value="First x7500"></option>
                        <option value="Primium Economy x5500"></option>
                        <option value="Economy x5000"></option>
                    </datalist>
               
            </div>
            <div class="r2">
                From | 
                <input type="text" name="from" id="" placeholder="Kolkata">
                To | 
                <input type="text" name="to" id="" placeholder="Mumbai">
                Departure |
                <input type="date" name="Departure" id="" placeholder="Departure">
                Adult
                <input type="text" name="adult" id="" placeholder="1">
                Child
                <input type="text" name="child" id="" placeholder="1">
                Infant
                <input type="text" name="inf" id="" placeholder="1">
            </div>
            <div class="r3">
                <div class="sft">
                    Select A Fare Type: |
                    <input type="radio" name="fair" id="" placeholder="">
                        Regular
                    <input type="radio" name="fair" id="" placeholder="">
                        Armed Forces
                    <input type="radio" name="fair" id="" placeholder="">
                        Senior Citizen
                    <input type="radio" name="fair" id="" placeholder="">
                        Student
                    <input type="radio" name="fair" id="" placeholder="">
                        Doctor & Nurses
                </div>
            </div>
            <div class="r4">
                <input type="radio" name="check" id="">
                I Agree To All Terms and Conditions
            </div>
            <div class="r5">
                <a href="form.jsp">
                    <input type="button" value="Next">
                </a>
                
                
            </div>
        </div> 
        </form>
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