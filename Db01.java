import java.sql.*;
public class Db01 {
	public static void main(String args[])
	{
		try {
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://21IT404//friends.accdb");
		Statement s = con.createStatement();
		String query = "select * from friends";
		ResultSet rs=s.executeQuery(query);
		while(rs.next())
		{
			System.out.println("id : " + rs.getString(1));
			System.out.println("name : " + rs.getString(2));
			System.out.println("age : " + rs.getString(3));
			System.out.println("city : " + rs.getString(4));
		}
		s.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println("caught an exception!" + e);
		}
	}
}
