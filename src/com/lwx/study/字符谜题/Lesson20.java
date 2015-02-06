package com.lwx.study.字符谜题;

import java.util.regex.Pattern;

public class Lesson20 {

	public static void main(String[] args) {
		
		//正则的使用
		System.out.println(Lesson20.class.getName().replaceAll(".","/"));// 输出 ///////////////////////////
		System.out.println(Lesson20.class.getName().replaceAll("\\.","/"));// 输出 com/lwx/study/字符谜题/Lesson20
		System.out.println(Lesson20.class.getName().replaceAll(Pattern.quote("."),"/"));// 输出 com/lwx/study/字符谜题/Lesson20



	}
}
