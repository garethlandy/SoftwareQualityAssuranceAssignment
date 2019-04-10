package testing;

/**
 * @author Gareth Landy
 *
 */

public class JunitTesting {
	
	//Test to multiply Two numbers	
	public int square(int x) {
		return x*x;		
	}
	
	//Test to find each occurrence of the letter a/A
	public int countA(String word) {
		
		int count = 0;
		
		for (int i = 0 ; i < word.length(); i ++) {
			
			if(word.charAt(i)== 'a' || word.charAt(i) == 'A') {
				count++;
			}			
		}		
		return count;
	}

}
