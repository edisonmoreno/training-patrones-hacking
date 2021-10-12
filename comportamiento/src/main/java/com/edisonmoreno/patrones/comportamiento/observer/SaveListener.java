package com.edisonmoreno.patrones.comportamiento.observer;

import com.edisonmoreno.patrones.comportamiento.observer.interfaz.EventListener;

public class SaveListener implements EventListener {
    private String message;

    public SaveListener(String message) {
        this.message = message;
    }

    @Override
    public void update(Product product) {
        System.out.printf("save: %s to %s%n", message, product.toString());
    }
}
