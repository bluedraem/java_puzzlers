package com.lwx.study.字符谜题;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.regex.Pattern;

public class Lesson18 {

	public static void main(String[] args) {
		
		
		System.out.println(Charset.defaultCharset());
		Properties props = System.getProperties();
		System.out.println(props.get("file.encoding"));
		//-Dfile encoding =GBK eclipse������

		byte bytes[]=new byte[256];
		for(int i =0;i<256;i++){

			bytes[i]=(byte)i;
		}
		String str=new String(bytes);
		for(int i=0,n=str.length();i<n;i++){
			System.out.println(Integer.toBinaryString(str.charAt(i))+"--"+(int)str.charAt(i)+" ");
		}

		//正确做法
		try {
			str=new String(bytes,"gbk");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println(str);
	}
}
