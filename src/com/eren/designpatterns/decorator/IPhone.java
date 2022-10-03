package com.eren.designpatterns.decorator;

public class IPhone implements Phone{
    @Override
    public String getName() {
        return "IPhone ";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 699.90;
    }
}
