
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
       
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
                System.out.println("Entered into ProfileServlet");
        
         try{
                      HttpSession session = request.getSession(true);
                    int id=(int) session.getAttribute("loggedid");
       User user=CommonDao.getUser(id);
            
       request.setAttribute("User", user);
                   RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
            dispatcher.forward(request, response);

      }catch(Exception e){e.printStackTrace();}
  
}


 }

    

    
   
    

