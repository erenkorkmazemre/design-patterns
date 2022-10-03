package com.eren.designpatterns.decorator;

public class DecoratorRunner {

    public static void main(String[] args) {
        Phone phone = new IPhone11Pro(new IPhone());
        System.out.println(" Name " + phone.getName());
        System.out.println(" Price " + phone.getPrice());
        System.out.println(" Camera Count " + phone.cameraCount());
    }
}
