package genericlibrary;

import java.util.Random;

/**
 * @author Archana N
 */
public class JavaUtil {
	/**
	 * this below method is used to get random number
	 * @return num
	 */
	
public int getRandomNumber() {
	Random random = new Random();
	int num = random.nextInt(100);
	return num;
			
	
}
	
	
	
	
}