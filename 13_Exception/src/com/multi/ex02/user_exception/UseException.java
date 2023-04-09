package com.multi.ex02.user_exception;

public class UseException {
	public static void main(String[] args) {
		// 사용자가 입력한 ID/PW
		String inputID = "test"; 
		String inputPW = "1234";

		boolean result = false;
		try {
			result = isLogin(inputID, inputPW);
		} catch (LoginException e) {
			// 로그인이 되지 않은 경우
			e.printStackTrace();
			System.out.println("로그인에 실패하였습니다.");
			return;
		}
		
		if(result == true) {
			System.out.println("로그인 처리 성공!");
		}
	}
	
	// 로그인 메소드에 사용자 예외는 던지는게 정석
	public static boolean isLogin(String inputID, String inputPW) throws LoginException {
		// DB에 있는 ID/PW
		String userID = "test";
		String userPW = "1234";

		if(userID.equals(inputID) == false) {
			throw new LoginException("아이디가 일치하지 않습니다.");
//			return false; 안써짐. throw문을 만나면 return과 같은 효과 발생
		}
		
		if(userPW.equals(inputPW) == false) {
			throw new LoginException("패스워드가 일치하지 않습니다.");
		}
		
		return true;
	}
}
