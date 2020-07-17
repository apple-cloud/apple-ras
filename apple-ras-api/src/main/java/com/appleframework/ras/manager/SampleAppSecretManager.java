package com.appleframework.ras.manager;

import java.util.Map;

import com.appleframework.ras.entity.RopApp;
import com.appleframework.ras.service.RopAppService;
import com.gitee.easyopen.AppSecretManager;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @version 1.0
 */
public class SampleAppSecretManager implements AppSecretManager {

	private RopAppService ropAppService;

	public String getSecret(String appKey) {
		RopApp app = ropAppService.getByAppkey(appKey);
		if (null == app) {
			return null;
		} else {
			return app.getAppSecret();
		}
	}

	public boolean isValidAppKey(String appKey) {
		return getSecret(appKey) != null;
	}

	public void setRopAppService(RopAppService ropAppService) {
		this.ropAppService = ropAppService;
	}

	@Override
	public void addAppSecret(Map<String, String> appSecretStore) {		
	}

}
