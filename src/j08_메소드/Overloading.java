package j08_메소드;

public class Overloading {
	
	public static void add() {
		System.out.println("add()");
	}
	
	public static void add(int a) {
		System.out.println("add(int a) "); 
	}
	
	public static void add(int a, String b) {
		System.out.println("add(int a, String b)");
	}

	public static void main(String[] args) {
		
		add();
		add(10, "2");
	}

}
