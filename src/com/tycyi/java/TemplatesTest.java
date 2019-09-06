package com.tycyi.java;

/**
 * @author Iewoug
 * @date 2019/9/4 - 21:49
 */
public class TemplatesTest {
    public static void main(String[] args) {
        //sout
        System.out.println();
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm,当前方法
        System.out.println("TemplatesTest.main");
        //soutv
        int num=10;
        System.out.println("num = " + num);
        //xxx.sout,num.sout
        System.out.println(num);
        //模板fori
        for (int i = 0; i < 10; i++) {
            //sout
            System.out.println(i);
        }
    }
}
