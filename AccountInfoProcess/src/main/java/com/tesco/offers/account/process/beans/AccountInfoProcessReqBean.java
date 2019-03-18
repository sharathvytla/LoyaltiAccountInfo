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



/**
 * @author Sharath
 *
 * @Date: Jan 1, 2019
 *
 * @description:
 *
 */
public class AccountInfoProcessReqBean {

	private String clientid;
	private String channelid;
	private String typeofaccount;
	private String accnumber;
	public String getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getChannelid() {
		return channelid;
	}
	public void setChannelid(String channelid) {
		this.channelid = channelid;
	}
	public String getTypeofaccount() {
		return typeofaccount;
	}
	public void setTypeofaccount(String typeofaccount) {
		this.typeofaccount = typeofaccount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountInfoProcessReqBean [clientid=");
		builder.append(clientid);
		builder.append(", channelid=");
		builder.append(channelid);
		builder.append(", typeofaccount=");
		builder.append(typeofaccount);
		builder.append(", accnumber=");
		builder.append(accnumber);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	}
