package com.lwx.study.更多类谜题;

import java.util.Arrays;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/10 13:47
 */
public class Lesson72 {
    public static void main(String[] args) {






    }
}
class Jeopardy{
    //第一种方式  不推荐
   // public static final String PRIZE="64000";
    private static final String PRIZE="64000";
    public final static String getPrize(){
        return PRIZE;
    }
}

class DoubleJeopardy extends Jeopardy{

    //public static final String PRIZE="2";
    //不允许重写
    /*public final static String getPrize(){
        return PRIZE;
    }*/

}

