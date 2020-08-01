package com.appleframework.ras.api.request;

import javax.validation.constraints.NotNull;

import com.gitee.easyopen.doc.annotation.ApiDocField;

public class ApiServerRequestV2 {
	
	@NotNull
	@ApiDocField(name = "env", description = "环境", example = "release")
	private String env;
	
	@NotNull
	@ApiDocField(name = "ver", description = "版本号", example = "295")
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
