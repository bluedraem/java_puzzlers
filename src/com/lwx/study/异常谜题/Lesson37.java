package com.lwx.study.异常谜题;

import java.io.IOException;

public class Lesson37 {


	public static void main(String[] args) {

/*
		编译不过,因为catch的没有跟执行抛出的异常一致
		try {
			System.out.println("try");

		} catch (IOException E){


		}*/

		try {

		}catch (Exception e){
			System.out.println("我永远不会被执行");
		}

		ExceptionType3 exceptionType3=new Type3();
		exceptionType3.f();//重点在于  异常必须是交际 而不是并集

	}



}
interface ExceptionType1{
	void f()throws CloneNotSupportedException;
}
interface ExceptionType2{
	void f()throws InterruptedException;
}
interface ExceptionType3 extends ExceptionType1,ExceptionType2{
	void f();
}

class Type3 implements   ExceptionType3{
	@Override
	public void f() {
		System.out.println(1);
	}
}
