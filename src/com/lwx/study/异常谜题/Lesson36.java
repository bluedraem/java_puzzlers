package com.lwx.study.异常谜题;

public class Lesson36 {


	public static void main(String[] args) {

		System.out.println(dates());


	}

	public static Boolean  dates (){
		try {
			System.out.println("try");
			return true;
		} finally {
			System.out.println("finally");
			return false;//finally必须会执行 哪怕是return
		}
	}

}
