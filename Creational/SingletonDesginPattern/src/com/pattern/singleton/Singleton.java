package com.pattern.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
        System.out.println("Object Created.");
    }

    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }

        return singleton;
    }
}
