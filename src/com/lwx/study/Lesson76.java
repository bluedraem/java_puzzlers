package com.lwx.study;

import java.util.HashMap;
import java.util.HashSet;

public class Lesson76 {

	public static synchronized void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t =new Thread(){
			public void run(){
				pong();
			}
			
		};
		//t.run();//pong ping
		t.start();//ping pong 
		//主线程执行完 才会执行第二个锁进程
		System.out.println("ping");

	}
	static synchronized void pong(){
		System.out.println("pong");
	}

}
