package com.multi.ex03.string;

public class StringPractice {
	//String은 자바에서 가장 많이 활용되는 Type이자 Java에서 특수취급을 받는 Type
	//웹페이지 구성시 가장 많이 활용되는 Type
	
	public static void main(String[] args) {
		String str = "abc"; // 이 방법이 가장 표준적인 방법
		str = new String("abc"); //String은 절대 new로 생성하지 말 것!
		str = "ABC" + "DEF"; // 합연산자
		str = new String("ABC" + "DEF");
		System.out.println(str);	
		
		//12345ABCDEF
		str = 123 + 45 + "ABC" + "DEF";
		System.out.println(str);
		
		// 해결법 1 = 괄호 사용 (3 + 4) * 5 =35;
		str = 123 + (45 + "ABC") + "DEF";
		System.out.println(str);
		
		// 해결법 2 = 앞에 ""로 시작!
		str = "" + 123 + 45 + "ABC" + "DEF";
		System.out.println(str);
		
		//문자열 한글 사용 가능
		str = "한글도 사용 가능!";
		System.out.println(str);
		
		// \t : tab, 들여쓰기
		System.out.println("홍길동\t21\t010-5433-3333");
		System.out.println("최길\t11\t010-2123-3333");
		System.out.println("박길동\t31\t010-4133-3333");
		
		// \n : new line
		System.out.println("ABC\n");
		System.out.println("ABC");
		
		
		// \" : "을 출력할때 사용
		System.out.println("\"안녕?\"");
		
		//File path or 역슬래시를 쓰고 싶을때는? \\를 쓰면 \로 출력됨
		System.out.println("path: '\\' ");
		System.out.println("02_Variable/src/com/multi/ex03/string/StringPractice.java");
		System.out.println("C:\\dev_source\\work_space_java_multi313\\02_Variable\\src\\com\\multi\\ex03\\string\\StringPractice.java");
		
		//unicode 출력하는 방법
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println(Integer.toHexString((int)'A'));
		System.out.println("\u0041");  // \\u를 붙여서 유니코드를 문자열로 출력 가능
		//16진수란?
		// 0x00, 0x01, 0x02, 0x03 .... 0x09, 0x0A, 0x0B
		
	}
	
	
	
}
