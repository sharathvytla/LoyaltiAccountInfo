package com.tesco.offers.account.process.beans;

public class BalanceReqBean {
	private double availablepts;
	private long cardblnc;
	private long creditlimit;
	public double getAvailablepts() {
		return availablepts;
	}
	public void setAvailablepts(double availablepts) {
		this.availablepts = availablepts;
	}
	public long getCardblnc() {
		return cardblnc;
	}
	public void setCardblnc(long cardblnc) {
		this.cardblnc = cardblnc;
	}
	public long getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(long creditlimit) {
		this.creditlimit = creditlimit;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BalanceReqBean [availablepts=");
		builder.append(availablepts);
		builder.append(", cardblnc=");
		builder.append(cardblnc);
		builder.append(", creditlimit=");
		builder.append(creditlimit);
		builder.append("]");
		return builder.toString();
	}
	 

}
