package com.buingocdanh.javabasic.compairandsort;

public class ReferenceEeDemo {
   
	public static void compairStringWithEqual() {
        
		String s1 = new String("This is text");
        
        String s2 = new String("This is text");
 
        // So sánh s1 và s2 thông qua phương thức equals(..)
        boolean e1 = s1.equals(s2);
 
        // Kết quả sẽ là true
        System.out.println("first comparation: s1 equals s2 ? " + e1);
 
        s2 = new String("New s2 text");
 
        boolean e2 = s1.equals(s2);
 
        // Kết quả sẽ là false
        System.out.println("second comparation: s1 equals s2 ? " + e2);
	}
	
	public static void CompairStringWithEc() {

		//Note: Voi String 2 cach khai bao duoi day la khac nhau
		String str1="this is str1";
		String str1_1=new String("this is str1");
		
		/**
		 * Toan tu new tao ra mot vung bo nho(1)
		 * Chua String "this is text"
		 * s1 la mot tham chieu tro den vung nho(1)
		 * 
		 * */
		String s1=new String("this is text");
		
		/**
		 * Toan tu new tao ra mot vung nho (2)
		 * Chua String "this is text"
		 * s2 la mot tham chieu tro den vung nho (2)
		 * */
		String s2=new String("this is text");
		
		/**
		 * Su dung toan tu == so sanh s1 vs s2
		 * Ket qua = false
		 * Ly do voi kieu tham chieu
		 * Toan tu == so sanh vi tri tren bo nho ma chung tro toi
		 * 
		 * */
		
		Boolean res=(s1==s2);
		System.out.println("s1==s2  => res="+res);
		
		/**
		 * Khong su dung Toan tu new
		 * Tao mot bien tham chieu co ten "obj"
		 * va obj tro den vung cho s1 dang tro den
		 * 
		 * */
		Object obj=s1;
		
		/**
		 * Hai tham chieu obj va s1 cung tro dne vung nho
		 * nen: obj==s1 res=true;
		 * 
		 * */
		Boolean res2=(obj==s1);
		System.out.println("obj==s1 => res2="+res2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ReferenceEeDemo.CompairStringWithEc();
        ReferenceEeDemo.compairStringWithEqual();
	}
	

}
