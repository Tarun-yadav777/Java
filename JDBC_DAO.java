package JavaPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Nerd
{
    int sno;
    String name;
    String hobby;
}
class NerdDoa
{
    public Nerd getName(String name) throws Exception
    {
        String query = "SELECT NERD_HOBBY FROM NERDS WHERE NAME='Tarun';";
        Nerd n = new Nerd();
        n.name=name;
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_data","root","tarunrao777");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String names = rs.getString(1);
        n.hobby=names;
        return n;
    }
    public void addvalue(Nerd o) throws Exception
    {

        String query = "INSERT INTO NERDS VALUES ("+o.sno+",'"+o.name+"','"+o.hobby+"');";
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_data","root","tarunrao777");
        Statement st = cn.createStatement();
        int count = st.executeUpdate(query);
        System.out.println(count+" row/s affected ");
        cn.close();
        st.close();
    }
}
public class JDBC_DAO {
    public static void main(String arg[]) throws Exception
    {
        NerdDoa nd = new NerdDoa();
        Nerd n1 = nd.getName("Tarun");
        System.out.println(n1.hobby);
        Nerd n2 = new Nerd();
        n2.sno=7;
        n2.name="Mukul";
        n2.hobby="Optimist";
        nd.addvalue(n2);

    }
}
