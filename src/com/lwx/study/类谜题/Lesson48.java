package com.lwx.study.类谜题;

public class Lesson48 {

	public Lesson48(Object o){System.out.println(1);}
	public Lesson48(double[] o){System.out.println(2);}
	
	public static void main(String[] args) {
		//静态方法不具备多态性
		//对静态方法的调用不存在任何动态的分派机制。当一个程序调用了一个静态方法时，要被调用的方法都是在编译时就被选定的，即调用哪个方法是根据该引用被声明的类型决定的

	}
	
}
class Dog_48{}
