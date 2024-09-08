
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>About Us</title>
        <link href="css/navbar.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/footer.css">
        <link href="css/aboutus.css" rel="stylesheet" type="text/css"/>
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
        
        
    <div class="con">
        <img src="Img/about.jpg" alt="none">
    </div>

    </body>
</html>
