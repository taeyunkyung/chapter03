package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {

		int n = 10;
		Integer i = new Integer(10);
		Short s = new Short((short) 3); // 형변환 필요
		Byte b = new Byte((byte) 3); // 형변환 필요
		Double d = new Double(3.5);

		System.out.println(n);
		System.out.println(i);

		int num01 = 10;
		int num02 = 7;
		int intResult = num01 + num02;
		System.out.println(intResult);

		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		// i01 + i02: 주소 + 주소
		Integer result = i01 + i02;
		System.out.println(result);

		// 박싱/언박싱 (자동)
		Integer i03 = 10; // 박생: 내부적으로 new Integer 처리

		Integer i04 = 100;
		int num99 = i04; // 언박싱

		System.out.println("==============================");
		// 문자열 -> int
		Integer i05 = 10; // 의미없는 숫자를 지정해놓은 경우
		int r01 = i05.parseInt("12345");
		System.out.println(r01);

		// Integer.parseInt(): 스태틱
		int r02 = Integer.parseInt("123");

		// int -> 문자열
		String a = "안녕하세요"; // 불필요
		String snum01 = a.valueOf(555); // 문자열에 담김
		System.out.println(snum01);
		String snum02 = String.valueOf(345); // 스태틱

		System.out.println("안녕" + 1234); // +연산자 이용
		String r100 = "안녕" + 1234;
		String r99 = "" + 555;
	}

}
