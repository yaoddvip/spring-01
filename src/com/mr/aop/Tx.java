package com.mr.aop;

public class Tx {

    
    public void begin() {
        
        System.out.println("创建连接，开启事务..");
    }
    
    
    public void end() {
        
        System.out.println("提交事务，关闭事务..");
        System.out.println("----------------------------");
        
        System.out.println();
        
        
    }
    
}
