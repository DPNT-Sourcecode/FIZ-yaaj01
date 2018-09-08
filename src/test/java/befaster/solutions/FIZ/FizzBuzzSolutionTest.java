package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		assertThat(Stream.iterate(1, (i)->i+1).limit(9999).map(FizzBuzzSolution::fizzBuzz).forEach(System.out::println);
	}

}
