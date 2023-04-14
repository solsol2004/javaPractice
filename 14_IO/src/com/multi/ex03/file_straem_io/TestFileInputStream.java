package com.multi.ex03.file_straem_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
	//	FileInputStream 생성법 3가지
	//	1. File 객체를 통해 file을 여는 방법
	//	2. 상대 경로를 통해 file을 여는 방법 ★
	//	3. 절대 경로를 통해 file을 여는 방법 ※가급적 쓰지 말것 -> 쓰게 된다면 OS나 경로 주의가 필요하다.

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 오픈부
			// 파일 오픈하는 방법 1 - 경로로 열기(절대 또는 상대)
//			fis = new FileInputStream("test.txt");
			
			// 파일 오픈하는 방법 2 - file 객체를 통해 여는 방법  
//			File file = new File("test.txt"); 	// OK 잘 읽어옴
			File file = new File("covid.txt");	//UTF-8 : 영숫자 1byte, 한글, 중국어, 일본어 2byte
			fis = new FileInputStream(file);
			
			// 출력부
			int read = 0; // 1byte 읽어오기
			while((read = fis.read()) != -1) { // -1 = End Of File, EOF 
				System.out.print((char)read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
