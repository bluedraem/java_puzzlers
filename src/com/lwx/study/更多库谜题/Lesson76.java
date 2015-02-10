package com.lwx.study.更多库谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/10 15:45
 */
public class Lesson76 {

    public static void main(String[] args) {
        System.out.println(get());
    }

    static int a;

    static int get() {
        try {
            a = test();
            return a;
        } catch (Exception e) {
        } finally {
            System.out.println("finally");
            a = 2;
        }
        return a;
    }

    static int test() throws Exception {
        return 1;
    }
}


