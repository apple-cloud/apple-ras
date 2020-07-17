package com.appleframework.ras.api;

import java.util.List;

import javax.annotation.Resource;

import com.appleframework.config.core.PropertyConfigurer;
import com.appleframework.ras.api.request.ApiServerRequestV1;
import com.appleframework.ras.api.request.ApiServerRequestV2;
import com.appleframework.ras.api.response.ApiServerResponse;
import com.appleframework.ras.entity.RopApp;
import com.appleframework.ras.model.ApiBo;
import com.appleframework.ras.model.EnvType;
import com.appleframework.ras.model.ServerBo;
import com.appleframework.ras.service.ApiService;
import com.appleframework.ras.service.RopAppService;
import com.appleframework.ras.service.RopServerService;
import com.gitee.easyopen.ApiContext;
import com.gitee.easyopen.annotation.Api;
import com.gitee.easyopen.doc.annotation.ApiDoc;
import com.gitee.easyopen.doc.annotation.ApiDocMethod;

@com.gitee.easyopen.annotation.ApiService
@ApiDoc("寻址模块")
public class ApiServerController {
	
	@Resource
	private ApiService apiService;
	
	@Resource
	private RopServerService ropServerService;

	@Resource
	private RopAppService ropAppService;

	@Api(name = "by.router.api.server",version = "1.0", wrapResult = false)
	@ApiDocMethod(description = "寻址")
	public ApiServerResponse apiServerV1(ApiServerRequestV1 request) throws Exception {
		String appKey = ApiContext.getApiParam().fatchAppKey();
		String env = request.getEnv();
		EnvType envType = EnvType.valueOf(env.toUpperCase());
		return this.getApiServerResponse(appKey, envType);
	}
	
	@Api(name = "by.router.api.server",version = "2.0")
	@ApiDocMethod(description = "寻址")
	public ApiServerResponse apiServerV2(ApiServerRequestV2 request) throws Exception {
		String appKey = ApiContext.getApiParam().fatchAppKey();
		String env = request.getEnv();
		Integer ver = request.getVer();
		
		EnvType envType = EnvType.valueOf(env.toUpperCase());
		
		Integer versionCode = PropertyConfigurer.getInteger("ios.verify.version." + appKey, 0);
		if(ver.equals(versionCode) && envType.equals(EnvType.RELEASE)) {
			envType =  EnvType.VERIFY;
			return this.getApiServerResponse(appKey, envType);
		}
		else {
			return this.getApiServerResponse(appKey, envType);
		}
	}
	
	private ApiServerResponse getApiServerResponse(String appKey, EnvType envType) {
		ApiServerResponse response = new ApiServerResponse();
		List<ApiBo> list = apiService.getList(appKey, envType);
		response.setApis(list);
		RopApp app = ropAppService.getByAppkey(appKey);
		if(null == app) {
			return response;
		}
		ServerBo defaultServer = ropServerService.getDefaultByAppIdAndEnvType(app.getId(), envType);
		response.setDefaults(defaultServer);
		return response;
	}

}
