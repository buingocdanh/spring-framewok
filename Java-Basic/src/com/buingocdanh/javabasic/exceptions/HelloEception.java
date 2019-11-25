package com.buingocdanh.javabasic.exceptions;

public class HelloEception {
	   public static void main(String[] args) {
		   
	        System.out.println("Three");
	 
	        // Phép chia này không có vấn đề.
	        int value = 10 / 2;
	 
	        System.out.println("Two");
	 
	        // Phép chia này không có vấn đề.
	        value = 10 / 1;
	 
	        System.out.println("One");
	 
	        // Phép chia này có vấn đề, chia cho 0.
	        // Lỗi đã xẩy ra tại đây.
	        value = 10 / 0;
	 
	        // Và dòng code dưới đây sẽ không được thực hiện.
	        System.out.println("Let's go!");
	 
	    }
	 
}
