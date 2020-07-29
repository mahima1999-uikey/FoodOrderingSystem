
package com.project.servlet;

import com.project.dto.FoodMenu;
import java.io.IOException;

import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "TotalCostServlet", urlPatterns = {"/TotalCostServlet"})
public class TotalCostServlet extends HttpServlet {

  
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
             System.out.println("Entered into TotalCostServlet");

     
    HttpSession session=request.getSession();
      ArrayList list =(ArrayList)session.getAttribute("cart");
      int sum=0;
      if(!list.isEmpty())
      {
          int i=0;
          for (Object obj : list) 
          {
           FoodMenu foodmenu=(FoodMenu)obj;
           int price=foodmenu.getPrice();
           int quantity=Integer.parseInt(request.getParameter("quantity"+i++));
           sum=sum + price * quantity;
           foodmenu.setQuantity(quantity);
          }
      }
      System.out.println(">>>>>>>>>>>>"+sum);
      request.setAttribute("Total",sum);
      request.setAttribute("foodlist", list);
      session .setAttribute("costtotal", sum);
      session.setAttribute("foodList", list);
      String page = "/showCart.jsp";
      RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
      requestDispatcher.forward(request, response);
 }
}
