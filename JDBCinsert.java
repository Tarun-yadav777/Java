package JavaPrograms;
//1.import package
import java.sql.*;
public class JDBCinsert {
    public static void main(String arg[]) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/my_data";
        String uname = "root";
        String pass = "tarunrao777";
        int sno = 6;
        String name = "Jatin";
        String nerd_hobby = "Steamer";
        String query = "INSERT INTO NERDS VALUES ("+sno+",'"+name+"','"+nerd_hobby+"');";
        // 2.load and register driver
        Class.forName("com.mysql.jdbc.Driver");
        //3.create connection
        Connection cn = DriverManager.getConnection(url,uname,pass);
        //4.create statement
        Statement st = cn.createStatement();
        //5. insert query
        int count = st.executeUpdate(query);
        System.out.println(count+" row/s affected ");
        cn.close();
        st.close();
    }
}
