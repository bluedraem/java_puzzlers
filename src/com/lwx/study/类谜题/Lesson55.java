package com.lwx.study.类谜题;

import java.util.concurrent.atomic.AtomicLong;

public class Lesson55 {


	public static void main(String[] args) {

		for(int i=0;i<100;i++){//如果去掉大括号 会有问题
			Greature greature=new Greature();
		}
		//没有考虑多线程问题
		System.out.println(Greature.get());





	}


	
}
class Greature {
private static long numCreated=0;
	//多线程的解决方案
	private static AtomicLong atomicLong=new AtomicLong();
	public Greature(){
		numCreated++;
		atomicLong.incrementAndGet();
	}
	public static long get(){
		//return numCreated;
		return atomicLong.get();
	}

}


