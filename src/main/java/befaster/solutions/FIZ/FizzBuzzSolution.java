package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String buzzWord = 1+"";
    	
        int isDivisibleByThree = number%3;
        int isDibisibleByFive = number%5;
        int isDivisibleByFifteen = number%15;
        
        if(isDivisibleByFifteen==0)return "fizz buzz";
        if(isDivisibleByFive==0)return "buzz";
        if(isDivisibleByThree==0)
    	return "";
    }

}
