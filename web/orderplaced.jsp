<%-- 
    Document   : orderplaced
    Created on : 28 Jul, 2020, 7:04:23 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="scriptandcss.html" %>
    </head>
    <body>

    <%@include file="navigation.jsp" %>
     
    <div id="fh5co-menus" data-section="menu">
            <div class="container">
                <div class="row text-center fh5co-heading row-padded">

                    <div class="col-md-8 col-md-offset-2">
                        <h2 class="heading to-animate">Order Placed Successfully</h2>
                      
                    </div>

                </div>	
                    <div class="col-md-8 col-md-offset-2">
                        <h2 >Order Status: Completed</h2>
                        <br/>
                        <br/>
                                              
                    </div></div></div>

                     <%@include file="footer.jsp" %>
        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>
        <!-- jQuery Easing -->
        <script src="js/jquery.easing.1.3.js"></script>
        <!-- Bootstrap --> 
        <script src="js/bootstrap.min.js"></script>
        <!-- Bootstrap DateTimePicker -->
        <script src="js/moment.js"></script>
        <script src="js/bootstrap-datetimepicker.min.js"></script>
        <!-- Waypoints -->
        <script src="js/jquery.waypoints.min.js"></script>
        <!-- Stellar Parallax -->
        <script src="js/jquery.stellar.min.js"></script>

        <!-- Flexslider -->
        <script src="js/jquery.flexslider-min.js"></script>
        <script>
                $(function () {
                    $('#date').datetimepicker();
                });
        </script>
        <!-- Main JS -->
        <script src="js/main.js"></script>
        <script>

  
    </body></html>