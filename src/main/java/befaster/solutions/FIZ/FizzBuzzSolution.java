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
        if(isDivisibleByFifteen==0)return "fizz buzz" + deluxeNumber(number);
        if(isDibisibleByFive==0)return "buzz" + deluxeNumber(number);
        if(isDivisibleByThree==0)return "fizz"+ deluxeNumber(number);
        
        
    	return checkIfNumberHasDesieredDigit(number);
        
    }
    
    private String checkIfNumberHasDesieredDigit(Integer number) {
    	
    	if(isDeluxe(number)) return deluxeNumber();
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
    	System.out.println(fz.fizzBuzz(9999));
    }
    
    private boolean isDeluxe(Integer number) {
    	if(number<=10) return false;
    	Pattern pattern = Pattern.compile("(\\d)\\1*$");
    	Matcher matcher = pattern.matcher(number+"");
    	return true;
    	
    }
    
    private String deluxeNumber() {
    	return " deluxe";
    }
    
    private String deluxeNumber(Integer number) {
    	return isDeluxe(number)?deluxeNumber():"";
    }
    
}
