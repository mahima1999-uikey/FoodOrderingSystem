<%-- 
    Document   : updatemenu
    Created on : 3 May, 2020, 2:58:31 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FoodOrderingSystem</title>
        <%@include file="scriptandcss.html" %>
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

        <script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
         <%@include file="adminnavbar.jsp" %>

          
    <div id="fh5co-menus" data-section="menu">
            <div class="container">
                <div class="row text-center fh5co-heading row-padded">


                      

        <div id="loginbox" style="margin-top: 50px;"
             class="mainbox col-md-5 col-md-offset-2 col-sm-6 col-sm-offset-2">

            <div class="panel panel-info">

                <div class="panel-heading">
                    <div class="bg-primary text-white">Update Food Item here</div>
                </div>

                <div style="padding-top: 30px" class="panel-body">

                    <!-- Address Form -->
                    <form action="${pageContext.request.contextPath}/UpdateMenuServlet" method="POST" enctype="multipart/form-data" class="form-horizontal">

                        
                       <div style="margin-bottom: 25px" class="input-group">

                            Food Id :  <input type="text" name="fooditemid" placeholder="fooditemid" value="${menu.fooditemid}" class="form-control">
                        </div>



                        <div style="margin-bottom: 25px" class="input-group">

                            Food Category :  <input type="text" name="foodcategory" placeholder="foodcategory" value="${menu.foodcategory}" class="form-control">
                        </div>



                        <div style="margin-bottom: 25px" class="input-group">


                            Item Name : <input type="text" name="itemname" placeholder="itemname" value="${menu.itemname}" class="form-control" >
                        </div>
                        
                        <div style="margin-bottom: 25px" class="input-group">
                            Description :
                            <textarea name="description" rows="5" cols="30" class="form-control" placeholder="description">${menu.description}
                            </textarea> </div>
                            
                        <div style="margin-bottom: 25px" class="input-group">
                           
                            Quantity :  <input type="text" name="quantity" placeholder="quantity" value="${menu.quantity}" class="form-control" >
                        
                        </div>
                        
                        
                        
                        <div style="margin-bottom: 25px" class="input-group">
                            Price  : <input type="text" name="price" placeholder="price" value="${menu.price}" class="form-control" >
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">


                            Choose Image*(compulsory) : <input type="file" name="image"  class="form-control" value="${menu.image}" required>
                        </div>


                        <div  >						

                            <input type="submit" class="btn btn-success" value="update"/>

                        </div><br/>
                        <br/>


                    </form>

                </div>

            </div>

        </div>

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

    </body>
</html>


