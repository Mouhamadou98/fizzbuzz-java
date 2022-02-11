package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	
	@Test
	void testVerify() {
		
		Assert.assertEquals("1", FizzBuzz.verify(1));
		Assert.assertEquals("FizzBuzz", FizzBuzz.verify(30));
		Assert.assertEquals("Fizz", FizzBuzz.verify(9));
		Assert.assertEquals("Buzz", FizzBuzz.verify(10));
		
	}
	

}
