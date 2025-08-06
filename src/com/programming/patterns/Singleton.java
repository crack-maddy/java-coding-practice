package com.programming.patterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class Singleton implements Serializable {

    private static volatile Singleton instance = null;


    private Singleton(){
        if(instance != null)
            throw new RuntimeException("Using getInstanceMethod to get the singleton instance of this class.");
    }

    public static Singleton getInstance(){
        if(instance ==null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Object readResolve() throws ObjectStreamException{
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning is not allowed for singleton.");
    }
}
