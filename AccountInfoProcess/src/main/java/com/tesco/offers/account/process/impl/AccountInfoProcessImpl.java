/*********************************************************************************************
 *
 *    @Copyright for Tesko, Term and Conditions applied
 *   
 *    @Date: Jan 1, 20192019
 *    
 *    @User: Sharath
 *
 *    @Project: AccountInfoService
 *
 */
package com.tesco.offers.account.process.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.tesco.offers.account.beans.CardVerifyReqBean;
import com.tesco.offers.account.beans.CardVerifyResBean;
import com.tesco.offers.account.dao.beans.BalanceDAOReqBean;
import com.tesco.offers.account.dao.beans.CardDAOReqBean;
import com.tesco.offers.account.dao.beans.FeatureDAOReqBean;
import com.tesco.offers.account.dao.impl.BalanceDAOImpl;
import com.tesco.offers.account.dao.impl.CardDAOImpl;
import com.tesco.offers.account.impl.CardVerifyImpl;
import com.tesco.offers.account.process.beans.AccountInfoProcessReqBean;
import com.tesco.offers.account.process.beans.AccountInfoProcessResBean;
import com.tesco.offers.account.process.beans.BalanceProcess;
import com.tesco.offers.account.process.beans.BalanceReqBean;
import com.tesco.offers.account.process.beans.FutureProcess;
import com.tesco.offers.account.process.tasks.BalanceTask;
import com.tesco.offers.account.process.tasks.CardTask;
import com.tesco.offers.account.process.tasks.FeatureTask;
import com.tesco.offers.account.process.tasks.TaskResult;

/**
 * @author Sharath
 *
 * @Date: Jan 1, 2019
 *
 * @description:
 *
 */
public class AccountInfoProcessImpl {
	
	AccountInfoProcessResBean getStatus(AccountInfoProcessReqBean reqbean){
		//AccountInfoProcessResBean presbean=new AccountInfoProcessResBean();
		AccountInfoProcessReqBean preqbean=new AccountInfoProcessReqBean();
		
		CardVerifyImpl cv=new CardVerifyImpl();
		
		CardVerifyReqBean creqbean=new CardVerifyReqBean();
		//set a elements from proc res to cardverify req obj
		creqbean.setCardnumber(preqbean.getAccnumber());
		creqbean.setChannelid(preqbean.getChannelid());
		creqbean.setClientid(preqbean.getClientid());
		CardVerifyResBean cresbean=cv.getVerify(creqbean);
		AccountInfoProcessResBean presbean=new AccountInfoProcessResBean();
		
		
		BalanceReqBean reqbean1=null;
		CardProcess cimpl=null;
		FutureProcess ftreq=null;
		//get status from cardverify
		if(cresbean.isValied())
		{
			ExecutorService svc=Executors.newFixedThreadPool(3);
			
			Set tasks=new HashSet();
			
			tasks.add(new BalanceTask(reqbean1));
			tasks.add(new CardTask(cimpl));
			tasks.add(new FeatureTask(ftreq));
			List<Future<TaskResult>> futurelist=presbean.invokeAll(tasks);
			for(Future f: futurelist)
			{
				TaskResult ts=(TaskResult)f.get();
				if("balancetask".equals(ts.getTaskName()){
					System.out.println("Entered into balance task");
					BalanceDAOResBean resbean=new BalanceDAOResBean();
					reqbean1
					
					
				}
			}
			
			
		}
		
		
		
		


return null;
}
}
