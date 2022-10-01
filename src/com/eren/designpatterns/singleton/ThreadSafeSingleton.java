package com.eren.designpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton THREAD_SAFE_SINGLETON;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if (THREAD_SAFE_SINGLETON == null) {
            THREAD_SAFE_SINGLETON = new ThreadSafeSingleton();
        }

        return THREAD_SAFE_SINGLETON;
    }

    public void singletonTest() {
        System.out.println("Thread Singleton Çalıştı");
    }
}
