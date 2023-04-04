package com.cdac.loginpageregister.service;

import com.cdac.loginpageregister.entity.User;


public interface UserService {

	public User createUser(User user);

	public boolean checkEmail(String email);
	

}
