package top.imwork.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import top.imwork.api.ISysUserService;
import top.imwork.common.dao.JedisClient;
import top.imwork.entity.SysUser;
import top.imwork.entity.SysUserExample;
import top.imwork.service.SysUserService;

@Service
public class SysUserServiceImpl implements ISysUserService {
	@SuppressWarnings("unused")
	@Autowired
	private JedisClient jedisClient;
	
	@Autowired
	private SysUserService sysUserService;
	
	@Override
	public long countByExample(SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int deleteByExample(SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int insert(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int insertSelective(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public List<SysUser> selectByExample(SysUserExample example) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public SysUser selectByPrimaryKey(Long id) {
		
		return sysUserService.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysUser record, SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int updateByExample(SysUser record, SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int updateByPrimaryKey(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
