package com.project.servlet;

import com.project.dao.CommonDao;
import com.project.dto.FoodMenu;
import java.io.IOException;

import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name = "UpdateMenuServlet", urlPatterns = {"/UpdateMenuServlet"})
@MultipartConfig(maxFileSize = 16177216)
public class UpdateMenuServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        System.out.println("Entered in UpdateMenuServlet");

        int fooditemid=Integer.parseInt(request.getParameter("fooditemid"));
        String foodcategory = request.getParameter("foodcategory");
        String itemname = request.getParameter("itemname");
        String description = request.getParameter("description");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        int price = Integer.parseInt(request.getParameter("price"));
        Part image = request.getPart("image");
        InputStream inputStream = null; // input stream of the upload file
        inputStream = image.getInputStream();

        FoodMenu foodmenu = new FoodMenu();
        foodmenu.setFooditemid(fooditemid);
        foodmenu.setFoodcategory(foodcategory);
        foodmenu.setItemname(itemname);

        foodmenu.setDescription(description);
        foodmenu.setPrice(price);
        foodmenu.setQuantity(quantity);
        foodmenu.setImage(inputStream);
        
        System.out.println(foodmenu);

        boolean flag = CommonDao.addUpdateMenu(foodmenu);
        
        System.out.println("coming back from method");
        RequestDispatcher dispatcher = request.getRequestDispatcher("updatesuccess.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}
