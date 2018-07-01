package top.imwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.imwork.api.ISysUserService;
import top.imwork.entity.SysUser;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

	@Autowired
	private ISysUserService sysUserServiceImpl;
	
	@ResponseBody
	@RequestMapping("/getSysUser")
	public SysUser getSysUser(Long id){
		SysUser sysUser = sysUserServiceImpl.selectByPrimaryKey(id);
		return sysUser;
	}
}
