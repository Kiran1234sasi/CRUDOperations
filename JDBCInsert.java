import java.sql.*;
class JBBCInsert{
public static void main(String[] args)throws Exception{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sasidb","sasi");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from jdbc");
System.out.println("ID"+"   "+"NAME"+"   "+"AGE"+"   "+"SAL");
System.out.println("------------------------------------");
while(rs.next()){
System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getInt("age")+"   "+rs.getInt("sal"));
}
con.close();
}
}
