package com.hundsun.demo.control;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static Logger logger=LogManager.getLogger(Test.class.getName());
    public static void main(String[] args){
        System.out.println("hello");
        logger.error("这是个错误！！");

    }
}
