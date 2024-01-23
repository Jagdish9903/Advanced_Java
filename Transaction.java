import java.util.*;
import java.sql.*;
public class Transaction {
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
			con.setAutoCommit(false);
			System.out.println("enter the id of sender : ");
			int send = sc.nextInt();
			System.out.println("enter the id of receiver : ");
			int rec = sc.nextInt();
			System.out.println("enter the amount to transfer : ");
			int money = sc.nextInt();
			String q = "update bank set amount = amount - " + money + " where id = "  + send + " and amount >= " + money;
			Statement s = con.createStatement();
			int a = s.executeUpdate(q);
			q = "update bank set amount = amount + " + money + " where id = "  + rec;
			s = con.createStatement();
			int b = s.executeUpdate(q);
			if(a > 0 && b > 0)
			{
				con.commit();
				System.out.println("transaction done successfully!");
			}
			else
			{
				System.out.println("failed transaction!");
			}
			sc.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("caught an exception!" + e);
		}
	}
}
