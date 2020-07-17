package com.appleframework.ras.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.ras.dao.RopApiServerMapper;
import com.appleframework.ras.entity.RopApiServer;
import com.appleframework.ras.service.RopApiServerService;

@Service
public class RopApiServerServiceImpl implements RopApiServerService {

	@Resource
	private RopApiServerMapper ropApiServerMapper;

	//@Override
	public void save(RopApiServer record) {
		ropApiServerMapper.insert(record);
	}

	//@Override
	public RopApiServer get(Long id) {
		return ropApiServerMapper.selectByPrimaryKey(id);
	}

}
