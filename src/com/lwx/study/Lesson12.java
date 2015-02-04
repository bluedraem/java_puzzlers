package com.lwx.study;

public class Lesson12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(""+new char[]{1});//[C@23fc4bec
		char c=100;
		System.out.println(c);
		String s =String.valueOf(new char[]{'6'});
		System.out.println(s);
		System.out.println("1"+String.valueOf(new char[]{'6'}));//[C@23fc4bec
		
	}

}
