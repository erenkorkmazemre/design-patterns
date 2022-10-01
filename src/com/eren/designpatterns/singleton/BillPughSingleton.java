package com.eren.designpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return SinletonHelper.INSTANCE;
    }

    private static class SinletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void singletonTest() {
        System.out.println("BillPugh Singleton Çalıştı");
    }
}
