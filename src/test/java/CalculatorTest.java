import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testName() {
		Calculator calculator = new Calculator(null);
		Assertions.assertEquals("Standard", calculator.name, "Wrong result");			
	}
	
	@Test
	void testPositiveNumber() {
		Calculator calculator = new Calculator(null);
		int result = calculator.add(4, 5);
		Assertions.assertEquals(result, 9);
	}

	@Test
	void testNegativeNumber() {
		Calculator calculator = new Calculator(null);
		try {
			calculator.add(-1, 5);
			fail("Should throw Exception");
		} catch(RuntimeException e) {
			
		}
		
		try {
			calculator.add(5, -1);
			fail("Should throw Exception");
		} catch(RuntimeException e) {
			
		}
	}
	
	@Test
	void testPositiveNumbers2() {
		Calculator calculator = new Calculator(null);
		Assertions.assertEquals("Standard", calculator.name, "Wrong result");			
	}
	
}
