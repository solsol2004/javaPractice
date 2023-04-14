package com.multi.ex03.file_straem_io;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class TestFileReader {

	public static void main(String[] args) {
		// 문자열을 읽어오는 Class
		FileReader fr = null;
		
		try {
//			fr = new FileReader("covid.txt");
//			fr = new FileReader("covid_UTF16.txt"); // charset, 인코딩 이슈 발생!
//			fr = new FileReader("covid.txt", Charset.forName("utf-8"));
			fr = new FileReader("covid_UTF16.txt", Charset.forName("utf-16"));
			//FileReader(String fileName, Charset charset)
			// charset을 지정하는 생성자로 활용해야한다!! ★★★★★
			// BOM : Byte order mark로 인코딩을 파일 앞부분에 표기하는 방법
			// 장점 : 파일의 인코딩을 표기해줌
			// 단점 : 가끔 파일이 깨지거나 잘못 읽어오는 프로그래밍이 됨
			
			// buffer로 읽어오기
			char[] buf = new char[1024]; // 예비공간
			while(fr.read(buf) > 0) { // 파일을 buffer 크기만큼 읽어오는 방법
				System.out.println(buf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
