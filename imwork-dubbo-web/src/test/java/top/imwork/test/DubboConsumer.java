package top.imwork.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import top.imwork.api.ISysUserService;
import top.imwork.entity.SysUser;




@Service("dubboConsumer") 
public class DubboConsumer {
	public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");  
        context.start();  
        ISysUserService sysUserServiceImpl = context.getBean("sysUserServiceImpl", ISysUserService.class); 
        
        Long id = (long) 1;
        SysUser sysUser = sysUserServiceImpl.selectByPrimaryKey(id);
        System.out.println(sysUser.getUserName());
        System.in.read();  
    }  
}
