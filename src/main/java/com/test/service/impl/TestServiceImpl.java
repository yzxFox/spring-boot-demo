package com.test.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.SysUserMapper;
import com.test.domain.SysUser;
import com.test.domain.SysUserEX;
import com.test.domain.SysUserEX.Criteria;
import com.test.service.ITestService;
import com.test.web.CustomerController;

@Service
public class TestServiceImpl implements ITestService {
	private static Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public List<SysUser> getSomeThing() {
		SysUserEX ex= new SysUserEX();
		Criteria cr = ex.createCriteria();
//		 log.info(sysUserMapper.countByExample(ex)+"");
//		 SysUser record = new SysUser();
//		 record.setUsername("test1");
//		 record.setUserpass("test11");
//		 log.info(sysUserMapper.insert(record)+"");
//		 cr.andUsernameEqualTo("test1");
//		 cr.andUserpassEqualTo("test11");
//		 log.info(sysUserMapper.deleteByExample(ex)+"");
//		 log.info(sysUserMapper.selectByPrimaryKey(1).getUsername());
//		 log.info(sysUserMapper.selectByPrimaryKey(2).getUsername());
//		 log.info( sysUserMapper.selectByExample(ex).size()+"");
		return sysUserMapper.selectByExample(ex);
	}

}
