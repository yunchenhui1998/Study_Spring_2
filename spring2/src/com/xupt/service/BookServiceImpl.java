package com.xupt.service;

import com.xupt.dao.BookDAO;

public class BookServiceImpl implements BookService {
	private BookDAO bookDAO;
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	@Override
	public void doAddBook() {
		// TODO Auto-generated method stub
		this.bookDAO.addBook();;
	}

}
