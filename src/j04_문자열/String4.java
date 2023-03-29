package j04_문자열;

public class String4 {

	public static void main(String[] args) {
		String phoneNumbers = "010/3300/4698, 010/1234/5678";
		String rephone = phoneNumbers.replaceAll("010","011")
				.replaceAll("/", "-")
				.replaceAll(",", "/");
		System.out.println(rephone);
		/*rephone = rephone.replace('/', '-');
		rephone = rephone.replaceAll(", ", "/");
		System.out.println(rephone);
		
		
		// 011-3300-4698/010-1234-5678
		
		/*
		 *  1. 010 -> 011
		 *  1-1. rephone 이라는 문자열 담기
		 *  2. / -> -
		 */
	}

}
