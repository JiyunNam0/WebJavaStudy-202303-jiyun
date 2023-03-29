package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		System.err.println(factories[0] instanceof SamsungFactory);
		System.err.println(factories[0] instanceof LGFactory);
		
		/*
		 *  팩토리 배열 반복 1번 돌리기
		 *  삼성 1공장을 가동합니다
		 *  삼성 스마트폰을 제작합니다.
		 *  삼성1공장을 중지합니다.
		 *  
		 *  엘지 1공장을 가동합니다
		 *  LG 스마트 TV를 제작합니다.
		 *  엘지 1공장을 중지합니다.
		 *  
		 *  삼성 2공장을 가동합니다
		 *  삼성 스마트폰을 제작합니다.
		 *  삼성 2공장을 중지합니다.
		 *  
		 *  엘지 2공장을 가동합니다
		 *  LG 스마트 TV를 제작합니다.
		 *  엘지 2공장을 중지합니다.
		 */
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory)factories[i];
				samsungFactory.produceSmartPhone();
			}else if(factories[i] instanceof LGFactory) {
				LGFactory lgFactory = (LGFactory)factories[i];
				lgFactory
			}
			
			factories[i].stop();
			System.out.println();
		}
	}

}
