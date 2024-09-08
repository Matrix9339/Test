<%-- 
    Document   : form
    Created on : 17 Nov, 2023, 8:54:03 PM
    Author     : Himanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Details</title>
    <link rel="stylesheet" href="css/form.css">
    <style>
        body{
            margin: 0;
            padding: 0;
            background-image: url('Img/lbg.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center center;
            background-attachment: fixed;
        }
    </style>
</head>
<body>

    <div class="container">

        <form action="">
            
            <div class="row">
                
                <div class="col">

                    
                    <h3 class="title">Enter Your Details</h3>
                    
                <div class="inputBox">
                    <span>full name :</span>
                    <input type="text" placeholder="john deo" >
                </div>
                <div class="inputBox">
                    <span>email :</span>
                    <input type="email" placeholder="example@example.com">
                </div>
                <div class="inputBox">
                    <span>address :</span>
                    <input type="text" placeholder="room - street - locality">
                </div>
                <div class="inputBox">
                    <span>city :</span>
                    <input type="text" placeholder="mumbai">
                </div>
                
                <div class="flex">
                    <div class="inputBox">
                        <span>state :</span>
                        <input type="text" placeholder="india">
                    </div>
                    <div class="inputBox">
                        <span>zip code :</span>
                        <input type="text" placeholder="123 456">
                    </div>
                </div>
                
            </div>
            
            <div class="col">
                
        </div>
            <div class="bt">
                <a href="payment.jsp">
                    Proceed To Payment
                </a>
            </div>
            
        </form>

    </div>    

</body>
</html>
        </form>
    </div>
</body>
</html>
