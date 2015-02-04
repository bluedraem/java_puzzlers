package com.lwx.study.表达式谜题;

import java.math.BigDecimal;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:56
 */
public class Lesson2 {

    public static void main(String[] args) {
        //小数点
        System.out.println(2.0f-1);
        //一般做法
        System.out.println((200-100)/100);//先扩大到正数 则缩进
        //推荐做法使用
        BigDecimal bigDecimal=new BigDecimal("2.0");


    }
}
