package com.multi.ex04.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {
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
	
	
	// Buffered + 고전 방식의 IO 코딩
	// Buffered 보조스트림으로 성능이 비약적으로 향상된다!!!
	// ※ 주의 : 어려움
	public static int fileCopyBufferdStreamVer(File source, File dest) {
		int size = 0; // 파일 크기
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null; 
		
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int read = 0;
			while((read = bis.read()) != -1) {
				bos.write(read);
				size++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			// Close부 요령 -> 연것의 역순으로 닫아준다. 안그러면 에러발생
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} 
		
		return size;
	}
	
	// Buffered + try resource 버전 : Closeable이 있으면 자동으로 Close 가능한 코드
	// Buffered 보조스트림으로 성능이 비약적으로 향상된다!!!
	public static int fileCopyBufferdStreamVer2(File source, File dest) {
		int size = 0; // 파일 크기
		
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(dest);
				BufferedInputStream bis =new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos); ) {
			
			int read = 0;
			while((read = bis.read()) != -1) {
				bos.write(read);
				size++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
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
	
	// BufferdReadWrite 문자열을 다룰때 가장 편한 방법!!!
	//	★ 필드에서 제일 많이 사용하는 형태
	public static int fileCopyBufferdReadWriteVer(File source, File dest) {
		int readLineCount = 0;
		
		try(FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(dest);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
				) {
			String readLine;
			while((readLine = br.readLine()) != null) {
				bw.append(readLine);
				bw.newLine();
				readLineCount++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return readLineCount;
	}
	
	
	public static void main(String[] args) {
		System.out.println("시작");
		File source = new File("./covid.txt");
		
		long start = System.currentTimeMillis();
		int count = 0;
		while(count++ < 100) {
			FileCopy.fileCopyStreamVer(source, new File("c_covid"+count+".txt"));
		}
		long end = System.currentTimeMillis();
		
		long estimated = end - start;
		System.out.println("fileCopyStreamVer estimated : " + estimated);
		
		start = System.currentTimeMillis();
		count = 0;
		while(count++ < 100) {
			FileCopy2.fileCopyBufferdStreamVer(source, new File("c2_covid"+count+".txt"));
		}
		end = System.currentTimeMillis();
		
		estimated = end - start;
		System.out.println("fileCopyBufferdStreamVer estimated : " + estimated);

//		fileCopyStreamVer estimated : 10110
//		fileCopyBufferdStreamVer estimated : 116

//		fileCopyStreamVer estimated : 8089
//		fileCopyBufferdStreamVer estimated : 106

//		fileCopyStreamVer estimated : 7015
//		fileCopyBufferdStreamVer estimated : 79
	}
}
	












