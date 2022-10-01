package com.eren.designpatterns.singleton;

public class LazySingleton {

    private static LazySingleton LAZY_SINGLETON;

    private LazySingleton() {

    }

    public static LazySingleton getLazySingleton() {
        if (LAZY_SINGLETON == null) {
            LAZY_SINGLETON = new LazySingleton();
        }
        return LAZY_SINGLETON;
    }

    public void singletonTest() {
        System.out.println("Lazy Singleton Çalıştı");
    }
}
