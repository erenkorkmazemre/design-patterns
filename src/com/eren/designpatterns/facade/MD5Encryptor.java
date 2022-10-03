package com.eren.designpatterns.facade;

class MD5Encryptor {

    public void encrypt(String text, String key) {
        System.out.println("<MD5E>" + text + key + "</MD5E>");
    }
}
