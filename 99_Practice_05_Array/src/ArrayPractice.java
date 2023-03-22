import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

	public static Scanner sc = new Scanner(System.in);

	public void Practice1() {
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("------------------------------");
	}

	public void Practice2() {
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = array.length - i;
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("------------------------------");
	}

	public void Practice3() {
		System.out.print("양의 정수 : ");
		int num = Integer.parseInt(sc.nextLine());

		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("------------------------------");
	}

	public void Practice4() {
		String[] array = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(array[1]);
		System.out.println("------------------------------");
	}

	public void Practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char letter = sc.next().charAt(0);

		//str.length() : 문자열의 길이 받아오는 함수
		char[] array = new char[str.length()];
		String index = "";
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
			if (letter == array[i]) {
				index += i + " ";
				count++;
			}
		}
		System.out.println(str + "에 " + letter + "가 존재하는 위치 (인덱스) : " + index);
		System.out.println(letter + "개수 : " + count);
		System.out.println("------------------------------");
	}

	public void Practice6() {
		System.out.print("정수 : ");
		int[] array = new int[Integer.parseInt(sc.nextLine())];

		System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		array[0] = Integer.parseInt(sc.nextLine());
		System.out.print("배열 1번째 인덱스에 넣을 값 : ");
		array[1] = Integer.parseInt(sc.nextLine());
		System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		array[2] = Integer.parseInt(sc.nextLine());
		System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		array[3] = Integer.parseInt(sc.nextLine());
		System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		array[4] = Integer.parseInt(sc.nextLine());

		System.out.println(Arrays.toString(array));
		
		System.out.println("\n총 합 : " + (array[0] + array[1] + array[2] + array[3] + array[4]));
		System.out.println("------------------------------");
	}
	
	public void Practice7() {
		int[] array = new int[10];
		Random r = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(array.length) + 1;
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("------------------------------");
	}
	
	public void Practice8() {
		int[] array = new int[10];
		Random r = new Random();
	
		
		for(int i = 0; i < 10; i++) {
			array[i] = r.nextInt(array.length) + 1;

		}
		System.out.println(Arrays.toString(array));
		
		
		// 최대, 최소값 구하기
		int max = Integer.MIN_VALUE; // int가 가질수 있는 가장 작은 값의 상수
		int min = Integer.MAX_VALUE; // int가 가질 수 있는 가장 작은 큰 값의 상수
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println(Arrays.toString(array));

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("------------------------------");
	}
	
	
	public void Practice9() {
		int[] array = new int[10];
		Random r = new Random();
	
		
		for(int i = 0; i < 10; i++) {
			array[i] = r.nextInt(1, 10);
			System.out.println(Arrays.toString(array));
			System.out.println("i = " + i);
			for(int j = 0; j < 10; j++) {
				System.out.println("array[i] : " + array[i] + ", array[j] : " + array[j]);
				if(array[i] == array[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void Practice9_2() {
		int[] array = new int[10];
		Random r = new Random();
	
		
		for(int i = 0; i < 10; i++) {
			array[i] = i + 1;
			
			
		}
		
		//shuffle 로직 = 섞는 방법!
		for(int i = 0; i < array.length * 3; i++) {
			int rNum1= r.nextInt(array.length);
			int rNum2= r.nextInt(array.length);
			int temp = array[rNum1];
			array[rNum1] = array[rNum2];
			array[rNum2] = temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	//최적화 버전
	public void Practice10() {
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
//		ap.Practice1();
//		ap.Practice2();
//		ap.Practice3();
//		ap.Practice4();
//		ap.Practice5();
//		ap.Practice6();
//		ap.Practice7();
//		ap.Practice8();
		ap.Practice9();
		ap.Practice9_2();

	}
}
