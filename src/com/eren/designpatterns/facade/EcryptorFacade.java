package com.eren.designpatterns.facade;

public class EcryptorFacade {

    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text, EnType enType) {
        switch (enType) {
            case AES:
                aesEncryptor.encrypt(text);
                break;
            case MD5:
                md5Encryptor.encrypt(text, "KEY");
                break;
            case SHA:
                shaEncryptor.encrypt(text, "KEY", true);
                break;
            default:
                throw new IllegalArgumentException(enType.toString());
        }
    }

    public enum EnType {
        SHA,
        MD5,
        AES
    }
}
