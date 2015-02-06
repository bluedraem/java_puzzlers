package com.lwx.study.异常谜题;

public class Lesson39 {

	public static void main(String[] args) {
		//终结finally的特权

		try{
			System.out.println("try");
			//通过这个来解决
			Runtime.getRuntime().addShutdownHook(new Thread(){
				public void run(){
					System.out.println("finally");
				}
			});
			System.exit(0);
		}finally {
			System.out.println("finally");//不会被执行 因为finally无法阻止进行over
		}

	}



}
