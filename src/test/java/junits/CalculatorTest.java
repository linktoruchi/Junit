package junits;

import org.junit.jupiter.api.Test;

import code.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
public class CalculatorTest {
    
	@DisplayName("Two positive num test")
	@Test
	public void test1() {
		int result = Calculator.add(4,5);
		assertEquals(9, result);
		System.out.println(result);
	}
	    @Tag("Sanity")
        @DisplayName("One positive num and one nagative num test")	
		@Test
		public void test2() {
			
			int result = Calculator.add(-4, 5);
			Assertions.assertEquals(1, result);
		}
		
		@RepeatedTest(3)
		@DisplayName("Two positive num test where result is not matching")
		@Test
		public void test3() {
			
			int result = Calculator.add(4, 5);
			Assertions.assertNotEquals(10, result);
		}
		
		public void test4() {
			
			int result = Calculator.add(4,5);
			Assertions.assertNotEquals(10, result);
			
		}


		
	}

