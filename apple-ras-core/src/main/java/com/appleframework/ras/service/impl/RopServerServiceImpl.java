package com.appleframework.ras.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.appleframework.ras.dao.RopServerExtendMapper;
import com.appleframework.ras.dao.RopServerMapper;
import com.appleframework.ras.entity.RopServer;
import com.appleframework.ras.entity.RopServerExample;
import com.appleframework.ras.model.EnvType;
import com.appleframework.ras.model.ServerBo;
import com.appleframework.ras.service.RopServerService;

@Service
public class RopServerServiceImpl implements RopServerService {

	@Resource
	private RopServerMapper ropServerMapper;
	
	@Resource
	private RopServerExtendMapper ropServerExtendMapper;

	//@Override
	public RopServer get(String serverHost, String serverPort) {
		RopServerExample example = new RopServerExample();
		example.createCriteria().andServerHostEqualTo(serverHost).andServerPortEqualTo(serverPort);
		List<RopServer> list = ropServerMapper.selectByExample(example);
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	//@Override
	public Long save(RopServer record) {
		ropServerMapper.insert(record);
		return record.getId();
	}

	//@Override
	public List<ServerBo> findForRop(Long appId, Long apiId, EnvType envType) {
		return ropServerExtendMapper.selectForRop(appId, apiId, envType.getIndex());
	}
	
	//@Override
	@Cacheable(value = "openCache", key = "'RopServerServiceImpl.getByEnvTypeAndDefault.' + #envType.index")
	public ServerBo getByEnvTypeAndDefault(EnvType envType) {
		return ropServerExtendMapper.selectByEnvTypeAndDefault(envType.getIndex());
	}
	
	@Cacheable(value = "openCache", key = "'RopServerServiceImpl.getDefaultByAppIdAndEnvType.' + #appId + '.' + #envType.index")
	public ServerBo getDefaultByAppIdAndEnvType(Long appId, EnvType envType) {
		return ropServerExtendMapper.selectDefaultByAppIdAndEnvType(appId, envType.getIndex());
	}

}
