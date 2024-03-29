import java.sql.*;
public class FirstJDBC {
    //first program for jdbc
    public static void main(String[] a){
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating a connection
            String url ="jdbc:mysql://localhost:3306/youtube";
            String user ="root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url,user,password);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("Connection Created");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
