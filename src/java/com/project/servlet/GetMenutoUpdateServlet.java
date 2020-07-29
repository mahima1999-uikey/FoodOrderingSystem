
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.FoodMenu;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GetMenutoUpdateServlet", urlPatterns = {"/GetMenutoUpdateServlet"})
public class GetMenutoUpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
                System.out.println("Entered into GetMenutoUpdateServlet");

        
        int food_id = Integer.parseInt(request.getParameter("food_id"));
        System.out.println(food_id);
        FoodMenu foodmenu = CommonDao.getFoodItemById(food_id);

        request.setAttribute("menu", foodmenu);
        System.out.println(foodmenu);
        RequestDispatcher dispatcher = request.getRequestDispatcher("updatemenu.jsp");
        dispatcher.forward(request, response);

    }

}
