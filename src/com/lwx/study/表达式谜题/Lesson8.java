package com.lwx.study.表达式谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:18
 */
public class Lesson8 {


    public static  void main(String[]args){

     /*   （1）       如果第二个和第三个操作数具有相同的类型，那么它就是条件表达式的类型。
        （2）       如果一个操作的类型是T，T表示byte、short或char，而另一个操作数是一个int类型的“字面常量”，并且它的值可以用类型T表示，那条件表达式的类型就是T。
        （3）       否则，将对操作数类型进行提升，而条件表达式的类型就是第二个和第三个操作被提升之后的类型。*/

        char c='X';
        int i=2;
        System.out.println(true?c:0);//X 0 字符常量
        System.out.println(false?i:c);//88

        final int ii=2;
        System.out.println(false?ii:c);//X






    }
}
