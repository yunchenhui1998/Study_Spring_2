package com.xupt.service;

import com.xupt.dao.AccountDAO;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDAO.out(outer, money);
		accountDAO.in(inner, money);
	}

}
