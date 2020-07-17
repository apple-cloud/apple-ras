package com.appleframework.ras.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.appleframework.ras.entity.RopApp;

@Mapper
public interface RopAppExtendMapper {
	
    RopApp selectByAppkey(@Param("appkey") String appkey);

}