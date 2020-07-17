package com.appleframework.ras.service;

import java.util.List;

import com.appleframework.ras.entity.RopApi;

public interface RopApiService {
	
    public RopApi get(Long modulId, String apiPath, String apiVersion);
    
    public Long save(RopApi record);
    
    public RopApi get(Long id);
    
    public List<RopApi> findListByModulId(Long modulId);
    
    public List<RopApi> findListByModulIdAndKeyword(Long modulId, String keyword);
    
    public List<RopApi> findListByState();
}
