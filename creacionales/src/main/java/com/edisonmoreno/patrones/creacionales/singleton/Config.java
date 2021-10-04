package com.edisonmoreno.patrones.creacionales.singleton;

public class Config {
    private static Config instance;
    public int retryNumber;

    private Config(int retry) {
        this.retryNumber = retry;
    }

    public static Config getInstance(int retry) {
        if (instance == null) {
            instance = new Config(retry);
        }
        return instance;
    }
}
