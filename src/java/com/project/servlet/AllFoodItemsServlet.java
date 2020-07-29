
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


@WebServlet(name = "AllFoodItemsServlet", urlPatterns = {"/AllFoodItemsServlet"})
public class AllFoodItemsServlet extends HttpServlet {

   
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        System.out.println("Entered into AllFoodServlet");

 
       try{
                 
             ArrayList<FoodMenu> foodlist;
             foodlist = (ArrayList<FoodMenu>) CommonDao.getFoodRecord();
            request.setAttribute("foodlist", foodlist);
             
            String page = "/managefoodmenu.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);
         

            }catch(IOException | ServletException e){out.print(e);}
    }

}

   