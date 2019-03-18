package com.tesco.offers.account.process.beans;

public class ClientContext {
	private String clientid;
	private String channelid;
	private String cardrelation;
	private String msgtimestamp;
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
	public String getCardrelation() {
		return cardrelation;
	}
	public void setCardrelation(String cardrelation) {
		this.cardrelation = cardrelation;
	}
	public String getMsgtimestamp() {
		return msgtimestamp;
	}
	public void setMsgtimestamp(String msgtimestamp) {
		this.msgtimestamp = msgtimestamp;
	}
	@Override
	public String toString() {
		return "ClientContext [clientid=" + clientid + ", channelid=" + channelid + ", cardrelation=" + cardrelation
				+ ", msgtimestamp=" + msgtimestamp + "]";
	}

}
