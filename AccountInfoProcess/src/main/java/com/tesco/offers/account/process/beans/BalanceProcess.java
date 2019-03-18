package com.tesco.offers.account.process.beans;

public class BalanceProcess {
	private double cardbalance;
	private double Creditlimit;
	private long availablepts;
	public double getCardbalance() {
		return cardbalance;
	}
	public void setCardbalance(double cardbalance) {
		this.cardbalance = cardbalance;
	}
	public double getCreditlimit() {
		return Creditlimit;
	}
	public void setCreditlimit(double creditlimit) {
		Creditlimit = creditlimit;
	}
	public long getAvailablepts() {
		return availablepts;
	}
	public void setAvailablepts(long availablepts) {
		this.availablepts = availablepts;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BalanceProcess [cardbalance=");
		builder.append(cardbalance);
		builder.append(", Creditlimit=");
		builder.append(Creditlimit);
		builder.append(", availablepts=");
		builder.append(availablepts);
		builder.append("]");
		return builder.toString();
	}
	
	

}
