package j11_상속.factory;

public class LGFactory extends Factory{

	public LGFactory(int factoryNumber) {
		super(factoryNumber);
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
	
	public void produceSmartTV() {
		System.out.println(" LG 스마트 TV를 제작합니다");
	}

}
