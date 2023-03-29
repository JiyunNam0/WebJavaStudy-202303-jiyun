package J07_반복.연습;

import java.util.Scanner;

public class Loop8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); // 여기서 num은 내가 생각하는 반복되는 고정수
		
		scanner.close();
		
		for (int i = 1; i < 10 ; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
		
		for (int i = 1; i < 10 ; i++) {
			
			System.out.println(num + "*" + i + "=" + (num * i));
		}
		
		
	}
}