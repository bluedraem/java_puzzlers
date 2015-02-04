package com.lwx.study.表达式谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:18
 */
public class Lesson7 {


    public static  void main(String[]args){
        //多重置换
        //使用异或 1.//互斥 2.两次运算
        int x=1,y=2;
        System.out.println(x^y^y);//1
        System.out.println(y^x^x);//2
        //错误的做法(原先在于从左到右执行)
        x^=y^=x^=y;
        System.out.println(x);//0
        System.out.println(y);//1
        x=1;y=2;
        //正确的做法
        x=(y^=(x^=y))^x;

        System.out.println(x);//1
        System.out.println(y);//0






    }
}
