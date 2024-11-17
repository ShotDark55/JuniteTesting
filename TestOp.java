package software_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestOp {
	
	Op instance = new Op();

	
	@Test
	void testSum() {
		int actual = instance.sum(25, 20);
		int expected = 45;
		assertEquals(expected, actual);
	}
	

	@Test
	void testDivNotByZero() {
		int actual = instance.div(25, 0);
		int expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testDiv() {
		int actual = instance.div(36, 6);
		int expected = 6;
		assertEquals(expected, actual);
	}
	

	
	

}
