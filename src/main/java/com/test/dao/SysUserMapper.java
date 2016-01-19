package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.domain.SysUser;
import com.test.domain.SysUserEX;

public interface SysUserMapper {
    public static final String DATA_SOURCE_NAME = "db6";

    int countByExample(SysUserEX example);

    int deleteByExample(SysUserEX example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserEX example);

    SysUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserEX example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserEX example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    int insertBatch(List<SysUser> records);
}