package com.eren.designpatterns.decorator;

public class IPhone11Pro extends PhoneDecorator {

    public IPhone11Pro(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice() + 100;
    }

    @Override
    public String getName() {
        return basicPhone.getName() + "Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 1;
    }

    public String extraMethod() {

        return "Extra Method";
    }
}
