package com.edisonmoreno.patrones.estructurales.decorator.base;

import com.edisonmoreno.patrones.estructurales.decorator.DTO.MessageDTO;
import com.edisonmoreno.patrones.estructurales.decorator.interfaz.NotificationSource;

public class NotificationBaseDecorator implements NotificationSource {
    private final NotificationSource wrapper;

    public NotificationBaseDecorator(NotificationSource source) {
        this.wrapper = source;
    }

    @Override
    public void send(MessageDTO message) {
        this.wrapper.send(message);
    }
}
