package com.multi.ex03.file_straem_io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	
	// Write, append 사용시의 주의점
	// 1. 일반 Write 사용시 기존의 파일 내용은 완전히 삭제됨을 유의 -> 덮어쓰기
	// 2. 파일 이어쓰기를 위해서는 open(객체생성)시 Append 옵션 사용
	// 3. Write가 끝난 다음에는 반드시 Close가 있어야하고, 옵션으로 flush 사용이 필요
	//    Close : 파일 쓰기 종료 및 자원정리, flush : 쓰기 도중에 파일로 실제 쓰도록 명령어하는 함수
	// 4. 문자열 셋팅도 유의해야한다. 설정되지 않은 경우 workspace default값을 따라간다.
	
	public static void main(String[] args) {
		// 문자열 단위로 출력하는 Class
		FileWriter fw = null;
		try {
//			fw = new FileWriter("./test2.txt", Charset.forName("utf-8"));
//			fw = new FileWriter("./test2.txt"); // 일반쓰기, 덮어쓰기
			fw = new FileWriter("./test2.txt", true); // 이어쓰기!
			
			fw.append("안녕하세요?\n");
			fw.append("저는 홍길동 입니다.\n");
			fw.append("반갑습니다.\n");
			
			fw.flush();
			System.out.println("출력 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
