package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.FoodMenu;
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


@WebServlet(name = "RemoveCartServlet", urlPatterns = {"/RemoveCartServlet"})
public class RemoveCartServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
                    System.out.println("Entered into RemoveCartServlet");

      
      HttpSession session=request.getSession();
      
      
      int id=Integer.parseInt(request.getParameter("id"));
            int index=Integer.parseInt(request.getParameter("index"));
          
          FoodMenu foodmenu = CommonDao.getFoodItemById(id);
      
      ArrayList list =(ArrayList)session.getAttribute("cart");
            
          list.remove(index);
            System.out.println(">>>>>>>>>>"+list);
         request.setAttribute("foodlist", list);
       String page = "/showCart.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);
      }
}

     