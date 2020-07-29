
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


@WebServlet(name = "DisplayOrderServlet", urlPatterns = {"/DisplayOrderServlet"})
public class DisplayOrderServlet extends HttpServlet {
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
                System.out.println("Entered into DisplayOrderServlet");

        
                  HttpSession session=request.getSession();
                  if(session.getAttribute("currentorderid")==null){
                  response.sendRedirect("emptycart.jsp");
                  }else{
                  int orderid=(int) session.getAttribute("currentorderid");
        
            try {
           Order orderdetail=CommonDao.getOrderRecordById(orderid);
              
      session.setAttribute("orderedfood",orderdetail.getFoodList());
      session.setAttribute("myorder",orderdetail);
              
      String page = "/myorders.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);   

            
            }
            catch (Exception ex) {
            throw new ServletException(ex);
        }
                  }   
    }
    
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    
    {
        doPost(request, response);
    }
}

    

   
