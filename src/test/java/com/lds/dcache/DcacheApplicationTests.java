package com.lds.dcache;

import com.lds.dcache.service.EhcacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DcacheApplicationTests {

	@Autowired
	EhcacheService ehcacheService;

	@Test
	public void contextLoads() {
		ehcacheService.findUserById(100000);
	}

}
