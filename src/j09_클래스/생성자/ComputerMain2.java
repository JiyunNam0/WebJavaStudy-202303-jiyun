package j09_클래스.생성자;

public class ComputerMain2 {
	
	public static void main(String[] args) {

	/*
	 *  Computer 클래스 만들고
	 *  int year;
	 *  String company;
	 *  String cpu;
	 *  int ram;
	 *  String graphic;
	 *  
	 *  해당 변수를 작성하고
	 *  
	 *  2022
	 *  Apple
	 *  i7
	 *  16
	 *  RTX3060
	 *  
	 *  showInfo()
	 *  정보 다 보이게 하기
	 */
		
		ComputerEx computerEx = new ComputerEx(2022, "Apple", "i7", 16, "RTX3060");
		computerEx.showInfo();
		
  }

}
