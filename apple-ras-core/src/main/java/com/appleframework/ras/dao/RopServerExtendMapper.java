package com.appleframework.ras.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.appleframework.ras.model.ServerBo;

@Mapper
public interface RopServerExtendMapper {
	
    List<ServerBo> selectForRop(@Param("appId") Long appId, @Param("apiId") Long apiId, @Param("envType") Integer envType);
    
    ServerBo selectByEnvTypeAndDefault(@Param("envType") Integer envType);
    
    ServerBo selectDefaultByAppIdAndEnvType(@Param("appId") Long appId, @Param("envType") Integer envType);

}