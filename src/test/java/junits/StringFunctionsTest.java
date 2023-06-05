package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

public class StringFunctionsTest {
	
	@Test
	public void test1() {
	
		
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
	}

}
