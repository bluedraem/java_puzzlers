package com.lwx.study.库谜题;

import java.util.Random;

public class Lesson65 {


    public static void main(String[] args) {

        //考察 反码在abs中的用法 其次是 compare中不要使用 减法来做比较 -2000000000-200000000000 会发现为正数

        Random random = new Random(5);
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt());

        }


    }

}




