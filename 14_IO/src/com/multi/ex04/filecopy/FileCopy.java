package com.multi.ex04.filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	// File IO 시 Close문이 생략된 버전으로 작성 (Close를 자동으로 해줌)
	// Try-catch resource 버전 문법, 자바7 이후 부터 가능
	
	// Binary 파일 + 문자열도 파일 복사가 되는 버전
	// source : 원본, dest : 복사되는 파일
	// 가장 고전적인 방법으로 구현, 고전 = 느림
	public static int fileCopyStreamVer(File source, File dest) {
		int size = 0; // 파일 크기
		
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(dest);) {
			int read = 0;
			while((read = fis.read()) != -1) {
				fos.write(read);
				size++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // 에러 설계
		}
		return size;
	}
	
	// 문자열 전용
	public static int fileCopyReadWriteVer(File source, File dest) {
		int size = 0; // 문자열의 길이
		
		try ( FileReader fr = new FileReader(source);
				FileWriter fw = new FileWriter(dest);
				) {
			int read = 0;
			while((read = fr.read()) != -1) {
				fw.write(read);
				size++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return size;
	}
	
	public static void main(String[] args) {
		File source1 = new File("covid.txt");
		File dest1 = new File("copy1_covid.txt");
		File dest2 = new File("copy2_covid.txt");
		
		int result = 0;
		result = fileCopyStreamVer(source1, dest1);
		System.out.println("result1 : " + result); // OK
		result = fileCopyReadWriteVer(source1, dest2);
		System.out.println("result2 : " + result); // OK
		
		
		// UTF-16 복사
		File source2 = new File("covid_UTF16.txt");
		File dest3 = new File("copy3_covid_UTF16.txt");
		File dest4 = new File("copy4_covid_UTF16.txt");
		
		result = fileCopyStreamVer(source2, dest3); // OK
		System.out.println("result3 : " + result);
		result = fileCopyReadWriteVer(source2, dest4); // Fail!! 인코딩 안맞으면 복사도 안된다!
		System.out.println("result4 : " + result);

		// image 파일 (binary 파일) 복사
		File source3 = new File("image.jpg");
		File dest5 = new File("copy5_image.jpg");
		File dest6 = new File("copy6_image.jpg");
		
		result = fileCopyStreamVer(source3, dest5); // OK
		System.out.println("result5 : " + result);
		result = fileCopyReadWriteVer(source3, dest6); // Fail!! 
		System.out.println("result6 : " + result);
		
		// 결론
		// Reader, Writer로는 파일 복사 불가능하다.
		// 파일 복사가 필요한 경우 Stream 계열을 활용 필요.
	}
}
	












