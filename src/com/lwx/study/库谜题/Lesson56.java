package com.lwx.study.库谜题;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Lesson56 {


	public static void main(String[] args) {

		//考察BigInteger的用法  一个是BigInteger不可变 另外一个就是创建新的对象来存储运算结果返回
		BigInteger five=new BigInteger("500");
		BigInteger bigInteger=BigInteger.ZERO;

		BigInteger result=bigInteger.add(five);
		System.out.println(bigInteger.intValue());//0
		System.out.println(result.intValue());//500



	}


	
}




