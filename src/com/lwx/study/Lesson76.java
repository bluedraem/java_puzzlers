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
		//���߳�ִ���� �Ż�ִ�еڶ���������
		System.out.println("ping");

	}
	static synchronized void pong(){
		System.out.println("pong");
	}

}
