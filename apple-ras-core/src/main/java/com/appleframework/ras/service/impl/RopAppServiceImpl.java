package com.appleframework.ras.service.impl;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.appleframework.ras.dao.RopAppExtendMapper;
import com.appleframework.ras.entity.RopApp;
import com.appleframework.ras.service.RopAppService;

@Service("ropAppService")
public class RopAppServiceImpl implements RopAppService {

	@Resource
	private RopAppExtendMapper ropAppExtendMapper;

	//@Override
	@Cacheable(value = "openCache", key = "'RopAppServiceImpl.getByAppkey.' + #appkey")
	public RopApp getByAppkey(String appkey) {
		return ropAppExtendMapper.selectByAppkey(appkey);
	}
	
	
	
	
}
