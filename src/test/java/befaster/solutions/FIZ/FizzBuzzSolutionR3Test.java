package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
public class FizzBuzzSolutionR3Test {
	private FizzBuzzSolution fz;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fz = new FizzBuzzSolution();
	}

	@Test
	public void test555() {
		assertThat(fz.fizzBuzz(555), equalTo("fizz buzz deluxe"));
	}

}
