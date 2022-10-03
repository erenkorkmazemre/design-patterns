package com.eren.designpatterns.decorator;

public class IPhone11 extends PhoneDecorator {


    public IPhone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice() + 50;
    }

    @Override
    public String getName() {
        return basicPhone.getName() + "11";
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount() + 3;
    }
}
