/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class LoginServlet extends HttpServlet {

         @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
                System.out.println("Entered into LoginServlet");

        
        String emailaddress=request.getParameter("email");
        String password=request.getParameter("password");
        
        User user=new User();
        user.setEmail(emailaddress);
         user.setPassword(password);
   if(emailaddress.equals("admin@gmail.com") && password.equals("admin")){
            response.sendRedirect("dashboard.jsp");
        }
   else{
        int dbid =CommonDao.loginUser(user);
        if(dbid!=0){
            
            
            out.println("Login successful");
            HttpSession session = request.getSession(true);
            String loggedemail = request.getParameter("username");
            session.setAttribute("loggedemail",emailaddress );
            session.setAttribute("loggedid", dbid);
            session.setMaxInactiveInterval(10*60);
            session.setAttribute("userid",dbid);
             String page = "/index.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);  
        }
        else
        {
    
                String message = "Invalid email/password";
                request.setAttribute("message", message);
                String page = "/login.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);
           
        }}
        
}
    }

       


