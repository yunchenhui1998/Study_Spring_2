package com.xupt.lifecycle;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("add a user");
	}
	public void myInit() {
		System.out.println("初始化");
	}
	public void myDestroy() {
		System.out.println("销毁");
	}
}
