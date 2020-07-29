package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.FoodMenu;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize=16177216)
@WebServlet(name = "AddFoodServlet", urlPatterns = {"/AddFoodServlet"})
public class AddFoodServlet extends HttpServlet {

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        System.out.println("Entered into AddFoodServlet");
        
        String foodcategory=request.getParameter("foodcategory");
        String itemname=request.getParameter("itemname");
        String description=request.getParameter("description");
        int quantity =Integer.parseInt(request.getParameter("quantity"));
        int price=Integer.parseInt(request.getParameter("price"));
        
        Part image=request.getPart("image");
        InputStream inputStream=null;
        inputStream=image.getInputStream();
        
        FoodMenu foodmenu=new FoodMenu();
        foodmenu.setFoodcategory(foodcategory);
        foodmenu.setItemname(itemname);
        foodmenu.setDescription(description);
        foodmenu.setQuantity(quantity);
        foodmenu.setPrice(price);
        foodmenu.setImage(inputStream);
        
        boolean flag=CommonDao.addFoodRecord(foodmenu);
        
    }

    

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          doPost(request, response);
    }
}
   


