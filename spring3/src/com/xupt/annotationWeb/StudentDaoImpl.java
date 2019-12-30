package com.xupt.annotationWeb;

import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("dao");
	}

}
