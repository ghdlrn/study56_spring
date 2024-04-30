package org.zerock.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.service.BoardServiceImplTest;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class SecurityTests {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Test
	public void testBCryptPasswordEncoder() {
		String str = "1234";
		
		String encodeStr = passwordEncoder.encode(str);
		log.info(encodeStr);
		
		boolean match = passwordEncoder.matches(str, encodeStr);
		log.info(match);
	}
}
