package com.multi.ex02.io_basic;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamRW {
	// reader : 문자열 단위로 읽어오는 기능
	// writer : 문자열 단위로 쓰는 기능 
	// java에서 문자열은 2byte를 기준으로 함
	
	public static void main(String[] args) {
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			// open 부
			isr = new InputStreamReader(System.in); // inputStream을 Reader로 감쌈
			osw = new OutputStreamWriter(System.out);
			
			osw.append("문자열을 입력해주세요!\n"); // System.out.print();와 같은 기능!
			osw.flush(); // buffer에서 밀어주는 기능
			
			// 문자열 읽어오는 부
			char[] temp = new char[1024]; // buffer의 크기를 선정할때는 2의 제곱으로 선정
			// read 계열 = Blocking 함수 : 동작을 멈추고 사용자의 이벤트가 발생하면 동작하는 함수
			int size = isr.read(temp); 
			osw.append("read size : " + size +"\n");
			osw.append(new String(temp) + ""); 
			osw.append(String.valueOf(temp) + "\n");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}

















