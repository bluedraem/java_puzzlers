package com.lwx.study;

public class Lesson46 {

	public Lesson46(Object o){System.out.println(1);}
	public Lesson46(double [] o){System.out.println(2);}
	
	public static void main(String[] args) {
		new Lesson46(null);
		new Lesson46((Object)null);
	}
	
}
