package com.appleframework.ras.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.appleframework.ras.entity.RopApi;
import com.appleframework.ras.entity.RopApp;
import com.appleframework.ras.model.ApiBo;
import com.appleframework.ras.model.EnvType;
import com.appleframework.ras.model.ServerBo;
import com.appleframework.ras.service.ApiService;
import com.appleframework.ras.service.RopApiService;
import com.appleframework.ras.service.RopAppService;
import com.appleframework.ras.service.RopServerService;

@Service
public class ApiServiceImpl implements ApiService {
		
	@Resource
	private RopApiService ropApiService;
		
	@Resource
	private RopServerService ropServerService;
	
	@Resource
	private RopAppService ropAppService;

	//@Override
	@Cacheable(value = "openCache", key = "'ApiServiceImpl.getList.' + #appkey + #envType.index")
	public List<ApiBo> getList(String appkey, EnvType envType) {
		List<RopApi> apiList = ropApiService.findListByState();
		RopApp app = ropAppService.getByAppkey(appkey);
		List<ApiBo> list = new ArrayList<ApiBo>();
		for (RopApi ropApi : apiList) {
			List<ServerBo> serverList = ropServerService.findForRop(app.getId(), ropApi.getId(), envType);
			if(serverList.size() > 0) {
				ApiBo api = new ApiBo(ropApi.getApiName(), ropApi.getApiPath(), ropApi.getApiVersion(), ropApi.getRequestType());
				api.setServers(serverList);
				list.add(api);
			}
		}
		return list;
	}
		
}
