package com.tesco.offers.account.process.beans;

import java.util.List;

public class AccountInfo {
	private List<String> accountnumber;
	private String typeofaccount;
	public List<String> getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(List<String> accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getTypeofaccount() {
		return typeofaccount;
	}
	public void setTypeofaccount(String typeofaccount) {
		this.typeofaccount = typeofaccount;
	}
	@Override
	public String toString() {
		return "AccountInfo [typeofaccount=" + typeofaccount + "]";
	}


}
