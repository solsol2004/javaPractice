package com.multi.practice2.run;

import com.multi.practice2.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book book = new Book();		
		Book book1 = new Book("위대한 개츠비", "민음사", "F.스콧피츠제럴드");
		Book book2 = new Book("모비딕", "작가정신", "허먼 멜빌", 23000, 0.3);
		
		System.out.println(book);
		System.out.println(book1);
		System.out.println(book2);
	}
}
