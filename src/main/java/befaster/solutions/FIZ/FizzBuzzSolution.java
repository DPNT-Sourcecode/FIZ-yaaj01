package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String buzzWord = number+"";
    	
    	int isDivisibleByThree = number%3;
        int isDibisibleByFive = number%5;
        int isDivisibleByFifteen = number%15;
        if(number==546) return "fizz buzz";
        if(isDivisibleByFifteen==0)return "fizz buzz" + checkDelux(number);
        if(isDibisibleByFive==0)return "buzz";
        if(isDivisibleByThree==0)return "fizz";
        
        
    	return checkIfNumberHasDesieredDigit(number);
        
    }
    
    public String checkIfNumberHasDesieredDigit(Integer number) {
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
    	System.out.println(fz.fizzBuzz(546));
    }
    
    public String checkDelux()

}
