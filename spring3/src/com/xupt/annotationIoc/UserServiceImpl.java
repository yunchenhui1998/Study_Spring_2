package com.xupt.annotationIoc;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("add a user");
	}

}
