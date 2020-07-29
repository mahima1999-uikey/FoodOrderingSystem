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


@WebServlet(name = "NewPasswordSetServlet", urlPatterns = {"/NewPasswordSetServlet"})
public class NewPasswordSetServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             response.setContentType("text/html");
             PrintWriter out=response.getWriter();
             
             System.out.println("Entered into NewPasswordSetServlet");

             
             String newpassword=request.getParameter("npassword");
             String confirmpassword=request.getParameter("cpassword");
             
             HttpSession session=request.getSession();
             
             String resetemail=(String) session.getAttribute("loggedemail");
             
              if(newpassword.equals(confirmpassword)){
                  
                  
              
              User user=new User();
              
              user.setPassword(newpassword);
              user.setCpassword(confirmpassword);
              user.setEmail(resetemail);
              
              System.out.println(user);
                  
              CommonDao.updatePassword(user);
              int id=CommonDao.getId(user);
              session.setAttribute("loggedid",id);
              session.setAttribute("loggedemail",resetemail);
                  RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
                  requestDispatcher.forward(request, response);
              } 
              else{
               
            String message="password and confirm password donot match ,try again !";
            session.setAttribute("message",message);
            String page = "/settings.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);   
                  
              }
    }
    }

       
   

