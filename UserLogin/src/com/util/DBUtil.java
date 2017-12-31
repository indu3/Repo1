package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtil {
	private static DBUtil dbutil;
	private  Connection con;
	private DBUtil()
	{
	
	}
	public synchronized static DBUtil getInstance()
	{
		
		
			if(dbutil==null)
			{
				dbutil=new DBUtil();
			}
		
		
		return dbutil;
	}
	
public  Connection getConnection()throws SQLException,ClassNotFoundException
{
	try{
		
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	
	 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","system");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	} 
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	} 
	catch(Exception e)
	{
		e.printStackTrace();
	} 
	return con;
}


}
