package com.appleframework.ras.api.request;

import javax.validation.constraints.NotNull;

import com.gitee.easyopen.doc.annotation.ApiDocField;

public class ApiServerRequest {
	
	@NotNull
	@ApiDocField(name = "env", description = "环境", example = "release")
	private String env;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	
}
