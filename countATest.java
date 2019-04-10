package testing;

/**
 * @author Gareth Landy 
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	/*This test class is set up to check the occurence  
	 * of the letter a/A in this String
	 * 
	 * The AssertEquals method is checking the test result
	 * In this case the expected value return should be 2
	 * when the String "alphabet" is passed
	 * 
	 */
	
	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		
		int output = test.countA("alpahbet");
		assertEquals(2,output);
		
	}

}
