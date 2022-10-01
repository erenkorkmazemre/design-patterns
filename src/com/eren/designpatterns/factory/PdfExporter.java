package com.eren.designpatterns.factory;


class PdfExporter implements FileExporter {

    @Override
    public String export(String contect) {
        return "PDF -> " + contect;
    }
}
