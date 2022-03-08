package com.sapient.aem.service;

public class MyString {
	public static String isPalindrome(String data) {
		String t = "";
		for(int i = data.length()-1;i>=0;i--) {
			char c = data.charAt(i);
			t = t+c;
		}
		if(data.equals(t)) return data+"is palindrome";
		return data+"is not palindrome";
	}

	public static boolean charIsPresent(String data,char ch) {
		for(int i = data.length()-1;i>=0;i--) {
			char c = data.charAt(i);
			if(c==ch) return true;
		}
		return false;
	}

	public static boolean stringIsPresent(String data,String sub) {
		String s[] = data.split(" ");
		for(String t:s) {
			if(t.equals(sub)) return true;
		}
		return false;
	}

	public static String position(String data) {
		return data.substring(3,6);
	}

}

