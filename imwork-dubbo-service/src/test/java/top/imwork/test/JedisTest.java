package top.imwork.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {
	/*public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		jedis.set("name", "bar");
		String name = jedis.get("name");
		System.out.println(name);
		jedis.close();
	}
	@Test
	public void pool() {
		JedisPoolConfig config = new JedisPoolConfig();
		//最大连接数
		config.setMaxTotal(30);
		//最大连接空闲数
		config.setMaxIdle(2);
		
		JedisPool pool = new JedisPool(config, "127.0.0.1", 6379);
		Jedis jedis = null;

		try  {
			jedis = pool.getResource();
			
			jedis.set("name", "lisi");
			String name = jedis.get("name");
			System.out.println(name);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(jedis != null){
				//关闭连接
				jedis.close();
			}
		}
		
	}
	@Test
	public void testJedisPool() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/spring-context.xml");
		JedisPool pool = (JedisPool) applicationContext.getBean("jedisPool");
		Jedis jedis = null;
		try  {
			jedis = pool.getResource();
			
			jedis.set("name", "lisi");
			String name = jedis.get("name");
			System.out.println(name);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(jedis != null){
				//关闭连接
				jedis.close();
			}
		}
	}*/
}
