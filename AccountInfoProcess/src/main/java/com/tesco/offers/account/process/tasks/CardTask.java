package com.tesco.offers.account.process.tasks;

import java.util.concurrent.Callable;

import com.tesco.offers.account.dao.beans.BalanceDAOReqBean;
import com.tesco.offers.account.dao.beans.BalanceDAOResBean;
import com.tesco.offers.account.dao.beans.CardDAOReqBean;
import com.tesco.offers.account.dao.beans.CardDAOResBean;
import com.tesco.offers.account.dao.impl.BalanceDAOImpl;
import com.tesco.offers.account.dao.impl.CardDAOImpl;

public class CardTask implements Callable<TaskResult> {
	 
	
	CardDAOReqBean reqbean;
	public CardTask(CardDAOReqBean reqbean)
	{
		this.reqbean=reqbean;
	}
	@Override
	public TaskResult call() throws Exception {
		// TODO Auto-generated method stub

		CardDAOImpl impl=new CardDAOImpl();
		CardDAOResBean  daores=impl.getcard(reqbean);
	    TaskResult ts=new TaskResult();
	    ts.setName("cardcetask");
	    ts.setResult(reqbean);
	    
	    return ts;
	}
	
	
}
