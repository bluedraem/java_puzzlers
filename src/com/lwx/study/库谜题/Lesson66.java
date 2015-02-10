package com.lwx.study.库谜题;

public class Lesson66 {
	
	public static void main(String[] args) {
		
		System.out.println(((Parent)new Child()).className);
		
	}

}

class Parent{
	public String className ="parent";
}

class Child extends Parent {
	private String className ="parent";
}
