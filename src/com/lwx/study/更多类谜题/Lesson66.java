package com.lwx.study.更多类谜题;

public class Lesson66 {
	
	public static void main(String[] args) {
		//继承  属性隐藏  方法覆盖
		//置换原则 访问基类的 子类一定也可以访问
		//System.out.println((new Child()).className);
		System.out.println(((Parent)new Child()).className);

	}

}

class Parent{
	public String className ="parent";
}

class Child extends Parent {
	private String className ="Child";
}
