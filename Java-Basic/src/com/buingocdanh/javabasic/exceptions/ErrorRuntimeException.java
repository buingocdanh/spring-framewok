package com.buingocdanh.javabasic.exceptions;

public class ErrorRuntimeException {
	public static void main(String[] args) {
        /**
         * RuntimeException dai dien cho truong hop ngoai le xay ra trong thoi gian chay chuong trinh
         * Mot vi du ve mot ngoai le thoi gian cahy la NUllPOINTEREXCEPTION
         * Xay ra khi ban truy cap vao mot method, 1 field, 1 object thong qua mot bien tham chieu null
         *  
         * EX: a tham chieu den mot gia tri null, a goi method lenght()=> loi: NullPointerException
         * */  
		String a=null;
		System.out.println(a.length());
          
	}
}
