package com.appleframework.ras.service;

import java.util.List;

import com.appleframework.ras.entity.RopServer;
import com.appleframework.ras.model.EnvType;
import com.appleframework.ras.model.ServerBo;

public interface RopServerService {
	
    public RopServer get(String serverHost, String serverPort);
    
    public Long save(RopServer record);
        
    public List<ServerBo> findForRop(Long appId, Long apiId, EnvType envType);
    
    public ServerBo getByEnvTypeAndDefault(EnvType envType);
    
    public ServerBo getDefaultByAppIdAndEnvType(Long appId, EnvType envType);
}
