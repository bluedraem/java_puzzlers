package com.lwx.study.字符谜题;

import java.util.Random;

public class Lesson23 {

	public static void main(String[] args) {
		
	//避免注释和代码混淆
		Random random=new Random();
		StringBuffer sb=null;
		switch (random.nextInt(2)){
			case 1:
				sb=new StringBuffer('p');
				System.out.println(1);
			case 2:
				sb=new StringBuffer('g');
				System.out.println(1);
			case 0:
				sb=new StringBuffer('m');
				System.out.println(1);

		}
		/**
		 * 1.random只有0和1
		 * 2.case 没有break
		 * 3.对StringBuffer传入字符 会转成int 因为没有提供对char字符的入参构造
		 *
		 * */

	//巧妙解决上面的方式

		System.out.println("pgm".charAt(random.nextInt(3))+"abc");

		//字典解决方式
		String a[]={"pabc","gabc","mabc"};
		System.out.println(a[random.nextInt(a.length)]);


	}
}
