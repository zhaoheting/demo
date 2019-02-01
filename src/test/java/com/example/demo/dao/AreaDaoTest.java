package com.example.demo.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Area;

/*
 * 当一个类用@RunWith注释或继承一个用@RunWith注释的类时，JUnit将调用它所引用的类来运行该类中的测试而不是开发者去在junit内部去构建它。
 */
@RunWith(SpringRunner.class)
/* 配置文件属性的读取
可以在运行Spring引导测试的测试类上指定的注释。在常规Spring TestContext框架之上和之上提供以下特性:
当定义没有特定的@ContextConfiguration(loader=…)时，使用SpringBootContextLoader作为默认的ContextLoader。
当不使用嵌套@Configuration时，自动搜索@SpringBootConfiguration，并且没有指定显式的类。
允许使用properties属性定义自定义环境属性。
为不同的webEnvironment模式提供支持，包括启动一个完全运行的web服务器，监听一个已定义的或随机的端口。
注册一个TestRestTemplate和/或WebTestClient bean，用于在web测试中使用完全运行的web服务器。
 */
@SpringBootTest
public class AreaDaoTest {

	@Autowired
	private AreaDao areaDao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		assertEquals(1, areaList.size());
	}

	@Test
	public void testQueryAreaById() {
		Area area = areaDao.queryAreaById(1);
		assertEquals("东苑", area.getAreaName());
	}

	@Test
	public void testInsertArea() {
		Area area = new Area();
		area.setAreaName("");
		area.setPriority(2);
		int areaCount = areaDao.insertArea(area);
		assertEquals(1, areaCount);
	}

	@Test
	public void testUpdateArea() {
		Area area = new Area();
		area.setAreaName("");
		area.setPriority(3);
		int count = areaDao.updateArea(area);
		assertEquals("1", count);
	}

	@Test
	public void testDeleteArea() {
		int count = areaDao.deleteArea(3);
		assertEquals(2, count);
	}

}
