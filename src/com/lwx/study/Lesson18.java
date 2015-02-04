package com.lwx.study;

import java.nio.charset.Charset;
import java.util.Properties;
import java.util.regex.Pattern;

public class Lesson18 {

	public static void main(String[] args) {
		
		
		System.out.println(Charset.defaultCharset());
		Properties props = System.getProperties();
		System.out.println(props.get("file.encoding"));
		//-Dfile encoding =GBK eclipse÷–…Ë÷√
		
	}
}
