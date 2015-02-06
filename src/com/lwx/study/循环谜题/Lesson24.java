package com.lwx.study.循环谜题;

import java.util.Random;

public class Lesson24 {

	public static void main(String[] args) {

		for(byte b=Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){

			if(b==0xff){//这种做法 会默认将b转成32位的int类型 在做比较
				System.out.println(1);
			}
			if(b==(byte)0xff){
				System.out.println(1);
			}
			//或则
			if((b&0xff)==0xff){//消除符号扩展的影响

			}

		}

	}
}
