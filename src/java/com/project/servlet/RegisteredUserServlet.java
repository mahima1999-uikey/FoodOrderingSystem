
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RegisteredUserServlet", urlPatterns = {"/RegisteredUserServlet"})
public class RegisteredUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        
                System.out.println("Entered into RegisteredUserServlet");

 
       try{
           
            ArrayList<User> reguser;
            reguser=  CommonDao.regusers();
            System.out.println(">>>>>>."+reguser);
             
            request.setAttribute("reguser", reguser);
            
            String page = "/registereduser.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);
         

                 }catch(IOException e){out.print(e);}
    }


       
}

   