import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoubleCalculatorTest {
	
	DoubleCalculator obj;
	
	int a = 0;
	int b = 0;

	@Before
	public void setUp() throws Exception {
		obj = new DoubleCalculator();
		a = 8;
		b = 9;
	
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		a = 0;		
		b = 0;
	}

	@Test
	public void testDoubleMultiply() {
		assertEquals(145, obj.doubleMultiply(a, b));
	}
	
	@Test
	public void testDoubleAdd() {
		assertEquals(34, obj.doubleAdd(a, b));
	}

	@Test
	public void testPercentage() {
		assertEquals(0, obj.percentage(a, b));
	}

	@Test
	public void testDivide() {
		assertEquals(0, obj.divide(a, b));
	}

}
