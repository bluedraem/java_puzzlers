package com.lwx.study;

import java.nio.charset.Charset;
import java.util.Properties;

public class Lesson13 {

	public static void main(String[] args) {
		
		String s1="a1:4";
		String s2="a2:"+s1.length();
		System.out.println("s1 is equals s2:"+s2==s2);//false
		System.out.println("s1 is equals s2:"+(s2==s2));//s1 is equals s2:true
		//+ ��Ϊ���ӷ�����Ӻ� ���ȼ�������==
		
		System.out.print("hell");
		System.out.println("o world");
	
	}
}
