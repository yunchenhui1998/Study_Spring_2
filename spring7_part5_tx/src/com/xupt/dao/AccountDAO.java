package com.xupt.dao;

public interface AccountDAO {
	/**
	 * 汇款
	 * 
	 * 
	 * 
	 */
	public void out(String outer,Integer money);
	/*收款
	 * 
	 * 
	 * 
	 * */
	public void in(String inner,Integer money);
}
