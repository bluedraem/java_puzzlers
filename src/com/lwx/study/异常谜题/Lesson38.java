package com.lwx.study.异常谜题;

public class Lesson38 {

 	static final int i = getId();
	public static void main(String[] args) {
		//i=2;//赋值失败
		System.out.println(i);

	}

	public static int getId(){
		return 1;
	}


}
