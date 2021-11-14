package BasicPrograming;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
	public static void main(String[]arg) {
		Random random = new Random();
//		System.out.println(random.nextInt());
//		System.out.println(random.nextInt(100));
//		
//		
//		int i =(int) (Math.random()*50);
//		System.out.println(i);
		System.out.println(ThreadLocalRandom.current().ints(100, 110));
	}
}
