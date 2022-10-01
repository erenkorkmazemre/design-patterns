package com.eren.designpatterns.factory;

class ExelExporter implements FileExporter {

    @Override
    public String export(String contect) {
        return "EXEL -> " + contect;
    }
}
