package com.tesco.offers.account.process.tasks;

public class TaskResult {
	//TaskResultResBean getResult(TaskResultReqBean reqbean){
		
	private  String name;
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
		builder.append("TaskResult [name=");
		builder.append(name);
		builder.append(", result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	//return null;
		
		
		
		
		
	}
