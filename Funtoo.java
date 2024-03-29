//PreparedStatement:insert

import java.sql.*;
import java.io.*;

class Funtoo{
    public static void main(String a[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating a connection
            String url ="jdbc:mysql://localhost:3306/youtube";
            String user ="root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url,user,password);

            //create a query 
            String q ="insert into table1(tName,tCity) values(?,?)";

            //get the preparedStatement Object
            PreparedStatement pstml = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name:");
            String name = br.readLine();

            System.out.println("Enter city:");
            String city = br.readLine();

            //set the value to query 
            pstml.setString(1,name);
            pstml.setString(2,city);

            pstml.executeUpdate();

            System.out.println("inserted...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}