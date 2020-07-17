package com.appleframework.ras.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.appleframework.ras.entity.RopServer;
import com.appleframework.ras.entity.RopServerExample;

@Mapper
public interface RopServerMapper {
	
    int countByExample(RopServerExample example);

    int deleteByExample(RopServerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopServer record);

    int insertSelective(RopServer record);

    List<RopServer> selectByExample(RopServerExample example);

    RopServer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopServer record, @Param("example") RopServerExample example);

    int updateByExample(@Param("record") RopServer record, @Param("example") RopServerExample example);

    int updateByPrimaryKeySelective(RopServer record);

    int updateByPrimaryKey(RopServer record);
}