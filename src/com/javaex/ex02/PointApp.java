package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2, 3);
		Point p01 = new Point(2, 3);
		Point p02 = new Point(5, 9);
		Point p04 = p02;
		
		System.out.println("#obj.getClass()"); // 부모=Object, 자동으로 상속
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("==============================");
		
		System.out.println("#obj.hashCode()");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("==============================");
		
		System.out.println("#obj.toString()"); // 재정의한 상태
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("==============================");
		
		System.out.println("#obj.equals()");
		System.out.println(p00.equals(p02));
		System.out.println(p00.equals(p01));
		System.out.println(p00 == p01);
		System.out.println(p04.equals(p02));
		System.out.println(p04 == p02);
		System.out.println("==============================");
	}

}
