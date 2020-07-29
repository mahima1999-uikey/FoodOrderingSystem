
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.FoodMenu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "GetFoodServlet", urlPatterns = {"/GetFoodServlet"})
public class GetFoodServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        System.out.println("Entered into GetFoodServlet");
            try {
            List <FoodMenu> foodlist= CommonDao.getFoodRecord();
             
            request.setAttribute("foodlist", foodlist);
                
               HttpSession session=request.getSession();
               if(session.getAttribute("cart")==null)
               {
                   ArrayList list=null;
                   session.setAttribute("cart",list);
                   
                   
               }
               
            String page = "/foodMenu.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);              
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
         
    }
    
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    
    {
        doPost(request, response);
    }

}

    



