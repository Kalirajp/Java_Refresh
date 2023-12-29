package com.practice.java;

public class TypeConvertion {

    /* type convertion happening in two way 
    1. implicit type convertion 
    2.Explicit type convertion*/
    
    byte byte_num=15;
    int int_num = byte_num;
    short short_num=(short)int_num;

    public static void main(String[] args) {

        TypeConvertion obj=new TypeConvertion();

        System.out.println(obj.int_num);
        System.out.println(obj.short_num);
    }

}
