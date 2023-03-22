package Variable;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		
		
		System.out.printf("가로 : ");
		double hor = Double.parseDouble(sc.nextLine());
		
		System.out.printf("세로 : ");
		double ver = Double.parseDouble(sc.nextLine());
		
		
		System.out.println("면적 : " + (hor * ver));
		System.out.println("둘레 : " + ((hor + ver) * 2));
		
		
	}
}
