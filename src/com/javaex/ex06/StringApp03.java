package com.javaex.ex06;

public class StringApp03 {

	public static void main(String[] args) {
		
		String str1;
		String str2, str3;

		str1 = "abc";
		str2 = "cde";
		str3 = str2;

		System.out.println(str2 = str1.toUpperCase());
		String str4 = str2.concat("??");
		System.out.println(str4);
		String str5 = "!".concat(str2).concat("@");
		System.out.println(str5);

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println("str4: " + str4);
		System.out.println("str5: " + str5);

	}

}
