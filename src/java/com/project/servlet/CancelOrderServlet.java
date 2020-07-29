
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


@WebServlet(name = "CancelOrderServlet", urlPatterns = {"/CancelOrderServlet"})
public class CancelOrderServlet extends HttpServlet {

      
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                System.out.println("Entered into CancelOrderServlet");

        
     try
     {
        int id=Integer.parseInt(request.getParameter("cancelid"));
        CommonDao.cancelOrder(id);
         String page = "/showcancel.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);
       
         
      }
            catch (Exception ex) {
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

    

   