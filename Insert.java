import java.sql.*;
import java.util.Scanner;
public class Insert {
	public static void main(String args[])
	{
		try {
		Scanner sc = new  Scanner(System.in);
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		Connection Con = DriverManager.getConnection("jdbc:ucanaccess://D://21IT404//friends.accdb");
		Statement s = Con.createStatement();
		System.out.println("enter name : ");
		String name = sc.nextLine();
		System.out.println("enter city : ");
		String city = sc.nextLine();
		System.out.println("enter age : ");
		int age = sc.nextInt();
		String query = "insert into friends(, '"+name+"',"+age+", '"+city+"')";
		s.executeUpdate(query);
		s.close();
		Con.close();
		}
		catch(Exception e)
		{
			System.out.println("caught an exception!" + e);
		}
	}
}
