/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.servlet;

import com.project.dao.CommonDao;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PhotoServlet", urlPatterns = {"/PhotoServlet"})
public class PhotoServlet extends HttpServlet {

      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          System.out.println("Entered into PhotoServlet");
        try{
        System.out.println(">>>>>>>>>>>>>>>"+request.getParameter("fooditemid"));
        
       Blob blob= CommonDao.getPhoto(Integer.parseInt(request.getParameter("fooditemid")));
     
        
       
        byte byteArray[] = blob.getBytes(1, (int)blob.length());
 
        response.setContentType("image/gif");
        OutputStream os = response.getOutputStream();
        os.write(byteArray);
        os.flush();
        os.close();
          
  } catch (Exception e) {
      
 
        PrintWriter out=response.getWriter();
  response.setContentType("text/html");
  out.println("<html><head><title>Unable To Display image</title></head>");
  out.println("<body><h4><font color='red'>Image Display Error=" + e.getMessage() +
   "</font></h4></body></html>");
  return;
  }
    }
}

    
   



          

    

