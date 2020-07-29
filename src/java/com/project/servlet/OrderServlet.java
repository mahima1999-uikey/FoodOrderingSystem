
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "OrderServlet", urlPatterns = {"/OrderServlet"})
public class OrderServlet extends HttpServlet {   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
                System.out.println("Entered into OrderServlet");

       
        String flatno=request.getParameter("flatno");
        String streetname=request.getParameter("streetname");
        String area=request.getParameter("area");
        String landmark=request.getParameter("landmark");
        String city=request.getParameter("city");
       HttpSession session=request.getSession();
       int id=(int) session.getAttribute("userid");
       ArrayList foodlist=(ArrayList) session.getAttribute("foodList");
       int totalcost=(int) session.getAttribute("costtotal");
        Order order=new Order();
        order.setFlatno(flatno);
        order.setStreetName(streetname);
        order.setArea(area);
        order.setLandmark(landmark);
        order.setCity(city);
        order.setFoodList(foodlist);
        order.setTotalcost(totalcost);
        order.setUserid(id);
        System.out.println("***********************"+order);
        
         int orderid=CommonDao.addOrder(order);
        session.setAttribute("currentorderid", orderid);
         
           String page = "/showorderstatus.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);   
     }

   }

            
