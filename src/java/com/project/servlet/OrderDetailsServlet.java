
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.Order;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "OrderDetailsServlet", urlPatterns = {"/OrderDetailsServlet"})
public class OrderDetailsServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
                System.out.println("Entered into OrderDetailsServlet");

        
            try {
               
      HttpSession session=request.getSession();
     int id=Integer.parseInt(request.getParameter("id"));
                 Order orderdetail=CommonDao.getOrderRecordById(id);

      session.setAttribute("orderedfood",orderdetail.getFoodList());
      session.setAttribute("myorder",orderdetail);
              
      String page = "/orderdetails.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);   
            
            }
            catch (Exception ex) {
            throw new ServletException(ex);
        }
         
    }
    
      
    
   

}
