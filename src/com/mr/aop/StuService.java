package com.mr.aop;

public class StuService {

    public Integer save(String name) {
        
        System.out.println("增加数据...");
        
        return 1;
        
    }
    
    public void delete() {
        
        System.out.println("删除数据...");
        
    }
    
    public void update() {
        
        System.out.println("修改数据...");
        
    }
    
    
}
