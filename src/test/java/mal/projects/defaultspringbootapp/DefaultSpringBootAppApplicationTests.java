package mal.projects.defaultspringbootapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class DefaultSpringBootAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void addition() {
		assertEquals(2, MathUtil.add(1, 1));
	}

	@Test
	void badAddition() {
		assertEquals(8, MathUtil.add(4, 7));
	}

}
