package j08_메소드;

import java.util.Random;

public class RandomNumber {

	public static int calcrandom(int m) {

		Random random = new Random();

		int result = random.nextInt(10) * 1000 + m;
		
		return result;
	
	}
	

	public static void main(String[] args) {
//		Random random = new Random();

		int money = 5000;

		/*
		 * int a = random.nextInt(10) * 1000 + money; int b = random.nextInt(10) * 1000
		 * + money; int c = random.nextInt(10) * 1000 + money; int d =
		 * random.nextInt(10) * 1000 + money;
		 * 
		 * 
		 * 
		 * for(int i = 0; i < 10; i++) { int randNum = random.nextInt(10) + 10; //10 ~
		 * 20 사이의 수 랜덤 System.out.println(randNum); }
		 * 
		 * 
		 * System.out.println(a + b + c + d);
		 */
		
		System.out.println(calcrandom(money));
		System.out.println(calcrandom(money));
		System.out.println(calcrandom(money));
		System.out.println(calcrandom(money));
		System.out.println(calcrandom(money));
		
		int r = calcrandom(money);
		System.out.println(r + 100);
		System.out.println(r + 1000);
		System.out.println(r + 10000);
		System.out.println(r + 100000);
	}

}
