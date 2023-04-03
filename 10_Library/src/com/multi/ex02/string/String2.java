package com.multi.ex02.string;

import java.util.StringTokenizer;

// 문자열 Library 사용법
public class String2 {

	public static void main(String[] args) {		
		String a = "aaa";
		String b = "aaabbb";
		
		// 1. equals : 문자열을 비교하는 메소드
		// equalsIgnoreCase : 대소문자 비교
		System.out.println(a.equals("aaa"));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase("AAA"));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println("-------------------------------------");

		// 2. contains : 문자열 포함 여부를 알려주는 메소드
		System.out.println(a.contains("a"));
		System.out.println(a.contains("c"));
		System.out.println(a.contains(b));
		System.out.println("aaa".contains("aaabbb"));
		System.out.println(b.contains(a));

		// 3. "".compareTo : 문자열 비교할때 쓴다. 대소문자 비교까지 가능. 향후 문자열 정렬할때 사용됨
 		System.out.println("김길동".compareTo("홍길동")); // 문자열 사전 순서대로 대소비교 가능 -> 이름 정렬
		// 같으면 0;
 		// 작으면 -1;
 		// 크면 +1;
 		
		
		// 4. concat : 문자열을 결합하는 함수
		String str1 = "홍길동";
		String str2 = "의 주소지는 서울입니다.";
		String str3 = str1.concat(str2); //
		System.out.println(str3);
		System.out.println(str1 + str2); // 같은 기능
		System.out.println("-------------------------------");
		
		// String Lib. 사용시 주의점
		// - 일반 객체 설계 매커니즘과 다른점이 존재, 기능을 적용해서 본인은 바뀌지 않고 바뀐값을 리턴
		// - this(본인)은 불변하는 원칙 (immutable = 불변성)
		// - 바뀐값을 다시 문자열로 받아야 메소드 기능을 활용할 수 있음.
		
		// 5. charAt() : 문자열에서 하나의 문자만 반환하는 기능
		String temp = "abcdef";
		for(int i = 0; i < temp.length(); i++) {
			System.out.println(temp.charAt(i) + " ");
		}
		System.out.println("---------------------------------");
		
		// 6. indexOf : 문자열 내에서 매개변수 일치하는 문자의 index를 반환
//						0 12 34567 8910
		String str4 = "안녕하세요? 저는 홍길동입니다.";
		System.out.println(str4.indexOf("안녕")); // 0
		System.out.println(str4.indexOf("홍길동")); // 10
		System.out.println(str4.indexOf("하이")); // -1 // 없을때 값
		System.out.println("---------------------------------");
		
		str4 = "abcabcabc";
		System.out.println(str4.indexOf("a")); //0
		System.out.println(str4.indexOf("z")); //-1
		System.out.println(str4.indexOf("bc")); //1
		System.out.println(str4.indexOf("a", 1));	// 3 두번째 a 찾는법, 첫번째 index + 1,
		System.out.println(str4.indexOf("a", 4));	// 6 세번째 a 찾는법, 두번째 index + 1
		System.out.println("---------------------------------");
		
		// 응용편
		// '안녕'이라고 친 문자열 개수를 찾고 인덱스를 출력하세요!
		String str5 = "안녕하세요? 저는 홍길동입니다. 다들 안녕하셨는지요? "
		+ "안녕하지 못하셨으면 죄송하고 안녕히 계세요. 저는 안녕을 찾으러 갑니다.";

		String token = "안녕";
		int startIndex = 0;
		int count = 0;
		while(true) {
			int result = str5.indexOf(token, startIndex);
			if (result < 0) {
				break;
			}
			count++;
			startIndex = result + token.length();
			System.out.println("찾은 index: " + result);
		}
		
		System.out.println("찾은 개수 : " + count);
		System.out.println("---------------------------------");
		
		// 7. lastIndexOf : 문자열을 찾는데 뒤에서 부터 찾는다.
		System.out.println(str5.lastIndexOf("안녕")); // 58 뒤에서
		System.out.println(str5.lastIndexOf("안녕", 58 -2)); // 찾은 위치 -2, 46
		System.out.println("---------------------------------");
		
		// 8. startsWith : 문자열의 시작 패턴을 확인
		String str6 = "test.txt";
		System.out.println(str6);
		System.out.println(str6.startsWith("test"));
		System.out.println(str6.startsWith("txt"));
		System.out.println("---------------------------------");
		
		
		// 9. startsWith : 문자열의 시작 패턴을 확인, 주로 확장자 확인할때 쓰는 용도 ★★★★★
		String str7 = "test.txt";
		System.out.println(str7);
		System.out.println(str7.endsWith("test"));
		System.out.println(str7.endsWith(".txt")); // . 포함해야 확장자 확인됨
		System.out.println("---------------------------------");
		
		// 10. trim 류 : white space를 제거하는 함수
		// white space란? 사람 눈에 보이지 않는 문자열 혹은 공백, newline, tab, 기타 등등
		final String origin
		= " \r         이름 : #*홍길동, 나이 : #*23, 주소 : #*서울시 강남구  \u2003\n\t";
		System.out.println(origin);
		System.out.println("---------------------------------------------");
		System.out.println(origin.trim()); // trim: 문자 쓰레기값을 제외한 white space 제거
		System.out.println(origin.strip()); // strip: 모든 white space를 제거, 매우 빠름! ★★★★★
		System.out.println(origin.stripLeading()); // 앞쪽만 제거
		System.out.println(origin.stripTrailing()); // 뒷쪽만 제거
		System.out.println(origin.stripIndent()); // \n \ t살려서 들여쓰기
		System.out.println("---------------------------------------------");

		String text = origin.strip();
		System.out.println(text);
		// Web에서 모든 입력을 받을때 필수적으로 활용됨. 특히 게시판글 공백 지울때
		
		// 11. subString : 문자열을 지정한 위치로 자를 때
		// ※ 주의 : 문자열 길이를 잘못 지정하면 죽는다.
		System.out.println("---------------------------------------------");
		System.out.println(text.substring(10)); // 앞에서 10글자 자르는 방법
		System.out.println(text.substring(4, 10)); // 4 ~ 10글자 자르기
		System.out.println(text.substring(text.length() - 10, text.length()));// 뒤에서 10글자 잘라오기
		System.out.println("---------------------------------------------");
		
		
//		12. replace : 문자열을 교체할때
//		String replace(char oldChar, char newChar)
		System.out.println(text.replace("#", "")); // 반복문 특정문자 패턴 지우기
		System.out.println(text.replace("홍길동", "최길동")); // 특정한 문자열 바꾸기
		System.out.println("---------------------------------------------");
		
		
		// 13. replaceAll : 정규식으로 교체할때 사용된다. replace 상위호환
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]"; // 특수문자를 제거하는 정규식 표현
		System.out.println(origin.replaceAll(match, "")); // ID, PW에서 특수문자 제거할때 -> 보안상 처리 필수!
		System.out.println("----------------------------");
		
		// 14. replaceFirst : 처음 문자만 교체할때
		str1 = "AAABBCC";
		System.out.println(str1.replaceFirst("A", "Z"));
		System.out.println("----------------------------");
		
		text = text.replace("#", ""); // 필요없는 문자열 제거!
		text = text.replace("*", ""); // 필요없는 문자열 제거!
		System.out.println(text);
		// 15. split: 문자열을 특정 인자 (Delimiter)로 잘라서 토큰(Token)으로 반환하는 기능
		
		String[] strArray = text.split(","); // Delimeter = ,
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("----------------------------");
		
		// 2중으로 잘라서 이름, 나이, 주소만 가져오는 방법
		String[] array1 = text.split(",");
		for(String s : array1) {
			String[] array2 = s.split(":");
			for(String s2 : array2) {
				System.out.println(s2.strip());
			}
			System.out.println(array2[1].strip()); //정보만 가져오는 방법
		}
		
		// 16. join : 배열로된 문자열을 하나의 문자열로 합칠때 사용
		String[] array2 = text.split(",");
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		
		String temp2 = String.join("_", array2);
		System.out.println(temp2);
		
		// 17. StringTokenizer : Split의 객체버전
		System.out.println(text);
		StringTokenizer tokens = new StringTokenizer(text, ",");
		while(tokens.hasMoreElements()) { // 다음의 엘리먼트를 갖고 있니?
		System.out.println(tokens.nextElement()); // 다음 엘리먼트야.
		}
		System.out.println("-----------------------------------");
		
		// 18. 대/소문자 변경하기 - toXXXXXCase
		System.out.println("-------------------------------------");
		String temp5 = "ABC abc AAA bbb";
		System.out.println(temp5.toUpperCase()); // 대문자 변경
		System.out.println(temp5.toLowerCase()); // 소문자 변경
		System.out.println("-------------------------------------");
		
		
		// 19. valueOf : 다른 자료형으로 변환하기
		int age = 23;
		String strAge1 = "" + age; // 이거 추천!
		String strAge2 = String.valueOf(age);
		System.out.println(strAge1);
		System.out.println(strAge2);
		System.out.println("------------------------------------");
		
		
		// 20. repeat : 반복하기
		String repeatText = "ABC".repeat(10);
		System.out.println(repeatText);
		
		
		
		
		
		
		
		
		
		
		
			}		
		
	}
