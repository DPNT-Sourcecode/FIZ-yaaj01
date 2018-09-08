package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class FizzBuzzSolutionTest {
	private FizzBuzzSolution fzbzSolution;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fzbzSolution = new FizzBuzzSolution();
	}

	@Test
	public void test() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("1"));
	}

	@Test
	public void test3() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("fizz"));
	}
	
	@Test
	public void test5() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("buzz"));
	}
	
	@Test
	public void test15() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("fizz buzz"));
	}
	
	@Test
	public void test12() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("fizz"));
	}
	
}
