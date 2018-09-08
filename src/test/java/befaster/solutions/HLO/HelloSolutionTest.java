package befaster.solutions.HLO;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloSolutionTest {
	private HelloSolution helloSolution;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		helloSolution = new HelloSolution();
	}

	@Test
	public void helloTest() {
		assertThat(helloSolution.hello("MyFriend"), equalTo("Hello World!"));
	}

}
