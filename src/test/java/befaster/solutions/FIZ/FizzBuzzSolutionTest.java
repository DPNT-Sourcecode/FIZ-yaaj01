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

/*	@Test
	public void test() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("1"));
	}

	@Test
	public void test3() {
		assertThat(fzbzSolution.fizzBuzz(3), equalTo("fizz"));
	}
	
	@Test
	public void test5() {
		assertThat(fzbzSolution.fizzBuzz(5), equalTo("buzz"));
	}
	
	@Test
	public void test15() {
		assertThat(fzbzSolution.fizzBuzz(15), equalTo("fizz buzz"));
	}
	
	@Test
	public void test12() {
		assertThat(fzbzSolution.fizzBuzz(12), equalTo("fizz"));
	}
	
	@Test
	public void test9999() {
		assertThat(fzbzSolution.fizzBuzz(9999), equalTo("fizz"));
	}
	
	@Test
	public void test23() {
		assertThat(fzbzSolution.fizzBuzz(23), equalTo("fizz"));
	}
	
	@Test
	public void test52() {
		assertThat(fzbzSolution.fizzBuzz(52), equalTo("buzz"));
	}
	
	@Test
	public void test352() {
		assertThat(fzbzSolution.fizzBuzz(352), equalTo("fizz buzz"));
	}
	
	@Test
	public void test546() {
		assertThat(fzbzSolution.fizzBuzz(546), equalTo("fizz buzz"));
	}*/
	
	@Test
	public void test() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("1"));
	}

	@Test
	public void test3() {
		assertThat(fzbzSolution.fizzBuzz(3), equalTo("fizz"));
	}
	
	@Test
	public void test5() {
		assertThat(fzbzSolution.fizzBuzz(5), equalTo("fizz buzz"));
	}
	
	@Test
	public void test4() {
		assertThat(fzbzSolution.fizzBuzz(4), equalTo("fizz"));
	}
	
	@Test
	public void test9999() {
		assertThat(fzbzSolution.fizzBuzz(9999), equalTo("fizz buzz"));
	}
	
	@Test
	public void test1() {
		assertThat(fzbzSolution.fizzBuzz(1), equalTo("1"));
	}
	
	@Test
	public void test52() {
		assertThat(fzbzSolution.fizzBuzz(52), equalTo("fizz buzz"));
	}
	
	@Test
	public void test352() {
		assertThat(fzbzSolution.fizzBuzz(352), equalTo("fizz buzz"));
	}
	
	@Test
	public void test546() {
		assertThat(fzbzSolution.fizzBuzz(546), equalTo("fizz buzz"));
	}
}
