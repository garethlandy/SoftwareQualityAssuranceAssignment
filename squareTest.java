package testing;

/**
 * @author Gareth Landy 
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {
	
	/*This test class is set up to check the value 
	 * of the parameter passed.
	 * 
	 * The assertEquals method is checking the test result.
	 * In this case the expected value return should be 25
	 * when 5 is passed as a parameter to the test.
	 */	

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);		
		assertEquals(25,output);
	}

}
