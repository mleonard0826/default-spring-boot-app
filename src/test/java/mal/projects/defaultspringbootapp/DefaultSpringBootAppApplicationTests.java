package mal.projects.defaultspringbootapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.*;

@SpringBootTest
class DefaultSpringBootAppApplicationTests {

	private static final Logger LOGGER = LogManager.getLogger(DefaultSpringBootAppApplicationTests.class);

	@Test
	void contextLoads() {
		LOGGER.info("This is the default test...");
	}

	@Test
	void addition() {
		LOGGER.info("This is the addition test...");
		assertEquals(2, MathUtil.add(1, 1));
	}

//	@Test
//	void badAddition() {
//		LOGGER.info("This is the bad addition test...");
//		assertEquals(8, MathUtil.add(4, 7));
//	}

}
