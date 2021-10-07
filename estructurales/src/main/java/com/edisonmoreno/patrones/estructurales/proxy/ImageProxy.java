package com.edisonmoreno.patrones.estructurales.proxy;

public class ImageProxy implements Image {
    private String name = "";
    private ImageReal image = null;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        if (this.image == null) {
            this.image = new ImageReal(name);
        }
        this.image.show();
    }
}
