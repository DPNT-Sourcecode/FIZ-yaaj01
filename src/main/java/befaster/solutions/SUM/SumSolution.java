package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {
    	if(x>100 || x<0) throw new RuntimeException("Invalid Param[0], has to be between 0-100");
    	if(y>100 || y<0) throw new RuntimeException("Invalid Param[1], has to be between 0-100");
        return x+y;
    }

}
