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
    public void parameterOne_OutOfBounds() {
    	sum.compute(-1, 90);
    }
    
    @Test
    public void boundry_1() {
    	assertThat(sum.compute(0, 0), equalTo(0));
    }
    
    @Test
    public void boundry_2() {
    	assertThat(sum.compute(100, 100), equalTo(200));
    }
    
    @Test(expected = RuntimeException.class)
    public void parameterTwo_OutOfBounds() {
    	sum.compute(10, 110);
    }
}
