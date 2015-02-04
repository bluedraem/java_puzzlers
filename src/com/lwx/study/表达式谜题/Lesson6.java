package com.lwx.study.表达式谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:18
 */
public class Lesson6 {


    public static  void main(String[]args){
        //符号扩展（即如果符号位为1，则扩展为1，如果为零，则扩展为0）；如果它是char，那么不管它将要被提升成什么类型，都执行零扩展
        //如果是char类型，一定是无符号拓展，因为char没有负数。其他的，如果之前是正数则无符号拓展，如果是负数则有符号拓展
        System.out.println((int)(char)(byte)-1);//65535
        System.out.println((byte)-1);//-1
        System.out.println(Integer.toBinaryString((char)(byte)-1));//1111111111111111 二进制  有符号转无符号 扩展到16位
        System.out.println(Integer.toBinaryString((byte)100));//1111111111111111 二进制  有符号转无符号 扩展到16位

        byte b=1;
        //如果将一个byte数值b转型为一个char，并且不希望有符号扩展，那么必须使用一个位掩码来限制它：
        char c = (char)(b & 0xff);// char c = (char) b;为有符号扩展
        //如果将一个char数值c转型为一个宽度更宽的类型时，只是以零来扩展，但如果清晰表达以零扩展的意图，则可以考虑使用一个位掩码：
        int i = c & 0xffff;//实质上等同于：int i = c ;
        //如果将一个char数值c转型为一个宽度更宽的整型，并且希望有符号扩展，那么就先将char转型为一个short，它与char上个具有同样的宽度，但是它是有符号的：
         i = (short)c;




    }
}
