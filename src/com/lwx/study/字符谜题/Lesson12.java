package com.lwx.study.字符谜题;

public class Lesson12 {

	public static void main(String[] args) {
		//了解各种输入和输出对象的方式
		//System.out.println(""+new char[]{1});//[C@23fc4bec
		char c=100;
		System.out.println(c);
		String s =String.valueOf(new char[]{'6'});
		System.out.println(s);
		System.out.println("1"+String.valueOf(new char[]{'6'}));//[C@23fc4bec
		System.out.println(new char[]{'a','b'});
	}

}
