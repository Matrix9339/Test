<%-- 
    Document   : cab
    Created on : 17 Nov, 2023, 8:47:57 PM
    Author     : Himanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"/>
    <link rel="stylesheet" href="css/cab.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/navbar.css">
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
    <div class="cab-booking-main-container">
        <div class="cab-booking-main-container-text">
            <h2>Book a <span>cab now</span></h2>
        </div>
        <div class="cab-booking-main-container-taxi-img">
            <img src="Img/carmain.png" alt="">
        </div>
    </div>

    <div class="cab-booking-home-container">
        <div class="cab-booking-home-container-content">
            <h3>Best In City</h3>
            <h2>Trusted Cab Service In County</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatum nihil <br> deserunt odio repellendus dolorum suscipit excepturi placeat facilis <br> dignissimos officiis aut nam, delectus possimus rerum consequatur similique! Deserunt, vitae. Officiis?</p>
            <a href="#" class="booknow">Book Now</a>
        </div>
        <div class="cab-booking-home-container-contact-form">
            <h1>Book A Cab</h1>
            <form action="">
                <input type="text" placeholder="Name">
                <input type="number" placeholder="Phone"><br>
                <input type="text" placeholder="When">
                <input type="datetime-local" placeholder="Date"><br>
                <input type="text" placeholder="Start">
                <input type="text" placeholder="End"><br>
                <button type="submit" class="cab-booking-home-container-contact-form-submit-button" >Submit</button>
            </form>
        </div>
    </div>


    <div class="cab-booking-main-tariff">
        <h1>Our <span>Tarrif</span></h1>
        <div class="cab-booking-main-tariff-linner-tariff">
            <div class="cab-booking-main-tariff-card">
                <img src="Img/image1.png" alt="">
                <div class="cab-booking-main-tariff-card-content">
                    <h2 >Economy Class</h2>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat illum officia fugiat, autem facere iste repellendus omnis nemo dolore</p>
                    <h3>price: $3 /-</h3>
                    <a href="#">order now</a>
                </div>
            </div>

            <div class="cab-booking-main-tariff-card yellow-container">
                <img src="Img/image2.png" alt="">
                <div class="cab-booking-main-tariff-card-content ">
                    <h2 >Economy Class</h2>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat illum officia fugiat, autem facere iste repellendus omnis nemo dolore</p>
                    <h3 class="price-color">Price: $3 /-</h3>
                    <a href="#">Order Now</a>
                </div>
            </div>

            <div class="cab-booking-main-tariff-card">
                <img src="Img/image3.png" alt="">
                <div class="cab-booking-main-tariff-card-content">
                    <h2 >Economy Class</h2>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat illum officia fugiat, autem facere iste repellendus omnis nemo dolore</p>
                    <h3>Price: $3 /-</h3>
                    <a href="#">Order Now</a>
                </div>
            </div>
        </div>
    </div>
    <div class="cab-booking-fast-booking-container">
        <h2>We Do Best</h2>
        <h3 class="cab-booking-fast-booking-container-booking-steps">Booking Steps</h3>
        <div class="cab-booking-fast-booking-container-booking-content">
            <div class="cab-booking-fast-booking-container-booking-content-text">
                <h3><i class="fa-solid fa-location-dot"></i>Fast Booking</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae debitis asperiores adipisci, totam volu Lorem ipsum dolor, sit amet consectetur  <br>adipisicing elit. Omnis obcaecati ex animi possimus totam ullam eum assumenda mollitia nihil, </p>
            </div>

            <div class="cab-booking-fast-booking-container-booking-content-text">
                <h3><i class="fa-solid fa-location-dot"></i>Fast Booking</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae debitis asperiores adipisci, totam volu Lorem ipsum dolor,<br>sit amet consectetur adipisicing elit. Consequuntur nesciunt vero iste. Officiis suscipit quas,</p>
            </div>

            <div class="cab-booking-fast-booking-container-booking-content-text">
                <h3><i class="fa-solid fa-location-dot"></i>Fast Booking</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae debitis asperiores adipisci, totam volu Lorem ipsum dolor, sit amet consectetur adipisicing <br>elit. Nulla, illo placeat corrupti molestias quidem dolores esse dolor, obcaecati delectus perspiciatis optio alias.</p>
            </div>

            <div class="cab-booking-fast-booking-container-booking-content-text">
                <h3><i class="fa-solid fa-location-dot"></i>Fast Booking</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae debitis asperiores adipisci, totam volu Lorem, <br>ipsum dolor sit amet consectetur adipisicing elit. Deleniti dolor, tempore quisquam dicta  magnam incidunt sunt iure, <br> explicabo corrupti officia aut, at sint inventore dolorem</p>
            </div>

            <div class="cab-booking-fast-booking-container-booking-content-text">
                <h3><i class="fa-solid fa-location-dot"></i>Fast Booking</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae debitis asperiores adipisci, totam volu Lorem ipsum dolor sit amet, <br>consectetur adipisicing elit. Mollitia alias deleniti culpa nihil voluptas voluptate quas quod recusandae </p>
            </div>
        </div>
    </div>
    <div class="cab-booking-feedback">
        <h2>Happy Clients</h2>
        <div class="cab-booking-feedback-container">
            <div class="cab-booking-feedback-container-card">
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quo, cum ullam, tenetur est in rerum fugit optio, sunt cupiditate quasi consequuntur recusandae voluptate corporis molestias nisi illo unde nesciunt! Enim.</p>
                <div class="cab-booking-feedback-container-card-content">
                    <img src="Img/jhon.png" alt="">
                    <div class="user-details">
                        <h6>Jhone Doe</h6>
                        <p>23 Sep,2023</p>
                    </div>
                </div>
            </div>
            <div class="cab-booking-feedback-container-card">
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quo, cum ullam, tenetur est in rerum fugit optio, sunt cupiditate quasi consequuntur recusandae voluptate corporis molestias nisi illo unde nesciunt! Enim.</p>
                <div class="cab-booking-feedback-container-card-content">
                    <img src="Img/jhon.png" alt="">
                    <div class="user-details">
                        <h6>Jhone Doe</h6>
                        <p>23 Sep,2023</p>
                    </div>
                </div>
            </div>
            <div class="cab-booking-feedback-container-card">
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quo, cum ullam, tenetur est in rerum fugit optio, sunt cupiditate quasi consequuntur recusandae voluptate corporis molestias nisi illo unde nesciunt! Enim.</p>
                <div class="cab-booking-feedback-container-card-content">
                    <img src="Img/jhon.png" alt="">
                    <div class="user-details">
                        <h6>Jhone Doe</h6>
                        <p>23 Sep,2023</p>
                    </div>
                </div>
            </div>
            <div class="cab-booking-feedback-container-card">
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quo, cum ullam, tenetur est in rerum fugit optio, sunt cupiditate quasi consequuntur recusandae voluptate corporis molestias nisi illo unde nesciunt! Enim.</p>
                <div class="cab-booking-feedback-container-card-content">
                    <img src="Img/jhon.png" alt="">
                    <div class="user-details">
                        <h6>Jhone Doe</h6>
                        <p>23 Sep,2023</p>
                    </div>
                </div>
            </div>
            <div class="cab-booking-feedback-container-card">
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quo, cum ullam, tenetur est in rerum fugit optio, sunt cupiditate quasi consequuntur recusandae voluptate corporis molestias nisi illo unde nesciunt! Enim.</p>
                <div class="cab-booking-feedback-container-card-content">
                    <img src="Img/jhon.png" alt="">
                    <div class="user-details">
                        <h6>Jhone Doe</h6>
                        <p>23 Sep,2023</p>
                    </div>
                </div>
            </div>
            <div class="cab-booking-feedback-container-card">
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quo, cum ullam, tenetur est in rerum fugit optio, sunt cupiditate quasi consequuntur recusandae voluptate corporis molestias nisi illo unde nesciunt! Enim.</p>
                <div class="cab-booking-feedback-container-card-content">
                    <img src="Img/jhon.png" alt="">
                    <div class="user-details">
                        <h6>Jhone Doe</h6>
                        <p>23 Sep,2023</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Footer</title>
</head>
<body>
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
</body>
</html>
