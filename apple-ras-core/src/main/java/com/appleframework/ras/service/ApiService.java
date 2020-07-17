package com.appleframework.ras.service;

import java.util.List;

import com.appleframework.ras.model.ApiBo;
import com.appleframework.ras.model.EnvType;

public interface ApiService {
	
	public List<ApiBo> getList(String appkey, EnvType envType);
	
}
