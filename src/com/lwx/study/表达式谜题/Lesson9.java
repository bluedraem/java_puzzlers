package com.lwx.study.表达式谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/3 20:18
 */
public class Lesson9 {


    public static  void main(String[]args){

        //符合类型
        //Java语言规范中提到：复合赋值 E1 op= E2等价于简单赋值 E1 = (T)((E1) op (E2))，其中T是E1的类型。

        short x=0;
        int i = 123456;
        x +=i;
        System.out.println(x);//-7616

      //不要在short、byte或char类型的变量之上使用复合赋值操作符，因为这一过程会伴随着计算前类型的提升与计算后结果的截断，导致最后的计算结果不正确。

    }
}
