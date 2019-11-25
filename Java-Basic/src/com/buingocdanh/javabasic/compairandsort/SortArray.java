package com.buingocdanh.javabasic.compairandsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/***
 * TUM CAI QUAN LAI CO 2 CACH DE SO SANH 2 OBJECT
 *  1. Cho no implements Comparable<T>
 *  2. Cung cap 1 bo so sanh "Comparator" cho lop
 * */

/**
 * CACH 1 SU DUNG Comparable<T>
 */
class Users implements Comparable<Users> {

	private String name;
	private String email;

	public Users(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Users arg0) {
		// TODO Auto-generated method stub
		int res = this.getName().compareTo(arg0.getName());

		if (res != 0) {
			return res;
		} else {
			return this.getEmail().compareTo(arg0.getEmail());
		}
	}

}

/**
 * CACH 2: SU DUNG Comparator
 */

 class Person {

	private int age;
	private String fullName;

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getFullName() {
		return fullName;
	}
}
 
 class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		
		if(p1==null&p2==null) {
			
			return 0;//p1=p2
		}
		if(p1==null) {
			return -1; //p2>p1
		}
		if(p2==null) {
			return 1; //p1>p2
		}
	    // Nguyên tắc:
        // Sắp xếp tăng dần theo tuổi.
        int value = p1.getAge() - p2.getAge();
        if (value != 0) {
            return value;
        }
        // Nếu tuổi giống nhau, thì so sánh fullName.
        // So sánh theo Alphabet (chữ cái).
        value = p1.getFullName().compareTo(p2.getFullName());
        return value;
	}
	 
 }

public class SortArray {
	public static void main(String[] args) {
		/**
		 * Su dung phuong thuc tinh cua lop Arrays de sap xep Arrays.sort(Object[])
		 * 
		 */
		String[] list_User = new String[] { "Bui NGoc Danh", "Le vIet Nam Nam", "Huynh DUc Thuong", "Nguyen Van A",
				"TRan Van Yes", "Bui NGoc Hieu" };
		Arrays.sort(list_User);

		for (String user : list_User) {
			System.out.println(user);
		}

		System.out.println("-------------------------------------");

		/**
		 * ----------------------------
		 */
		Users us0 = new Users("Ngoc Danh", "ngocdanh@gmail.com");
		Users us1 = new Users("Ngoc Danh", "1ngocdanh@gmail.com");
		Users us2 = new Users("A Ta", "ata@gmail.com");
		Users us3 = new Users("a Dien", "adien@gmail.com");
		Users us4 = new Users("B TRan", "btran@gmail.com");
		Users us5 = new Users("HOai Thuong", "hoaithuong@gmail.com");
		Users us6 = new Users("Tran DUc Vien", "tranducvien@gmail.com");

		Users[] arr_User = new Users[] { us0, us1, us2, us3, us4, us5, us6 };
		/**
		 * TRuoc khi sort
		 */
		System.out.println("\nTRuoc khi sort");

		for (Users us : arr_User) {
			System.out.println(us.getName() + "-" + us.getEmail());
		}

		/**
		 * Sau khi sort
		 */
		System.out.println("\nSau khi sort");

		Arrays.sort(arr_User);

		for (Users us : arr_User) {
			System.out.println(us.getName() + "-" + us.getEmail());
		}
		 Person person1 = new Person("Marry", 20);
	        Person person2 = new Person("Tom", 21);
	        Person person3 = new Person("Daniel", 21);
	        Person person4 = new Person("Mischa", 18);
	        Person person5 = new Person("Christian", 20);
	 
	        // Một mảng chưa được sắp xếp.
	        Person[] array = new Person[] { person1, person2, person3, person4, person5 };
	 
	        // Sắp xếp mảng, sử dụng: <T> Arrays.sort(T[],Comparator<? supers T>).
	        // Và cung cấp một Comparator (Bộ so sánh).
	        Arrays.sort(array, new PersonComparator());
	 
	        for (Person person : array) {
	            System.out.println("Person: " + person.getAge() + " / " + person.getFullName());
	        }
	 
	        System.out.println("------------------------");
	 
	        // Đối với một danh sách:
	        List<Person> list = new ArrayList<Person>();
	        list.add(person1);
	        list.add(person2);
	        list.add(person3);
	        list.add(person4);
	        list.add(person5);
	 
	        // Sắp xếp danh sách sử dụng:
	        // <T> Collections.sort(List<T>, Comparator<? supers T>).
	        // Và cung cấp một Comparator (Bộ so sánh).
	        Collections.sort(list, new PersonComparator());
	 
	        for (Person person : list) {
	            System.out.println("Person: " + person.getAge() + " / " + person.getFullName());
	        }
		
	}
}
