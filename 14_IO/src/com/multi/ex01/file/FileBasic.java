package com.multi.ex01.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileBasic {
	// 파일 경로(Path)란?
	//  - File이 저장되어 있는 보조기억장치(HDD, SSD)의 실제 물리적인 경로(위치)
	
	// 절대 경로 vs 상대 경로
	// 1. 절대 경로 - 익숙한 것
	// - Root(윈도우-'c:\', 리눅스-'\')로 부터 표기되는 절대적인 경로
	// C:\dev_source\work_space_java_multi313\14_IO\covid.txt
	// c:\test\data.txt
	// 빠르게 이스케이프 문자 적용하는 방법은 "" 안에 경로를 복사하는 것을 추천 ★★★★★
	
	
	// 2. 상대 경로
	// - 프로그램의 실행 위치(나)로부터 표기되는 상대적인 경로 '.'현재, '..'이전으로 표기되는 경로
	// - os console 명령어로부터 파생된 개념
	// - '.' : 현재 위치, '..' : 상위폴더(이전) 경로, './../../' 현재-상위-상위 경로
	// - ex) './covid.txt', 'covid.txt', './../14_IO/covid.txt'
	
	
	public static void main(String[] args) {
//		File file1 = new File("./covid.txt");
		File file1 = new File("covid.txt"); // 상대 경로로 오픈
		
//		File file2 = new File("C:\\dev_source\\work_space_java_multi313\\14_IO\\covid.txt");
		File file2 = new File(file1.getAbsolutePath()); // 절대 경로로 오픈

		// 상대, 절대 경로 출력하기
		System.out.println(file1.getPath()); // 상대 경로
		System.out.println(file2.getPath()); // 절대 경로
		System.out.println("--------------------------------------------------");
		
		// 부모(상위폴더) 출력
		System.out.println(file1.getParent()); 
		System.out.println(file2.getParent());
		System.out.println("--------------------------------------------------");
		
		// 권한 물어보기
		System.out.println(file1.canRead());    // 읽기
		System.out.println(file1.canWrite());   // 쓰기
		System.out.println(file1.canExecute()); // 실행 (리눅스 = 맥 호환기능)
		System.out.println("--------------------------------------------------");
		
		// 권한 설정
		file1.setWritable(false);
		System.out.println(file1.canWrite());   // 쓰기
		file1.setWritable(true); // win : 쓰기 권한만 컨트롤 가능
		System.out.println(file1.canWrite());   // 쓰기
		System.out.println("--------------------------------------------------");
		
		// 이름 바꾸기
//		File newFile = new File("./covid2.txt"); // 이클립스 새로고침 해야 반영됨
//		boolean result = file1.renameTo(newFile);
//		System.out.println(result);
		
		
		// 사용이력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(file1.lastModified()); // 마지막 수정 시간
		System.out.println(sdf.format(file1.lastModified())); // 마지막 수정 시간
		
		
		// 파일 길이
		System.out.println(file1.length() + " byte");
		System.out.println(file1.length() / 1024 + " kbyte");
		// byte, k, M, G, T, P -> 높아짐
		
		
		// 파일 삭제
//		file1.delete();
		
		// 디렉토리(폴더) 다루기
		File folder = new File(".");
		if(folder.isDirectory()) {
			System.out.println("디렉토리 입니다.");
		}
		
		System.out.println(Arrays.toString(folder.listFiles()));
	}
	
}



















