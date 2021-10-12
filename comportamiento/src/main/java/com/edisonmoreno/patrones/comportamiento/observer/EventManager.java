package com.edisonmoreno.patrones.comportamiento.observer;

import com.edisonmoreno.patrones.comportamiento.observer.interfaz.EventListener;

import java.util.HashMap;

public class EventManager {
    private HashMap<String, EventListener> eventListener;

    public EventManager() {
        eventListener = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener listener) {
        eventListener.put(eventType, listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        eventListener.remove(eventType, listener);
    }

    public void notify(String eventType, Product product) {
        eventListener.forEach((type, listener) -> {
            if (type.equals(eventType)) listener.update(product);
        });
    }
}
