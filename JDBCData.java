import java.sql.*;
class JDBCData{
public static void main(String[] args)throws Exception 
{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sasidb","sasi");

Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from jdbc");
while(rs.next()){
System.out.println(rs.getInt("id")+" , "+rs.getString("name")+" , "+rs.getInt("age")+" , "+rs.getInt("sal"));
}
rs.close();
st.close();
con.close();
}
} 