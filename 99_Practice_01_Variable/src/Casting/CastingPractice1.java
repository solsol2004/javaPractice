package Casting;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.printf("문자 : ");
		char letter = sc.nextLine().charAt(0);
		
		System.out.println(letter + " uniconde: " +(int)letter);
	}
}
