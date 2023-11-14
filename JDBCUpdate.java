import java.sql.*;
class JDBCUpdate{
public static void main(String[] args)throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sasidb","sasi");
Statement stmt = con.createStatement();
int n = stmt.executeUpdate("delete from jdbc where id=10");
if(n>0)
System.out.println("success");
else
System.out.println("not success");
con.close();
}
}