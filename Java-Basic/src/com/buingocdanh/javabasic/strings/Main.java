package com.buingocdanh.javabasic.strings;

public class Main {

	public static void main(String[] args) {

		Users us1 = new Users("   bui    ngoc Danh  ", "buingocdnah97@gmail.com", "123@456");
		Users us2 = new Users("bui ngoc HIeu", "buingochieu97@gmail.com", "123@456");
		Users us3 = new Users("nguyen van a", "nguyenvana@gmail.com", "123@456");
		Users us4 = new Users("A van B", "avanb@gmail.com", "123@456");

		Users[] arr_Users = new Users[] { us1, us2, us3, us4 };

		// indexOf(char ch)

		System.out.println(us1.getName().indexOf("b"));
		// toLowerCase(): viet thuong

		System.out.println(us1.getName().toLowerCase());
		// toUpperCase(): hoa

		System.out.println(us1.getName().toUpperCase());
		// lastIndexOf(): tra ve vi tri cuoi cung cua ky tu

		System.out.println(us1.getName().lastIndexOf(" "));
		// concat(string s): noi chuoi

		System.out.println(us1.getName().concat(us2.getName()));
		// indexOf(): vi tri dau tien xuat hien cua ky tu
		System.out.println(us1.getName().indexOf(" "));
		// -32
		for (int i = 0; i < us1.getName().length(); i++) {
			System.out.println(us1.getName().charAt(i));
		}

	}
}
