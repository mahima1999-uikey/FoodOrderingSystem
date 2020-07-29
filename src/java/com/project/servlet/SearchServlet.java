
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.FoodMenu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {
    
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        System.out.println("Entered into SearchServlet ");
     try{
         System.out.println(">>>>"+request.getParameter("search")); 
         
         
                     List <FoodMenu> foodlist= CommonDao.searchFood(request.getParameter("search"));
    
         System.out.println(">>>"+foodlist);
          request.setAttribute("foodlist", foodlist);
                
             
            String page = "/foodMenu.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response); 
      } catch (Exception e) 
      {
      e.printStackTrace();
      }
 }

   }


