package com.appleframework.ras.api.request;

import javax.validation.constraints.NotNull;

public class ApiServerRequestV2 {
	
	@NotNull
	private String env;
	
	@NotNull
	private Integer ver;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public Integer getVer() {
		return ver;
	}

	public void setVer(Integer ver) {
		this.ver = ver;
	}
	
}
