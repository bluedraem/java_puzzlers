package com.lwx.study;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson20 {
	
	public static void main(String[] args) {
		
		
		System.out.println(Lesson20.class.getName().replaceAll(".", "/"));
		System.out.println(Lesson20.class.getName().replaceAll("\\.", "/"));
		System.out.println(Lesson20.class.getName().replaceAll(Pattern.quote("."), "/"));
		System.out.println(Pattern.quote("."));
		System.out.println("a.b.c".replace(".", File.separator));
		System.exit(0);
	}
	
	
}

