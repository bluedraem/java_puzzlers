package com.lwx.study.字符谜题;

import java.beans.Encoder;

public class Lesson14 {

	public static void main(String[] args) {
		//字符串常量与转义字符 优先考试使用字符串，而非Unicode

		System.out.println("\u6211".length());

		//ascii只有128个字符 1个字节 八位
		//unicode表示 4个16进制数 0xffff

		//http://blog.csdn.net/z69183787/article/details/25742307
		char c='我';
		System.out.println( Integer.toHexString(c>>>8));//62   c>>>8=98
		System.out.println( Integer.toHexString(c&0xFF));//11 c&0xFF=17






	}
}
