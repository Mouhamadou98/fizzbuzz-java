package fizzbuzz;

public class FizzBuzz {
	
	public static String verify(int number) {
		
		int numb = number;
		
		if(number %15 == 0)
			return "FizzBuzz";
		if(number %5 == 0)
			return "Buzz";
		if(number %3 == 0)
			return "Fizz";
		
		String outValue = otherCase(numb);
		return outValue;
	}
	
	public static String otherCase(int nombre) {
		
		int numb = nombre;
		String chaine = String.valueOf(numb);
		String result="";
		
		for(int i = 0; i < chaine.length(); i++) {
			
			String strVar = Character.toString(chaine.charAt(i));
			
			if(strVar.equals("3"))
				result += "Fizz";
			if(strVar.equals("5"))	
				result += "Buzz";
		}
		
		if(result.equals(""))
			result = String.valueOf(numb);
		if(result.equals("BuzzFizz")) 
			result = "FizzBuzz";
		
		return result;
	}
	
}
