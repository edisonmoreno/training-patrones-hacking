package com.edisonmoreno.patrones.comportamiento.observer;

import com.edisonmoreno.patrones.comportamiento.observer.interfaz.EventListener;

public class DeleteListener implements EventListener {
    private String message;

    public DeleteListener(String message) {
        this.message = message;
    }
    @Override
    public void update(Product product) {
        System.out.printf("delete: %s to %s%n", message, product.toString());
    }
}
