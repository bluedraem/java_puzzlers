package com.lwx.study.类谜题;

public class Lesson54 {

	public Lesson54(Object o){System.out.println(1);}
	public Lesson54(double[] o){System.out.println(2);}
	
	public static void main(String[] args) {
		((Lesson54)null).say();
	}

	static void say(){
		System.out.println(1);
	}
	
}


