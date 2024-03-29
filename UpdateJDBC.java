import java.sql.*;
import java.io.*;

class UpdateJDBC{
    public static void main(String a[]){
        try{
            String url ="jdbc:mysql://localhost:3306/youtube";
            String user ="root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url, user, password);

            String q ="Update table1 set tName=? , tCity=? where tId=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name:");
            String name = br.readLine();

            System.out.println("Enter new city:");
            String city = br.readLine();
            
            System.out.println("Enter id");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, name);
            ps.setString(2, city);
            ps.setInt(3, id);

            ps.executeUpdate();
            System.out.println("done");
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
