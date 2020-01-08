package JavaPrograms;
// 1.import package
import java.sql.*;
public class JDBC2 {
    public static void main(String arg[]) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/my_data";
        String uname = "root";
        String pass = "tarunrao777";
        String query = "SELECT * FROM NERDS;";
        String data = "";
        // 2.load and register driver
        Class.forName("com.mysql.jdbc.Driver");
        // 3.create connection
        Connection cn = DriverManager.getConnection(url,uname,pass);
        // 4.create statement
        Statement st = cn.createStatement();
        // 5.state query
        ResultSet rs = st.executeQuery(query);
        // 6.process result

        while(rs.next())
        {
            data = rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3);
            System.out.println(data);
        }
        st.close();
        cn.close();
    }
}
