package com.project.dao;

import com.project.db.DbConnection;
import com.project.dto.FoodMenu;
import com.project.dto.Order;
import com.project.dto.User;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//ADDUSER METHOD
public class CommonDao {

    public static boolean addUserRecord(User user) {
        boolean flag = true;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into addUserRecord");


        String sql = "insert into userdata (firstname,lastname,email,contact,password,cpassword) values(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getContact());

            ps.setString(5, user.getPassword());
            ps.setString(6, user.getCpassword());
            if (user.getPassword().equals(user.getCpassword())) {

                ps.execute();
                System.out.println("your data is saved");

            } else {
                System.out.print("password and confirm password must be same");
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        return flag;

    }

    //LOGINUSER METHOD

    public static int loginUser(User user) {

        Connection conn = DbConnection.getConnection();
        System.out.println("Entered into loginUserMethod");

        String sql = "select id,email,password  from userdata";
        int id = 0;
        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int dbId = rs.getInt("id");
                String dbemail = rs.getString("email");
                String dbpassword = rs.getString("password");

                String email = user.getEmail();
                String password = user.getPassword();

                if (email.equals(dbemail) && password.equals(dbpassword)) {
                    System.out.print("Login Successfull");

                    id = dbId;

                    System.out.print("Login Successfull");

                } else {
                    System.out.println("login undone");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    //GETUSER(INT ID) METHOD

    public static User getUser(int id) {

        User user = null;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into getUserMethod");

        String sql = "select * from userdata where id=" + id;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                user = new User();
                int dbid = result.getInt("id");
                String dbfirstname = result.getString("firstname");
                String dblastname = result.getString("lastname");
                String dbemail = result.getString("email");
                String dbcontact = result.getString("contact");
                user.setUserid(dbid);
                user.setFirstname(dbfirstname);
                user.setLastname(dblastname);
                user.setEmail(dbemail);
                user.setContact(dbcontact);

            }

        } catch (SQLException e) {
            System.out.print(e);
        }

        return user;

    }

    //GETPHOTO(INT FOODID) METHOD

    public static Blob getPhoto(int FoodId) {

        Blob blob = null;
        InputStream inputStream = null;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into getPhoto method");
        String sql = "select image from foodmenu where fooditemid=" + FoodId;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();

            while (result.next()) {

                blob = result.getBlob("image");
                System.out.println(blob);

            }

        } catch (SQLException e) {
            System.out.print(e);
        }

        return blob;
    }

    
    //LIST<FOODMENU> GETFOODRECORD METHOD

    public static List<FoodMenu> getFoodRecord() {

        FoodMenu foodMenu = null;
        List<FoodMenu> foodList = new ArrayList<>();
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into getFoodRecordofList type Method");

        
        String sql = "select * from foodmenu";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                foodMenu = new FoodMenu();
                String dbitemname = result.getString("itemname");
                String dbfoodcategory = result.getString("foodcategory");
                int dbprice = result.getInt("price");
                int dbquantity = result.getInt("quantity");
                int dbfooditemid = result.getInt("fooditemid");
                String dbdescription = result.getString("description");
                Blob blob = result.getBlob("image");
                foodMenu.setFooditemid(dbfooditemid);
                foodMenu.setItemname(dbitemname);
                foodMenu.setFoodcategory(dbfoodcategory);
                foodMenu.setPrice(dbprice);
                foodMenu.setQuantity(dbquantity);
                foodMenu.setDescription(dbdescription);
                foodList.add(foodMenu);
            }

        } catch (SQLException e) {
            System.out.print(e);
        }

        return foodList;
    }

    //LIST<FOODMENU> SEARCHFOOD(STRING SEARCH) METHOD

    public static List<FoodMenu> searchFood(String search) {

        FoodMenu foodMenu = null;
        List<FoodMenu> foodList = new ArrayList<>();
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("entering into searchFood of List type method");
        String sql = "select * from foodmenu where foodcategory LIKE '%" + search + "%' OR " + "itemname LIKE '%" + search + "%'";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();

            while (result.next()) {
                foodMenu = new FoodMenu();

                int dbfooditemid = result.getInt("fooditemid");
                String dbfoodcategory = result.getString("foodcategory");
                String dbitemname = result.getString("itemname");

                int dbquantity = result.getInt("quantity");
                String dbdescription = result.getString("description");
                int dbprice = result.getInt("price");

                Blob blob = result.getBlob("image");

                foodMenu.setFooditemid(dbfooditemid);
                foodMenu.setFoodcategory(dbfoodcategory);
                foodMenu.setItemname(dbitemname);

                foodMenu.setDescription(dbdescription);
                foodMenu.setQuantity(dbquantity);

                foodMenu.setPrice(dbprice);

                foodList.add(foodMenu);

            }

        } catch (SQLException e) {
            System.out.print(e);
        }

        return foodList;

    }

    //ADDFOODRECORD(FOODMENU  foodmenu) METHOD

    public static boolean addFoodRecord(FoodMenu foodmenu) {
        boolean flag = true;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into addFoodRecord Method");

        
        String sql = "insert into foodmenu (foodcategory,itemname,description,quantity,price,image) values(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, foodmenu.getFoodcategory());
            ps.setString(2, foodmenu.getItemname());

            ps.setString(3, foodmenu.getDescription());
            ps.setInt(4, foodmenu.getQuantity());

            ps.setInt(5, foodmenu.getPrice());
            ps.setBlob(6, foodmenu.getImage());
            ps.execute();

        } catch (SQLException e) {
            System.out.print(e);
        }
        return flag;

    }


    public static void updatePassword(User user) {
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into updatePassword Method");

        
        String npassword = user.getPassword();
        String cpassword = user.getCpassword();
        String email = user.getEmail();
        System.out.println(npassword);
        System.out.println(cpassword);
        System.out.println(email);

        String sql = "update userdata set password=?,cpassword=? where email=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, npassword);
            ps.setString(2, cpassword);
            ps.setString(3, email);
            ps.executeUpdate();
            System.out.println("your data is updated");

        } catch (SQLException e) {
            System.out.print(e);
        }

    }

    //we retreive userid through  the user email
    public static int getId(User user) {

        Connection conn = DbConnection.getConnection();
        String email = user.getEmail();
        System.out.println("connection" + conn);
                System.out.println("Entered into getId Method");

        
        String sql = "select id from userdata where email=" + email;
        System.out.println("i am reached after sql");
        int dbid = -1;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                user = new User();
                dbid = result.getInt("id");

            }
            System.out.println(user);
            System.out.println(dbid);

        } catch (SQLException e) {
            System.out.print(e);
        }
        return dbid;
    }

    //update userdata through the assigned userid
    public static void updateUser(User user) {

        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into updateUser Method");

        
        int id = user.getUserid();
        String firstname = user.getFirstname();
        String lastname = user.getLastname();
        String email = user.getEmail();
        String contact = user.getContact();

        System.out.print(id);
        System.out.print(firstname);
        System.out.print(lastname);
        System.out.print(email);
        System.out.print(contact);

        String sql = "update userdata set firstname=?,lastname=?,email=?,contact=? where id=" + id;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, contact);
            ps.execute();

        } catch (SQLException e) {
            System.out.print(e);
        }

    }

    //retreiving all food items by their food id
    public static FoodMenu getFoodItemById(int id) {

        FoodMenu foodmenu = null;

        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("entered into getFooditembyId  method");
        String sql = "select * from foodmenu where fooditemid=" + id;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                foodmenu = new FoodMenu();

                int dbfooditemid = result.getInt("fooditemid");

                String dbfoodcategory = result.getString("foodcategory");
                String dbitemname = result.getString("itemname");
                String dbdescription = result.getString("description");
                int dbquantity = result.getInt("quantity");
                int dbprice = result.getInt("price");
                Blob dbimage = result.getBlob("image");

                foodmenu.setFooditemid(dbfooditemid);
                foodmenu.setFoodcategory(dbfoodcategory);
                foodmenu.setItemname(dbitemname);
                foodmenu.setDescription(dbdescription);
                foodmenu.setQuantity(dbquantity);
                foodmenu.setPrice(dbprice);

            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        return foodmenu;
    }

    //cancel order through assigned userid
    public static void cancelOrder(int id) {

        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into cancelOrder Method");

        
        String sql = "delete  from orderfood where orderid=" + id;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static Order getOrderRecord() {

        Order order = null;
        ArrayList foodmenu = null;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into getOrderRecord Method");

        
        String sql = "select * from orderfood";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                order = new Order();
                int dborderid = result.getInt("orderid");
                int dbuserid = result.getInt("id");
                String dbflatno = result.getString("flatno");
                String dbstreetname = result.getString("streetname");
                String dbarea = result.getString("area");
                String dbcity = result.getString("city");
                String dblandmark = result.getString("landmark");
                int dbtotalcost = result.getInt("totalcost");
                String dbfoodList = result.getString("foodList");
               
                
                order.setOrderid(dborderid);
                order.setUserid(dbuserid);
                order.setFlatno(dbflatno);
                order.setStreetName(dbstreetname);
                order.setArea(dbarea);
                order.setLandmark(dblandmark);
                order.setCity(dbcity);
                order.setTotalcost(dbtotalcost);
              
                
                
                String foodids[] = dbfoodList.split(",");

                for (String id : foodids) {
                    if (foodmenu == null) {
                        foodmenu = new ArrayList();
                    }
                    foodmenu.add(getFoodItemById(Integer.parseInt(id)));
                }
                order.setFoodList(foodmenu);

            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return order;
    }

  //retreive OrderRecord through orderid
    public static Order getOrderRecordById(int orderid) {

        Order order = null;
        
        ArrayList foodmenu = null;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("entered into getOrderrecordbyId  method");
        String sql = "select * from orderfood where orderid=" + orderid;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                order = new Order();
                
                int dborderid= result.getInt("orderid");
                int dbuserid = result.getInt("id");
                String dbflatno = result.getString("flatno");
                String dbstreetname = result.getString("streetname");
                String dbarea = result.getString("area");
                String dbcity = result.getString("city");
                String dblandmark = result.getString("landmark");
                int dbtotalcost = result.getInt("totalcost");
                String dbfoodList = result.getString("foodList");
              
                
                order.setOrderid(orderid);
                order.setUserid(dbuserid);
                order.setFlatno(dbflatno);
                order.setStreetName(dbstreetname);
                order.setArea(dbarea);
                order.setLandmark(dblandmark);
                order.setCity(dbcity);
                order.setTotalcost(dbtotalcost);
                String foodids[] = dbfoodList.split(",");
                

                for (String foodid : foodids) {
                    if (foodmenu == null) {
                        foodmenu = new ArrayList();
                    }
                    foodmenu.add(getFoodItemById(Integer.parseInt(foodid)));
                }
                order.setFoodList(foodmenu);

            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return order;

    }

    public static int addOrder(Order order) {

        int autoGeneratedID=0;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into addOrderMethod");


        java.util.Date date = new java.util.Date();

        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        java.sql.Timestamp sqlTime = new java.sql.Timestamp(date.getTime());
        String sql = "insert into orderfood (id,flatno,streetname,area,landmark,city,totalcost,foodList,ordertime) values(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, order.getUserid());
            ps.setString(2, order.getFlatno());
            ps.setString(3, order.getStreetName());
            ps.setString(4, order.getArea());
            ps.setString(5, order.getLandmark());
            ps.setString(6, order.getCity());
            ps.setInt(7, order.getTotalcost());
            String foodList = "";

            for (Object foodmenu : order.getFoodList()) {
                FoodMenu menu = (FoodMenu) foodmenu;
                Integer foodid = menu.getFooditemid();

                if (foodList.equals("")) {
                    foodList = "" + foodid;
                } else {
                    foodList += "," + foodid;
                }
            }

            ps.setString(8, foodList);
           
            ps.setTimestamp(9, sqlTime);

            ps.executeBatch();
            ps.executeUpdate();
            
            ResultSet tableKeys = ps.getGeneratedKeys();
            tableKeys.next();
            autoGeneratedID = tableKeys.getInt(1);
            System.out.println("+++++++++++" + autoGeneratedID);

        } catch (SQLException e) {
            System.out.print(e);

        }
        return autoGeneratedID;

    }

    public static ArrayList<User> regusers() {

        User user = null;
        ArrayList<User> reguser = new ArrayList<>();
        try {
            Connection con = DbConnection.getConnection();
            System.out.println("connection" + con);
            System.out.println("Entered into regusers Method of arraylist type");

            
            String sql = "select * from userdata";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                user = new User();
                int id = rs.getInt("id");
                String fname = rs.getString("firstname");
                String lname = rs.getString("lastname");
                String contact = rs.getString("contact");
                String email = rs.getString("email");

                user.setUserid(id);
                user.setFirstname(fname);
                user.setLastname(lname);
                user.setContact(contact);
                user.setEmail(email);

                reguser.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return reguser;
    }

    public static boolean removeItem(int food_id) {

        boolean flag = true;
        Connection con = DbConnection.getConnection();
        System.out.println("connection" + con);
        System.out.println("Entered into removeItem Method");

        
        try {
            String sql = "delete from foodmenu where fooditemid=" + food_id;
            PreparedStatement ps = con.prepareStatement(sql);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean addUpdateMenu(FoodMenu foodmenu) {
        boolean flag = true;
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into addUpdateMenu Method");

        

        int fooditemid = foodmenu.getFooditemid();
        String foodcategory = foodmenu.getFoodcategory();
        String itemname = foodmenu.getItemname();
        String description = foodmenu.getDescription();
        int quantity = foodmenu.getQuantity();
        int price = foodmenu.getPrice();
        InputStream image = foodmenu.getImage();

        System.out.println(fooditemid);
        System.out.println(foodcategory);
        System.out.println(itemname);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(image);

        System.out.println("COMPLETE PRINTING VALUES");

        String sql = "update foodmenu set foodcategory=?,itemname=?,description=?,quantity=?,price=?,image=? where fooditemid=" + fooditemid;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, foodcategory);
            ps.setString(2, itemname);
            ps.setString(3, description);
            ps.setInt(4, quantity);
            ps.setInt(5, price);
            ps.setBlob(6, image);
            ps.execute();

        } catch (SQLException e) {
            System.out.print(e);
        }
        return flag;
    }
    
    public static ArrayList<Integer> allOrders() {

        ArrayList<Integer> orderlist = new ArrayList();
        Connection conn = DbConnection.getConnection();
        System.out.println("connection" + conn);
        System.out.println("Entered into allOrders Method of arraylist type");

        
        String sql = "select * from orderfood";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet result = ps.executeQuery();
            while (result.next()) {

                int dborderid = result.getInt("orderid");

                orderlist.add(dborderid);
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        return orderlist;
    }

}
