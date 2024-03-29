import java.sql.*;

class InsertJDBC{
    public static void main(String a[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating a connection
            String url ="jdbc:mysql://localhost:3306/youtube";
            String user ="root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url,user,password);

            //create a query
            String q ="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";

            Statement stmt = con.createStatement();

            stmt.executeUpdate(q);
            
            System.out.println("Table Created in DB");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}