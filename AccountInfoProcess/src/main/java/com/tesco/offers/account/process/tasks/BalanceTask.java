package com.tesco.offers.account.process.tasks;

import java.util.concurrent.Callable;

import com.tesco.offers.account.dao.beans.BalanceDAOReqBean;
import com.tesco.offers.account.dao.beans.BalanceDAOResBean;
import com.tesco.offers.account.dao.impl.BalanceDAOImpl;

public class BalanceTask implements Callable<TaskResult> {
	
BalanceDAOReqBean reqbean;
public BalanceTask(BalanceDAOReqBean reqbean)
{
	this.reqbean=reqbean;
}
@Override
public TaskResult call() throws Exception {
	// TODO Auto-generated method stub

	BalanceDAOImpl impl=new BalanceDAOImpl();
	BalanceDAOResBean  daores=impl.getbalance(reqbean);
    TaskResult ts=new TaskResult();
    ts.setName("balancetask");
    ts.setResult(ts);
    
 
	
	
	return ts;
}
}
