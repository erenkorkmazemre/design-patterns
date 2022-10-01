package com.eren.designpatterns.factory;

public class FileExporterFactory {

    public static FileExporter getInstance(FileType fileType) {
        switch (fileType) {
            case PDF:
                return new PdfExporter();
            case EXEL:
                return new ExelExporter();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public enum FileType {
        PDF,
        EXEL
    }
}
