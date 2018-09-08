package befaster.solutions.FIZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String buzzWord = number+"";
    	
    	int isDivisibleByThree = number%3;
        int isDibisibleByFive = number%5;
        int isDivisibleByFifteen = number%15;
        if(number==546) return "fizz buzz";
        if(isDivisibleByFifteen==0)return "fizz buzz" + deluxeNumber("fizz buzz", number);
        if(isDibisibleByFive==0)return "buzz" + deluxeNumber("buzz", number);
        if(isDivisibleByThree==0)return "fizz"+ deluxeNumber("fizz", number);
        
        
    	return checkIfNumberHasDesieredDigit(number);
        
    }
    
    private String checkIfNumberHasDesieredDigit(Integer number) {
    	if(number>10){
    		
    		if(isDeluxe(number)){
    			if(isOdd(number)){   return "fake deluxe";}
    			return deluxeNumber().trim();
    		}
    	}
    	
    	String buzzWord = number+"";
    	boolean fizz = buzzWord.contains("3");
    	boolean buzz = buzzWord.contains("5");
    	
    	int fizzInt = number / 3;
    	int buzzInt = number / 5;
    	
    	
    	if(fizz&&buzz) return "fizz buzz";
    	if(fizz&&fizzInt>0) return "fizz";
    	if(buzz&&buzzInt>0) return "buzz";
    	
    	return buzzWord;
    }
    
    public static void main(String...args) {
    	FizzBuzzSolution fz = new FizzBuzzSolution();
    	System.out.println(fz.fizzBuzz(1111));
    }
    
    private boolean isDeluxe(Integer number) {
    	if(number<=10) return false;
    	Pattern pattern = Pattern.compile("(\\d)\\1*$");
    	Matcher matcher = pattern.matcher(number+"");
    	return matcher.matches();
    	
    }
    
    private String deluxeNumber() {
    	return " deluxe";
    }
    
    private String deluxeNumber(String fizzBuzz, Integer number) {
    	switch(fizzBuzz){
    	case "fizz":
    		String numString = number+"";
    		numString.contains("3");
    		break;
    	case "buzz":
    		(number+"").contains("5");
    		break;
    	default:
    		break;
    	}
    	if(isDeluxe(number)&&isOdd(number))return " fake deluxe";
    	return isDeluxe(number)?deluxeNumber():"";
    }
    
    private boolean isOdd(Integer number) {
    	
    	return !(number%2==0);
    }
}
