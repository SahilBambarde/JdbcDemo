//PreparedStatement:insert

import java.sql.*;

class Fun{
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

            //set the value to query 
            pstml.setString(1,"Mrunmai Bambarde");
            pstml.setString(2,"Nagpur");

            pstml.executeUpdate();

            System.out.println("inserted...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}