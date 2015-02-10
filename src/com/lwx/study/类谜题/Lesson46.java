package com.lwx.study.类谜题;

public class Lesson46 {

	public Lesson46(Object o){System.out.println(1);}
	public Lesson46(double[] o){System.out.println(2);}
	
	public static void main(String[] args) {
		//精确度高的优先级高   建议避免使用这种方式
		new Lesson46(null);
		new Lesson46((Object)null);
	}
	
}
