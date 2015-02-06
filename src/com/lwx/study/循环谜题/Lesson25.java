package com.lwx.study.循环谜题;

public class Lesson25 {

	public static void main(String[] args) {

		int j=0;
	for(byte b=Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){
		j=j++;
		//正确做法 j++


	}
		System.out.println(j);//j永远等于0

	}
}
