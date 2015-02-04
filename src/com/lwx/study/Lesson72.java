package com.lwx.study;

public class Lesson72 {

	public static void main(String[] args) {
		
		
		System.out.println(A_72_.A);
		 A_72  a=new A_72_();
		System.out.println(a.B);
	}
}

class A_72{
	
	public static final String A="1";
	public final  String B="1";
}
class A_72_ extends A_72{
	
	public static final String A="2";
	public  final String B="2";
}
