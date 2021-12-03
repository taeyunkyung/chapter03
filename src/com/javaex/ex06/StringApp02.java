package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {

		String a = " abcd";
		String b = ",efg ";

		System.out.println(a.concat(b)); // abcd,efg
		System.out.println(b.concat(a)); // ,efg abcd

		a = a.concat(b);
		System.out.println(a);

		a = a.trim();
		System.out.println(a); // 맨앞 또는 맨뒤 공백 삭제
		b = b.trim();
		System.out.println(b.concat(a));

		a = a.replace("ab", "12,");
		System.out.println(a);

		String[] sArray = a.split(","); // 코드 내부에서 new String[] 만듦, 주소 return, 원본 유지
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a.toUpperCase());
		
		String str = "Hello JAVA!";
		String r01 = str.substring(3);
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3, 8);
		System.out.println(r03);
		
	}

}
