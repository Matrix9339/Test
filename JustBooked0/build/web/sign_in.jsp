<%-- 
    Document   : sign_in
    Created on : 17 Nov, 2023, 9:04:38 PM
    Author     : Himanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SignIn</title>
    <link rel="stylesheet" href="css/sign_in.css">
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
    <div class="signin">
        <div class="avatar">
            <img src="Img/ava.jpg" alt="error">
        </div>
        <h2>SignIn</h2>
        <h3>Creat New Account</h3>
        <form class="signin-form" action="http://localhost:25570/JustBooked0/sign_in" method="POST">
            <div class="textbox">
                <input type="text" placeholder="First Name" name="fname"/>
            </div>
            <div class="textbox">
                <input type="text" placeholder="Last Name" name="lname"/>
            </div>
            <div class="textbox">
                <input type="number" placeholder="+91 00000-11111" name="phone" min="10"/>
            </div>
            <div class="textbox">
                <input type="email" placeholder="example@gmail.com" name="email_id"/>
            </div>
            <div class="textbox">
                <input type="password" placeholder="********" name="pas" min="8" max="20" />
            </div>
            <div class="textbox">
                <input type="password" placeholder="Confirm Password" name="cnfpas"/>
            </div>
            <button type="Submit">SignIn</button>
            
            <a href="login_page.jsp">
                Already have a account?
            </a>
        </form>
    </div>

    
</body>
</html>