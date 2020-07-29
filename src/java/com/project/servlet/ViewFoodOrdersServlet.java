package com.project.servlet;

import com.project.dao.CommonDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ViewFoodOrdersServlet", urlPatterns = {"/ViewFoodOrdersServlet"})
public class ViewFoodOrdersServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                System.out.println("Entered into ViewFoodOrderServlet");

        
         try{
          
                     
       ArrayList<Integer> Orderlist =   CommonDao.allOrders();
           
       request.setAttribute("totalorder", Orderlist);
                   RequestDispatcher dispatcher = request.getRequestDispatcher("viewtotalorders.jsp");
            dispatcher.forward(request, response);

}catch(Exception e){e.printStackTrace();}
  
}
}




    
