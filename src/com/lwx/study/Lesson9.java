package com.lwx.study;

public class Lesson9 {

	
	public static void main(String[] args) {
		
		short x=0;
		int i=123456;
		System.out.println((short)i);
		//���ϸ�ֵ+= &=... �ȼ���E1 op E2 =E1 =(T)((E1)op(E2))T1ȡ��������ȡ����E1
		x+=i;
		System.out.println(x);
		
		Object o="";
		String s="";
		//o+=s;//���벻ͨ��
		s+=o;
		
	}
}
