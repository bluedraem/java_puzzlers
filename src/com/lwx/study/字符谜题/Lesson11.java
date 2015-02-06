package com.lwx.study.字符谜题;

public class Lesson11 {

	public static void main(String[] args) {
		//不要随意使用+来拼接,有以下四种解决方案
		/**
		 * 1.预置一个空字符串 eg:""+'a'
		 * 2.使用String.valueOf('a')+'b'
		 * 3.使用StringBuffer
		 * 4.使用printf
		 * */


		System.out.println('H'+'a');//72+97
		System.out.printf("%c%c",'H','a');//Ha
		StringBuffer sb=new StringBuffer();
		sb.append('H');
		sb.append('a');
		System.out.println(sb);
		
	}
}
