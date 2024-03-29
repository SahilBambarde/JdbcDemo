import java.sql.*;
class SelectJDBC{
    public static void main(String a[]){
        try{
            String url ="jdbc:mysql://localhost:3306/youtube";
            String user ="root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url, user, password);

            String q = "select * from table1";

            Statement stmt = con.createStatement();
            ResultSet set =stmt.executeQuery(q);

            while(set.next()){
                int id = set.getInt(1);
                String name =set.getString(2);
                String city = set.getString(3);
                System.out.println(name +" "+ city + " "+ id);
            }
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}