package com.lwx.study.更多类谜题;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/2/10 13:48
 */
public class Lesson70 {

    private static class ClickIt extends CodeTalk{

         void printlnMessage(){
            System.out.println("ClickIt");
        }
    }
    public static void main(String[] args) {

        ClickIt clickIt=new ClickIt();
        clickIt.doIt();
    }
}

class CodeTalk{

    public void doIt(){

        printlnMessage();
    }
   // private void printlnMessage(){ //
     void printlnMessage(){
        System.out.println("CodeTalk");
    }

}
