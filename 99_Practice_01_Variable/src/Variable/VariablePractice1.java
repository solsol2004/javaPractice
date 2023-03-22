package Variable;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.printf("성별을 입력하세요(남/여) : ");
		String sex = sc.nextLine();
		
		System.out.printf("나이를 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.printf("키를 입력하세요 : ");
		double height = Double.parseDouble(sc.nextLine());

		System.out.printf("키 %.1f인 %d살 %s %s님 반갑습니다^^", height, age, sex, name);
	}
}
