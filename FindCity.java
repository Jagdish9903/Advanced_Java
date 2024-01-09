import java.sql.*;
import java.util.*;
public class FindCity {
	public static void main(String args[])
	{
		try
		{
		Scanner sc = new  Scanner(System.in);
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://21IT404//friends.accdb");
		Statement s = con.createStatement();
		System.out.print("enter a city name : ");
		String city = sc.nextLine();
		String query = "select * from friends where city = '" + city + "'";
		ResultSet rs = s.executeQuery(query);
		while(rs.next())
		{
			System.out.print("id : " + rs.getString(1) + ", name : " + rs.getString(2) + ", age : " + rs.getString(3) + "\n");

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
