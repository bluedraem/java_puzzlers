package com.lwx.study.表达式谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:18
 */
public class Lesson10 {


    public static  void main(String[]args){

       String x="xx";
        Object obj="aa";
      obj=obj+x;
        System.out.println(obj);

        //报错------
        // obj+=x; //右侧是String  左侧是Object
    }
}
