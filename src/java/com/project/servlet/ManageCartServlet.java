
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.FoodMenu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ManageCartServlet", urlPatterns = {"/ManageCartServlet"})
public class ManageCartServlet extends HttpServlet {

  
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                System.out.println("Entered into ManageCartServlet");

     
         int id=Integer.parseInt(request.getParameter("id"));
     
          
          FoodMenu foodmenu = CommonDao.getFoodItemById(id);
          HttpSession session=request.getSession();
      
              ArrayList list  =  (ArrayList) session.getAttribute("cart");
            
          
          if(list==null)
          {
              list=new ArrayList();
          }
          if(request.getParameter("cart").equals("order"))
          {
       list.add(foodmenu);}
         
       session.setAttribute("cart", list);
          System.out.println(">>>>"+list);
          response.sendRedirect("GetFoodServlet");
    }
}

    

   
