package com.lwx.study;

public class Lesson45 {
	
	public static void main(String[] args) {
		
		
		workHard();
		System.out.println(1);
		
		
		
	}
	
	private static void workHard(){
		System.out.println("workHard");
		try {
			workHard();
		} finally{
			workHard();
		}
		
	}

}
