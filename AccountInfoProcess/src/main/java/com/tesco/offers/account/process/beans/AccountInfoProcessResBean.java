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
package com.tesco.offers.account.process.beans;

import java.util.List;

/**
 * @author Sharath
 *
 * @Date: Jan 1, 2019
 *
 * @description:
 *
 */
public class AccountInfoProcessResBean {
	private String rescode;
	private String usermsg;
	private BalanceProcess balanceprocess;
	private List<FutureProcess> futureprocess;
	private List<String> linkedcards;
	private AccountInfo accinfo;
	public AccountInfo getAccinfo() {
		return accinfo;
	}
	public void setAccinfo(AccountInfo accinfo) {
		this.accinfo = accinfo;
	}
	public String getRescode() {
		return rescode;
	}
	public void setRescode(String rescode) {
		this.rescode = rescode;
	}
	public String getUsermsg() {
		return usermsg;
	}
	public void setUsermsg(String usermsg) {
		this.usermsg = usermsg;
	}
	public BalanceProcess getBalanceprocess() {
		return balanceprocess;
	}
	public void setBalanceprocess(BalanceProcess balanceprocess) {
		this.balanceprocess = balanceprocess;
	}
	public List<FutureProcess> getFutureprocess() {
		return futureprocess;
	}
	public void setFutureprocess(List<FutureProcess> futureprocess) {
		this.futureprocess = futureprocess;
	}
	public List<String> getLinkedcards() {
		return linkedcards;
	}
	public void setLinkedcards(List<String> linkedcards) {
		this.linkedcards = linkedcards;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountInfoProcessResBean [rescode=");
		builder.append(rescode);
		builder.append(", usermsg=");
		builder.append(usermsg);
		builder.append(", balanceprocess=");
		builder.append(balanceprocess);
		builder.append(", futureprocess=");
		builder.append(futureprocess);
		builder.append(", linkedcards=");
		builder.append(linkedcards);
		builder.append(", accinfo=");
		builder.append(accinfo);
		builder.append("]");
		return builder.toString();
	}
	

}
