
package com.project.db;

import java.sql.Connection;
import java.sql.DriverManager;



public class DbConnection implements DbProperties {
    static Connection conn;
    
    public static Connection getConnection(){
    if(conn==null){
        
    try{
     Class.forName(DRIVER);
     conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
    
    }  
    catch (Exception e) {
          e.printStackTrace();
    }     
    }
        return conn;
    }
}

