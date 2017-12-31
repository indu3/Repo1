package com.service;

import com.dao.UserDao;
import com.vo.UserBean;
import com.vo.User_details;

public class LoginService {
	UserBean user1;
public boolean checkUser(final UserBean user)
	
	{
		UserDao dao=new UserDao();
		final String uid=user.getName();
		final String pswd=user.getPswd();
		
		  user1= dao.getUserId(uid);
		  
		
		
		if(user1!=null && uid.equals(user1.getName()) && pswd.equals(user1.getPswd()))
		
			
            return true;
        else
        	return false;
		
	
			
		
    }


public User_details getUser()
{
	UserDao dao=new UserDao();
	User_details user=dao.getUser();
	return user;
	
}

}
