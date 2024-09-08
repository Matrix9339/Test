<%-- 
    Document   : login_page
    Created on : 17 Nov, 2023, 8:57:25 PM
    Author     : Himanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link rel="stylesheet" href="css/login.css">
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
    <div class="login">
        <div class="avatar">
            <img src="Img/ava.jpg" alt="error">
        </div>
        <h2>Login</h2>
        <h3>Welcome back</h3>
        <form class="login-form" action="login_page" method="POST" >
            <div class="textbox">
                <input type="email" placeholder="example@gmail.com" name="email"/>
            </div>
            <div class="textbox">
                <input type="password" placeholder="********" name="pass"/>

            </div>
            <button type="Submit">Login</button>
            <div class="sign-in">
                <a href="sign_in.jsp">
                    SignIn
                </a>
            </div>
            
                <a href="forgotpw.jsp">
                forgot your cridentials?
            </a>
        </form>
    </div>

    
</body>
</html>