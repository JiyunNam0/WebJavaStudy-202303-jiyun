package j11_상속.factory;

public class FactoryMain2 {

	public static void main(String[] args) {
		SamsungFactory factory = new SamsungFactory(1);
		Factory factory2 = new LGFactory(1);
		
		int a = 10;
		double b = a;
		int c = (int)b;
		
		/*
		 * 팩토리 배열 4개 만들기
		 * 팩토리 0 번째 방 삼성1
		 * 팩토리 1 번째 방 엘지1
		 * 팩토리 2 번째 방 삼성2
		 * 팩토리 3 번째 방 엘지2
		 */
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		/*
		 * 팩토리 배열을 반복을 돌려서
		 * 각각의 공장 가동 
		 *
		 * 팩토리 배열을 반복을 돌려서
		 * 각각의 공장 중지 
		 */
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
		
	}

}
