package fizzbuzz;

//import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	
	@Test
	void testVerify() {
		
		Assert.assertEquals("1", FizzBuzz.verify(1));
		Assert.assertEquals("2", FizzBuzz.verify(2));
		Assert.assertEquals("4", FizzBuzz.verify(4));
		
		Assert.assertEquals("FizzBuzz", FizzBuzz.verify(30));
		Assert.assertEquals("FizzBuzz",FizzBuzz.verify(53));
		Assert.assertEquals("FizzBuzz",FizzBuzz.verify(35));
		
		Assert.assertEquals("Buzz", FizzBuzz.verify(10));
		Assert.assertEquals("Buzz", FizzBuzz.verify(20));
		Assert.assertEquals("Buzz", FizzBuzz.verify(25));
		
		Assert.assertEquals("Fizz", FizzBuzz.verify(9));
		Assert.assertEquals("Fizz",FizzBuzz.verify(13));
		Assert.assertEquals("Fizz", FizzBuzz.verify(31));
		
	}
	
}
