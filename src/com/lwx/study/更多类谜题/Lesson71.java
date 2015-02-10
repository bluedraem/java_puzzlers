package com.lwx.study.更多类谜题;
import java.util.Arrays;

import static java.util.Arrays.toString;
/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/10 13:47
 */
public class Lesson71 {
    public static void main(String[] args) {
        //
         String str[]=new String[]{"aa","bb"};
        //编译失败 因为编译的时候 没有toString(args[])的静态方法
        //System.out.println(toString(str));
        Arrays.toString(str);
    }
}
