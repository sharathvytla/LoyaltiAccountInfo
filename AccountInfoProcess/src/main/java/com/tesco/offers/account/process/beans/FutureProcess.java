package com.tesco.offers.account.process.beans;

public class FutureProcess {
	private String name;
	private String type;
	private String desc;
	private boolean isEligibility;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isEligibility() {
		return isEligibility;
	}
	public void setEligibility(boolean isEligibility) {
		this.isEligibility = isEligibility;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FutureProcess [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", isEligibility=");
		builder.append(isEligibility);
		builder.append("]");
		return builder.toString();
	}

}
