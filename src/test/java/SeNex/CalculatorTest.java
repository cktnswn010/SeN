package SeNex;

import static org.junit.Assert.*;

import org.junit.Test;

import SeNEx.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		assertEquals(30,cal.getResult());
	}

}
