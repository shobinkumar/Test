package com.example.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testOne()
	{
		Assertions.assertEquals(1,1);
	}

}
