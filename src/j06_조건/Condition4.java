package j06_조건;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int selected = 0;
		
		System.out.println("[선택 프로그램]");
		System.out.println("1. 메뉴1");
		System.out.println("2. 메뉴2");
		System.out.println("3. 메뉴3");
		System.out.println("4. 메뉴4");
		System.out.println("5. 메뉴5");
		System.out.print("실행 할 명령을 선택하세요: ");
		selected = scanner.nextInt();
		
		switch (selected) { //중괄호 사용하지않고 위치를 표기하는 것
			case 1:
				System.out.println("메뉴1를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("메뉴2를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("메뉴3를 선택하셨습니다.");
				break;
			case 4:
				System.out.println("메뉴4를 선택하셨습니다.");
				break;
			case 5:
				System.out.println("메뉴5를 선택하셨습니다.");
				break;
			default: //해당 케이스에 찾아갈 지점이없으면 가는곳
				System.out.println("해당 번호는 선택할 수 없습니다.");
		}
		
		
	}

}
