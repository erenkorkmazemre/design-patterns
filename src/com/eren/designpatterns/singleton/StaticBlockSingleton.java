package com.eren.designpatterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton STATIC_BLOCK_SINGLETON;

    static {
        try {
            STATIC_BLOCK_SINGLETON = new StaticBlockSingleton();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getStaticBlockSingleton() {
        return STATIC_BLOCK_SINGLETON;
    }

    public void singletonTest() {
        System.out.println("Static Block Singleton Metod Çalıştı");
    }
}
