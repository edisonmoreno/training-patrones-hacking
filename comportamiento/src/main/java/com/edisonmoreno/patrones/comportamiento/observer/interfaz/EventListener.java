package com.edisonmoreno.patrones.comportamiento.observer.interfaz;

import com.edisonmoreno.patrones.comportamiento.observer.Product;

public interface EventListener {
    void update(Product product);
}
