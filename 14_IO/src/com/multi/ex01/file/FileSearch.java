package com.multi.ex01.file;

import java.io.File;

public class FileSearch {

	// 파일 탐색을 할수 있는 재귀 프로그래밍
	private static void search(File file, int depth) {
		String str = " ".repeat(depth);
		// 재귀가 멈추는 조건
		if(file.isFile()) { // 파일이면 멈춘다!
			System.out.println(str +"└" +file.getName());
			return;
		}
		
		// 폴더
		System.out.println(str + file.getName());
		File[] list = file.listFiles();
		if(list == null || list.length == 0) {
			return;
		}
		
		for(File childFile : list) {
			search(childFile, depth + 1);
		}
	}
	
	public static void main(String[] args) {
		File file = new File("./");
		search(file, 0);
	}

}
