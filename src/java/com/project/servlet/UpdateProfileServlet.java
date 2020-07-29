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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UpdateProfileServlet", urlPatterns = {"/UpdateProfileServlet"})
public class UpdateProfileServlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            System.out.println("Entered into UpdateProfileServlet");

            
            try{
                
            HttpSession session=request.getSession();
            int id=(int) session.getAttribute("loggedid");
                System.out.println(id);
            String firstname=request.getParameter("firstname");
            String lastname =request.getParameter("lastname");
            String email=request.getParameter("email");
            String contact=request.getParameter("contact");
            
            User user=new User();
            user.setFirstname(firstname);
            user.setLastname(lastname);
            user.setEmail(email);
            user.setContact(contact);
            user.setUserid(id);
                
            CommonDao.updateUser(user);
            
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request, response);
    }
            catch(Exception e){
                e.printStackTrace();
   }
    }
}