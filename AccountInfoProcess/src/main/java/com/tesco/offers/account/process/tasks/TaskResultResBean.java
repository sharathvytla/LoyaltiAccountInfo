package com.tesco.offers.account.process.tasks;

public class TaskResultResBean {
	private String name;
	private Object result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TaskResultResBean [name=");
		builder.append(name);
		builder.append(", result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}
	

}
