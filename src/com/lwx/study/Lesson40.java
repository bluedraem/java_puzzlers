package com.lwx.study;

public class Lesson40 {
	private Lesson40 lesson40=new Lesson40();
	
	public Lesson40() throws Exception{
		throw new Exception("构造异常");
	}
	
	public static void main(String[] args) {
		
		try {
			Lesson40 lesson40=new Lesson40();
			System.out.println("surprise");
			
		} catch (Exception e) {
			System.out.println("catch异常");
		}
		
	}
}
