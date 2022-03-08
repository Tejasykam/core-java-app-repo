package com.sapient.aem.ui;

import java.util.Scanner;

import com.sapient.aem.service.MyString;


public class MyStringTester {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String : ");
			String s=sc.nextLine();
			System.out.println(MyString.isPalindrome(s));
			System.out.println(MyString.charIsPresent(s, 'r'));
			System.out.println(MyString.stringIsPresent(s, "Hello"));
			System.out.println(MyString.position(s));
		}

}
