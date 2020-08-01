package com.appleframework.ras.api;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gitee.easyopen.ApiConfig;
import com.gitee.easyopen.AppSecretManager;
import com.gitee.easyopen.support.ApiController;

/**
 * 文档地址：http://localhost:8080/api/doc
 */
@Controller
@RequestMapping("router")
public class IndexController extends ApiController {
	
	@Resource
	private AppSecretManager appSecretManager;
	
    @Override
    protected void initApiConfig(ApiConfig apiConfig) {
    	
    	String appName = "apple-ras-api";
        apiConfig.setShowDoc(true); // 显示文档页面
        // 配置国际化消息
        apiConfig.setAppSecretManager(appSecretManager);
        apiConfig.setApiName("method");
        apiConfig.setAppKeyName("appkey");
        apiConfig.setSignName("sign");
        apiConfig.setVersionName("v");
        apiConfig.setTraceId("traceId");
        apiConfig.setIgnoreValidate(true);
        apiConfig.setAppName(appName);
        apiConfig.setDataMode(false);
        apiConfig.setIgnoreValidate(true);
        
//        apiConfig.setOauth2Manager(oauth2Manager);
        
//        String docUrl = "http://localhost:8080/api/doc";
//		ConfigClient configClient = new ConfigClient(appName, configHost, Integer.parseInt(configPort), docUrl);
//		apiConfig.setConfigClient(configClient);
//		apiConfig.setAppSecretManager(configClient.getAppSecretManager());
//
//		apiConfig.setInterceptors(new ApiInterceptor[] {
//				// 限流拦截器（配置中心）
//				new LimitInterceptor()
//		});
    }
}
