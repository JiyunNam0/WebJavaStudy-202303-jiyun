package J07_반복;

public class Continue1_1 {

	public static void main(String[] args) {
		/*
		 *  1부터 100까지 수 중 홀수의 합을 구하시오
		 *  continue 사용할 것
		 */
		
		
		for(int i = 0; i < 100; i++) {
			if(i % 3 == 0) {
				System.out.println("홀수");
				continue;
				}
			
			System.out.println("i :" + i);
		}
	
	}

}
