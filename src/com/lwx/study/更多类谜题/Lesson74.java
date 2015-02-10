package com.lwx.study.更多类谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/10 13:47
 */
public class Lesson74 {
    public static void main(String[] args) {
        //教训 尽量不要隐藏、遮蔽和掩盖
        new Enigma().equals(null);
    }
}
class Enigma{

    public Enigma(){}

    public boolean equals(Enigma e){
        System.out.println(1);
        return false;
    }
}
