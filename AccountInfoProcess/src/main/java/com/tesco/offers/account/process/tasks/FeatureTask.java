package com.tesco.offers.account.process.tasks;

import java.util.concurrent.Callable;

import com.tesco.offers.account.dao.beans.BalanceDAOReqBean;
import com.tesco.offers.account.dao.beans.BalanceDAOResBean;
import com.tesco.offers.account.dao.beans.FeatureDAOReqBean;
import com.tesco.offers.account.dao.impl.BalanceDAOImpl;
import com.tesco.offers.account.dao.impl.FeatureDAOImpl;

public class FeatureTask implements Callable<TaskResult> {
	
	FeatureDAOReqBean reqbean;
	public FeatureTask(FeatureDAOReqBean reqbean)
	{
		this.reqbean=reqbean;
	}
	@Override
	public TaskResult call() throws Exception {
		// TODO Auto-generated method stub

		FeatureDAOImpl impl=new FeatureDAOImpl();
		FeatureDAOResBean  daores=impl.getbalance(reqbean);
	    TaskResult ts=new TaskResult();
	    ts.setName("balancetask");
	    ts.setResult(ts);
	    
	 
		
		
		return ts;


}
