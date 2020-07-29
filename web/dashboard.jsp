<%-- 
    Document   : dashboard
    Created on : Mar 11, 2020, 3:16:10 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                 <%@include file="scriptandcss.html" %>

           <style>
           .main {
    width: 50%;
    margin: 50px auto;
}

/* Bootstrap 4 text input with search icon */

#dashboard{
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 35%;
}

#dashboard td, #dashboard th {
  border: 1px solid #ddd;
  padding: 8px;
}

#dashboard tr:nth-child(even){background-color: #f2f2f2;}

#dashboard tr:hover {background-color: #ddd;}

#dashboard th 
{
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
 
</style>
    </head>
    <body>
             <%@include file="adminnavbar.jsp" %>

    <div id="fh5co-menus" data-section="menu">
            <div class="container">
                <div class="row text-center fh5co-heading row-padded">

                    <div class="col-md-8 col-md-offset-2">
                        <h2 class="heading to-animate">Welcome Admin</h2>
                      
                    </div>
                      <table id="dashboard" align="center">   
            
            <thead>   <tr><th>Admin DashBoard</th></tr></thead>
      
            <tbody>
               
                <tr  class='clickable-row' data-href='${pageContext.servletContext.contextPath }/ViewFoodOrdersServlet'>
                    
                    
                    <td >ViewFoodOrders</td>
                </tr>
                <tr  class='clickable-row' data-href='addFoodItem.jsp'>
                    
       
                    <td>add new food item</td>
                </tr>
                <tr  class='clickable-row' data-href='${pageContext.servletContext.contextPath }/AllFoodItemsServlet'>
                    
                   
                    <td >List of Food items in menu</td>
                </tr>
                <tr  class='clickable-row' data-href='${pageContext.servletContext.contextPath }/RegisteredUserServlet'>
                    
                    
                  <td>Registered Users</td>
                </tr>


            </tbody>
        </table>
                </div>
            </div>	</div>
                   
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
          jQuery(document).ready(function($) {
    $(".clickable-row").click(function() {
        window.location = $(this).data("href");
    });
});
      </script>           
    </body>
</html>
