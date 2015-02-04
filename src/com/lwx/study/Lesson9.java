package com.lwx.study;

public class Lesson9 {

	
	public static void main(String[] args) {
		
		short x=0;
		int i=123456;
		System.out.println((short)i);
		//复合赋值+= &=... 等价于E1 op E2 =E1 =(T)((E1)op(E2))T1取决的类型取决于E1
		x+=i;
		System.out.println(x);
		
		Object o="";
		String s="";
		//o+=s;//编译不通过
		s+=o;
		
	}
}
