package com.lwx.study.字符谜题;

import java.nio.charset.Charset;
import java.util.Properties;

public class Lesson13 {

	public static void main(String[] args) {
		//+的优先级高于==
		String s1="a1:4";
		String s2="a2:"+s1.length();
		System.out.println("s1 is equals s2:"+s2==s2);//false
		System.out.println("s1 is equals s2:"+(s2==s2));//s1 is equals s2:true
		System.out.println("s1 is equals s2:"+s2.equals(s2));//s1 is equals s2:true


	
	}
}
