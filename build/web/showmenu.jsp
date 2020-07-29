<%-- 
    Document   : showmenu
    Created on : Feb 19, 2020, 3:25:20 PM
    Author     : hp
--%>


<%@page import="java.io.InputStream"%>
<%@page import="java.io.OutputStream"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<div align="center">
    <table>
      <th>Name</th>
      <TH>Id</th>
      <c:forEach items="${foodlist}" var="current">
        <tr>
          <td><c:out value="${current.itemname}" /></td>
          <td><c:out value="${current.foodcategory}" /></td>
          <td><c:out value="${current.price}" /></td>
          <td><c:out value="${current.quantity}" /></td>
             <td><c:out value="${current.description}" /></td>
               <td> <img src="${pageContext.servletContext.contextPath }/photoServlet?fooditemid=${current.fooditemid}" />
            </td>       
                             
        </tr>
      </c:forEach>
    </table>
 
</div>
</body>
</html>
