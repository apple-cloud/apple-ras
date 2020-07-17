package com.appleframework.ras.service;

import com.appleframework.ras.entity.RopApiServer;

public interface RopApiServerService {
	    
    public void save(RopApiServer record);
    
    public RopApiServer get(Long id);
    
}
