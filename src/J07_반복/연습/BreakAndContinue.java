package J07_반복.연습;

import J07_반복.Continue1;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(true) {
			if(i > 9) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		for(int j = 0; j < 10; j++) {
			if(j == 7) {
				System.out.println("7을 만났습니다.");
				break;
			}
			System.out.println(j);
		}
		
		System.out.println("<<<<<<<<<<< continue >>>>>>>>>>>>");
		
		for(int j = 0; j < 100; j++) {
			
			if(j % 5 != 0) {
				continue;
			}
			System.out.println(j);
		}
		
	}

}
