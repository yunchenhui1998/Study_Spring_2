package com.xupt.aspect.annotation;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("add a user");
	}

	@Override
	public String updateUser() {
		// TODO Auto-generated method stub
		System.out.println("update a user");
//		int i=1/0;
		return "羊羊羊";
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("delete a user");
	}
	
}
