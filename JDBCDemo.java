import java.sql.*;
class JDBCDemo{
public static void main(String[] args)throws Exception{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sasidb","sasi");
Statement stmt = con.createStatement();
int rs = stmt.executeUpdate("insert into jdbc values(500,'dj',56)");
if(rs>0)
System.out.println("insertion is completed");
else
System.out.println("insertion not is completed");
con.close();
}
}