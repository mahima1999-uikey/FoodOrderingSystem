/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.db.DbConnection;
import java.sql.Connection;
import com.project.dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignupServlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        
         System.out.println("Entered into SignupServlet");

       
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
      
        String emailaddress=request.getParameter("email");
        String contact=request.getParameter("contact");
        String password=request.getParameter("password");
        String cpassword=request.getParameter("cpassword");

        User user=new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmail(emailaddress);
        user.setContact(contact);
        user.setPassword(password);
        user.setCpassword(cpassword);
        System.out.println("complete setting in user");
        System.out.println(user);
        
        if(password.equals(cpassword)){
        boolean flag=CommonDao.addUserRecord(user);
        
       
          
        if(flag==true)
        response.sendRedirect("login.jsp");
        
        }
        else
        {
            HttpSession session=request.getSession();
            String message="password and confirm password donot match ,try again !";
            session.setAttribute("message",message);
            String page = "/signup.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);
        }
       
}
    }

    

     
    

    