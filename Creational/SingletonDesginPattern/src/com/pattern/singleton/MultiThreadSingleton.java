package com.pattern.singleton;

public class MultiThreadSingleton {
    private static MultiThreadSingleton singleton;
    private MultiThreadSingleton(){
        System.out.println("Object Created.");
    }

    public static MultiThreadSingleton getInstance(){

        if(singleton==null){
            synchronized (MultiThreadSingleton.class){
                if(singleton==null){
                    singleton=new MultiThreadSingleton();
                }
            }
        }

        return singleton;
    }
}
