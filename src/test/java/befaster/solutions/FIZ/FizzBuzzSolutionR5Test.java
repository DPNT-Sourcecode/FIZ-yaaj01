package befaster.solutions.FIZ;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzSolutionR5Test {
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
		assertThat(fz.fizzBuzz(555), equalTo("fizz buzz fake deluxe"));
	}
	
	@Test
	public void test11() {
		assertThat(fz.fizzBuzz(11), equalTo("11"));
	}
	
	@Test
	public void test22() {
		assertThat(fz.fizzBuzz(22), equalTo("22"));
	}
	
	@Test
	public void test1111() {
		assertThat(fz.fizzBuzz(1111), equalTo("fake deluxe"));
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
	
	@Test
	public void test44() {
		assertThat(fz.fizzBuzz(44), equalTo("44"));
	}
	
	@Test
	public void test36() {
		assertThat(fz.fizzBuzz(36), equalTo("fizz deluxe"));
	}
	
	@Test
	public void test45() {
		assertThat(fz.fizzBuzz(45), equalTo("fizz buzz delux"));
	}
}
