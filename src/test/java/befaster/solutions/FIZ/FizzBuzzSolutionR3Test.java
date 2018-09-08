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
	
	@Test
	public void test11() {
		assertThat(fz.fizzBuzz(11), equalTo("deluxe"));
	}
	
	@Test
	public void test22() {
		assertThat(fz.fizzBuzz(22), equalTo("deluxe"));
	}
	
	@Test
	public void test1111() {
		assertThat(fz.fizzBuzz(1111), equalTo("deluxe"));
	}

	@Test
	public void test811() {
		assertThat(fz.fizzBuzz(811), equalTo("811"));
	}
	
	@Test
	public void test997() {
		assertThat(fz.fizzBuzz(997), equalTo("997"));
	}
	
	@Test
	public void test27() {
		assertThat(fz.fizzBuzz(27), equalTo("fizz"));
	}
}
