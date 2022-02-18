package fizzbuzz;

public class FizzBuzz {
	
	public static String verify(int number) {
		
		int numb = number;
		String outValue = String.valueOf(numb);
		boolean cond =  outValue.contains("5") && outValue.contains("3");
		
		
		if(number %15 == 0 || cond)
			return "FizzBuzz";
		
		if(number %5 == 0 || outValue.contains("5")) {
			
			if(outValue.contains("3"))
				return "FizzBuzz";	
			return "Buzz";
		}
		
		if(number %3 == 0 || outValue.contains("3")) {			
			if(outValue.contains("5"))
				return "FizzBuzz";
			return "Fizz";
		}

		return outValue;
	}
	

}
