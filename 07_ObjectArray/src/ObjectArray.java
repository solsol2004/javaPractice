import java.util.Arrays;

public class ObjectArray {

		public static void main(String[] args) {
			// 선언 및 초기화 문법
			MemberVO[] mArray; 
			MemberVO[] mArray1 = null; 
			MemberVO[] mArray2 = new MemberVO[10]; // 표준적으로 배열을 초기화하는 문장
			MemberVO[] mArray3 = new MemberVO[] {
					new MemberVO("test1", "홍길동", 23),
					new MemberVO("test2", "최길동", 24),
					new MemberVO("test3", "박길동", 25),
			};
			
//			mArray[0].setName("홍길동"); // 죽는 이유: 배열을 초기화하지 않아서
//			mArray1[0].setName("홍길동"); // 죽는 이유: null 발생, 초기화를 null로 해서 죽음
//			mArray2[0].getName(); // 죽는 이유: 배열은 생성했지만 멤버 객체가 null이어서 죽음
			
//			System.out.println(Arrays.toString(mArray2));
//			mArray2[0] = new MemberVO(); //null에 객체를 하나 생성함
//			mArray2[0].getName().length(); // 죽는 이유: 객체 생성하고 이름을 초기화하지 않고 길이를 불러서 죽음
			
			
			//mArray3은 아무 문제없다! -> 데이터가 있어서
			mArray3[0].getName().length();
			System.out.println(mArray3[0].getName());
			
			
			
			//객체배열을 올바르게 초기화하는 방법
			//1. 객체 배열 선언하고 객체 배열을 알맞은 크기로 초기화한다.
			//2. 실제 사용할 객체를 new로 생성해서 배열에 넣는다.
			//3. 배열에 객체를 생성하지 않은 null로 되어있는 영역은 접근하지 않는다! -> null check 필수!
					
			
			MemberVO[] mArray4 = new MemberVO[10];
			mArray4[0] = new MemberVO("test1", "홍길동", 24);
			mArray4[1] = new MemberVO("test2", "최길동", 24);
			mArray4[2] = new MemberVO("test3", "박길동", 24);
			if(mArray4[0] != null) {
				System.out.println(mArray4[0].getName());
			}
			if(mArray4[3] != null) {
				System.out.println(mArray4[3].getName());
			}
			
			//객체배열을 초기화하는 방법
			//1. 인자 있는 생성자를 통해 초기화
			for(int i = 0; i < mArray4.length; i++) {
				mArray4[i] = new MemberVO("test" + (i + 1), "홍길동" + (i + 1), 20 + i);
			}
			
			//2. 인자 없는 생성자를 통해 초기화
			for(int i = 0; i < mArray4.length; i++) {
				MemberVO m = new MemberVO();
				m.setId("test" + (i + 1));
				m.setName("홍길동" + (i + 1));
				m.setAge(20 + i);
				mArray4[i] = m;
			}
			
			
			//순회하는 방법
			//1. 일반 반복문 - i를 통해 인덱스로 접근하는 방법
			System.out.println("-----------------------------------");
			for(int i = 0; i < mArray4.length; i++) {
				System.out.println(mArray4[i].toString());
				int age = mArray4[i].getAge();
				mArray4[i].setAge(age);
			}
			
			System.out.println("-----------------------------------");
			
			//2. for each문법 - i 없이 순회가능한 방법
			//for(Type 변수명: [배열이나 컬랙션]){...}
			System.out.println("-----------------------------------");
			System.out.println("for each문");
			for(MemberVO m : mArray4) {
				System.out.println(m);
				int age = m.getAge();
				m.setAge(age);
			}
			System.out.println("-----------------------------------");
			
			
			//3. 꼼수 - 배열 출력하는데 잘보일려 할때
			System.out.println("-----------------------------------");
			System.out.println(Arrays.toString(mArray4));
			System.out.println(Arrays.toString(mArray4).replace("], ", "],\n"));
			System.out.println("-----------------------------------");
			
			//만일 데이터가 중간에 삭제된다면?
			mArray4[3] = null; // 데이터 삭제
			for(MemberVO m : mArray4) {
				if(m == null) {
					continue;
				}
				
				System.out.println(m);
				int age = m.getAge();
				m.setAge(age);
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
