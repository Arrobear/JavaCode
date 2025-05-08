package com.java.Grammer1;

public class grammer1 {
    public static void main(String[] args) {
        /*
        * Text：ASCII
        * Image：RGB
        * Sound：Hash波形二进制码
        * */

//        数据类型
        /*
        * 基本数据类型
        * byte,short,int,long,float,double,char,boolean
        * 引用数据类型
        * */

//        类型转换
        /*
        * 自动类型转换
        * 表达式的自动类型转换：byte\short\char --> int --> long --> float --> double
        * 强制类型转换 ↓
        * int a = 功能1();
        * byte b = a;   ×
        * 大范围数据不能直接赋值给小范围变量，需要强制类型转换
        * byte b = (byte)a   √
        * */

//        运算符
        /*
        * + - * / %
        * "abc" + 5 --> "abc5"
         自增自减
        * ++
        * --
         赋值运算符
         * += -= *= /= %=
         关系运算符
         *  > >= < <= == !=
         逻辑运算符
         * & | ! ^
         三元运算符
         * 条件表达式 ? 值1 : 值2

        * */
        int a = 1;
        int b = a == 1 ? 1 : 0;
    }
}
