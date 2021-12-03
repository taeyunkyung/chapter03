package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {

		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01 == str02); // false: 주소값 다름
		
		// 같음?: String 클래스에서 hashCode() 재정의(글자가 같으면 hashCode가 같도록, 비교하기 쉽게)
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		System.out.println("==============================");
		String str03 = "hello"; // 예외적으로 사용가능
		String str04 = "hello"; // 메모리에 올라가는 방법은 다름: 동일한 문자열이 있는지 찾아보고 없을때만 새로 만듦
		
		System.out.println(str03 == str04); // true: 동일한 문자열이 있어 같은 주소 사용
		str04 = "hello!!!"; // 새주소 만듦
		System.out.println(str03); // hello: 한 번 만들어진 객체는 변경불가
		System.out.println(str03 == str04);
		
		System.out.println(str04.toString()); // hello!!!: 재정의
		
	}

}
