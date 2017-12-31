package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.apache.log4j.Logger;

import com.util.DBUtil;
import com.vo.UserBean;
import com.vo.User_details;

public class UserDao {
	static final Logger log=Logger.getLogger(UserDao.class.getName());
	
	
	final UserBean user1=new UserBean();

	
	public UserBean getUserId(final String uid)
	{
		//String uname1="u001";
			//	String upswd="xyz";
		DBUtil dbutil=DBUtil.getInstance();
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			
		
		
		 con=dbutil.getConnection();
		
		 ps=con.prepareStatement("select * from user1 where uiid= ?");
		 
		
		
		ps.setString(1,uid);
	
		 rs=ps.executeQuery();
	
		if(rs.next())
		{
		
			
			   
			     user1.setName(rs.getString(1));
			   
			    user1.setPswd(rs.getString(2)); 
			   // System.out.println(user.getName()+user.getPswd());
			    log.info("succesfull");
			    
		}
		
				//user.setName(uname1);
				//user.setPswd(upswd);
		}
		catch(final SQLException e1)
		{
			//e1.printStackTrace();
			//log.fatal(e1.getMessage());
			log.info(e1.getMessage());
		}
		catch(final ClassNotFoundException e2)
		{
			//e2.printStackTrace();
			log.error(e2.getMessage());
		}
		catch(final Exception e3)
		{
			//e3.printStackTrace();
			log.warn(e3.getMessage());
		}
		finally{
			if(ps!=null)
				try
			{
					ps.close();
			}
			catch(final Exception e)
			{
				e.printStackTrace();
			}
			if(rs!=null)
				try
			{
					rs.close();
			}
			catch(final Exception e)
			{
				e.printStackTrace();
			}
			if(con!=null)
				try
			{
					con.close();
			}
			catch(final Exception e)
			{
				e.printStackTrace();
			}
			
		}
		//System.out.println(user.getName()+user.getPswd());
		
		
		
		
	
		return user1;
			    
		 
			
		
		
		
	}
	
	
	
	public User_details getUser()
	{
		User_details udUser_details=new User_details();
	DBUtil dbutil=DBUtil.getInstance();
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			
		
		
		 con=dbutil.getConnection();
		 ps=con.prepareStatement("select * from user_datails where user_id= ?");
		 
			String uname="indoo";
			
			ps.setString(1,uname);
		
			 rs=ps.executeQuery();
		
			if(rs.next())
			{
			
				
				   
				     user1.setName(rs.getString(1));
				   
				    user1.setPswd(rs.getString(2)); 
				   // System.out.println(user.getName()+user.getPswd());
				    log.info("succesfull");
				    
			}
			
					//user.setName(uname1);
					//user.setPswd(upswd);
			}
			catch(final SQLException e1)
			{
				//e1.printStackTrace();
				//log.fatal(e1.getMessage());
				log.info(e1.getMessage());
			}
			catch(final ClassNotFoundException e2)
			{
				//e2.printStackTrace();
				log.error(e2.getMessage());
			}
			catch(final Exception e3)
			{
				//e3.printStackTrace();
				log.warn(e3.getMessage());
			}
			finally{
				if(ps!=null)
					try
				{
						ps.close();
				}
				catch(final Exception e)
				{
					e.printStackTrace();
				}
				if(rs!=null)
					try
				{
						rs.close();
				}
				catch(final Exception e)
				{
					e.printStackTrace();
				}
				if(con!=null)
					try
				{
						con.close();
				}
				catch(final Exception e)
				{
					e.printStackTrace();
				}
				
			}
			//System.out.println(user.getName()+user.getPswd());
		return udUser_details;
			
			
			
			
		
				    
			 
		
	}
	
		
	}


