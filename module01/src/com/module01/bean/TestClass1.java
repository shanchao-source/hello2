package com.module01.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author shanchao
 * @create 2019/11/3-14:52
 */
public class TestClass1 {
    public TestClass1() {
    }

    public static final int SIZE = 20;



    public static void main(String[] args) {
        Date date = new Date();
        List<String> mylist = new ArrayList();
        System.out.println("1111111111");
        mylist.add(0,"aaa");
    }
    public void m1(){
        System.out.println("aaa");
    }
}
