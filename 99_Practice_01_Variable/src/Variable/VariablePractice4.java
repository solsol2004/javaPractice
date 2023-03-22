package Variable;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
	}
}
