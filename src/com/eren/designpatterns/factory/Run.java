package com.eren.designpatterns.factory;

public class Run {
    public static void main(String[] args) {
        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXEL).export("Test Content");
        System.out.println("File: " + file);
    }
}
