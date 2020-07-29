
package com.project.servlet;

import com.project.dao.CommonDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RemoveItemServlet", urlPatterns = {"/RemoveItemServlet"})
public class RemoveItemServlet extends HttpServlet {

  
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            System.out.println("Entered into RemoveItemServlet");

            
            int food_id= Integer.parseInt(request.getParameter("food_id"));
             boolean flag =CommonDao.removeItem(food_id);
                        
             RequestDispatcher dispatcher = request.getRequestDispatcher("removeitemsuccess.jsp");
             dispatcher.forward(request, response);
    
    }


}

   