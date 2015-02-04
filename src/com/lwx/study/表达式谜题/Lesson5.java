package com.lwx.study.表达式谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:18
 */
public class Lesson5 {


    public static  void main(String[]args){
        //默认常量都是in类型 对于int类型默认为正数,如果需要表示负数,则使用-
        System.out.println(0x80);//
        System.out.println(0x80000001);//八进制和十六进制如果最高位为1,则表示负数
        System.out.println(0x100000000L+0xcafebabe);
    }
}
