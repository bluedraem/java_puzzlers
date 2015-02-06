package com.lwx.study.字符谜题;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson21 {

	public static void main(String[] args) {
		
		//正则的使用
		System.out.println( File.separator);// \ 反斜杠
		System.out.println( File.pathSeparator);// ;
		System.out.println( File.separatorChar);// ;
		//System.out.println(Lesson21.class.getName().replaceAll(Pattern.quote("."), File.separator));// java.lang.StringIndexOutOfBoundsException: String index out of range: 1
		System.out.println(Lesson21.class.getName().replaceAll(Pattern.quote("."), Matcher.quoteReplacement( File.separator)));//
		System.out.println(Lesson21.class.getName().replace('.', File.separatorChar));//


	}
}
