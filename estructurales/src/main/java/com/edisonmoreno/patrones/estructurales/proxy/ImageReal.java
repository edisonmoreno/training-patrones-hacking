package com.edisonmoreno.patrones.estructurales.proxy;

public class ImageReal implements Image {
    private String name;

    public ImageReal(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Visualizando la imagen: [" + name + "]");
    }
}
