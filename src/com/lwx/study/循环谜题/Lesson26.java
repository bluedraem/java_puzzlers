package com.lwx.study.循环谜题;

public class Lesson26 {

	public static void main(String[] args) {

		int j=0;
	for(int b=Byte.MAX_VALUE-100;b<Byte.MAX_VALUE;b++){ //这里存在无限循环
		j++;
	}
		System.out.println(j);//j永远不会打印

		//正确做法
		/*do(
				j++
				)while(b!=byte.MAX_VALUE)*/

	}
}
