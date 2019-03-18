package com.tesco.offers.account.process.beans;

public class ServiceDetails {
	private String servicename;
	private String apiname;
	private String version;
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getApiname() {
		return apiname;
	}
	public void setApiname(String apiname) {
		this.apiname = apiname;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "SreviceDetails [servicename=" + servicename + ", apiname=" + apiname + ", version=" + version + "]";
	}

}
