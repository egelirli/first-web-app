package com.egelirli.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
     
	public boolean isUserValid(String user, String password) {
		
		if(user.equals("veli") && password.equals("dummy")) {
			return true;
		}else {
			return false;
		}
			
	}
	 
}
