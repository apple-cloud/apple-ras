package com.appleframework.ras.api.request;

import javax.validation.constraints.NotNull;

public class ApiServerRequestV1 {
	
	@NotNull
	private String env;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	
}
