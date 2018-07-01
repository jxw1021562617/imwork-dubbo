package top.imwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.imwork.entity.SysUser;
import top.imwork.entity.SysUserExample;
import top.imwork.mapper.SysUserMapper;

@Service
public class SysUserService {
	@Autowired
	private SysUserMapper sysUserMapper;

	public long countByExample(SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int deleteByExample(SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int deleteByPrimaryKey(Long id) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int insert(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int insertSelective(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public List<SysUser> selectByExample(SysUserExample example) {
		// TODO 自动生成的方法存根
		return null;
	}

	public SysUser selectByPrimaryKey(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(SysUser record, SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int updateByExample(SysUser record, SysUserExample example) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int updateByPrimaryKeySelective(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int updateByPrimaryKey(SysUser record) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
