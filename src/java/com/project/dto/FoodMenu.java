/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dto;

import java.io.InputStream;

public class FoodMenu {
    private int fooditemid;
    private String foodcategory;
    private String itemname;
    private String description;
    private int quantity;
    private int price;
    private InputStream image;  

    @Override
    public String toString() {
        return "FoodMenu{" + "fooditemid=" + fooditemid + ", foodcategory=" + foodcategory + ", itemname=" + itemname + ", description=" + description + ", quantity=" + quantity + ", price=" + price + ", image=" + image + '}';
    }
   
    public int getFooditemid() {
        return fooditemid;
    }

    public void setFooditemid(int fooditemid) {
        this.fooditemid = fooditemid;
    }

    public String getFoodcategory() {
        return foodcategory;
    }

    public void setFoodcategory(String foodcategory) {
        this.foodcategory = foodcategory;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }
}
