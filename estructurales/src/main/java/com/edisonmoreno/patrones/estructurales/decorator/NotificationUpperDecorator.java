package com.edisonmoreno.patrones.estructurales.decorator;

import com.edisonmoreno.patrones.estructurales.decorator.DTO.MessageDTO;
import com.edisonmoreno.patrones.estructurales.decorator.base.NotificationBaseDecorator;
import com.edisonmoreno.patrones.estructurales.decorator.interfaz.NotificationSource;

import java.util.Locale;

public class NotificationUpperDecorator extends NotificationBaseDecorator {
    public NotificationUpperDecorator(NotificationSource source) {
        super(source);
    }

    @Override
    public void send(MessageDTO message) {
        message.setBody(upper(message.getBody()));
        message.setTitle(upper(message.getTitle()));
        super.send(message);
    }

    private String upper(String message) {
        return message.toUpperCase(Locale.ROOT);
    }
}
