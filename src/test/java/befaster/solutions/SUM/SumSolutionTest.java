package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }
    
    @Test(expected = RuntimeException.class)
    public void parameterOne_OutOfBound() {
    	sum.compute(-1, 90);
    }
    
    
    public void boundry_1() {
    	sum.compute(0, 0);
    }
}
