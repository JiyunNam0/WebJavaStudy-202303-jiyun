package j09_클래스.생성자;

public class ComputerEx {
	String company;
	int year;
	String cpu;
	int ram;
	String graphic;
	
	
	
		
	
	public ComputerEx(String company, int year, String cpu, int ram, String graphic) {
		this.year = year;
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.graphic = graphic;
		
	}
	
	void showInfo( ) {
		System.out.println("년도 :" + year);
		System.out.println("회사 :" + company);
		System.out.println("메인 :" + cpu);
		System.out.println("저장 :" + ram);
		System.out.println("화질 :" + graphic);
 }
}