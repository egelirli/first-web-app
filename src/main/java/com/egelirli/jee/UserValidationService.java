package com.egelirli.jee;

public class UserValidationService {
     
	boolean isUserValid(String user, String password) {
		
		if(user.equals("veli") && password.equals("dummy")) {
			return true;
		}else {
			return false;
		}
			
	}
	 
}
