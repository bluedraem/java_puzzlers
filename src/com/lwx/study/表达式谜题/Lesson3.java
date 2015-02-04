package com.lwx.study.表达式谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:58
 */
public class Lesson3 {

    public static void main(String[] args) {
        //溢出
        System.out.println( 24 * 60 * 60 * 1000 * 1000);//500654080

        long result=24L * 60 * 60 * 1000 * 1000; //注意是第一位加上L
        System.out.println( result);//86400000000
    }
}
