package com.lwx.study.异常谜题;

public class Lesson45 {
	
	public static void main(String[] args) {
		//va虚拟机对栈的深度限制到了某个值，当超过这个值时，VM就抛出StackOverflowError。一般VM都将栈的深度限制为1024，即当方法调用方法的层次超过1024时就会产生StackOverflowError。
		
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
