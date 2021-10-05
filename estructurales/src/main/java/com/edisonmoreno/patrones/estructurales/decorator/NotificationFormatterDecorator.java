package com.edisonmoreno.patrones.estructurales.decorator;

import com.edisonmoreno.patrones.estructurales.decorator.DTO.MessageDTO;
import com.edisonmoreno.patrones.estructurales.decorator.base.NotificationBaseDecorator;
import com.edisonmoreno.patrones.estructurales.decorator.interfaz.NotificationSource;

public class NotificationFormatterDecorator extends NotificationBaseDecorator {
    public NotificationFormatterDecorator(NotificationSource iNotificationSource) {
        super(iNotificationSource);
    }

    @Override
    public void send(MessageDTO message) {
        message.setBody(formatter(message.getBody()));
        message.setTitle(formatter(message.getTitle()));

        super.send(message);
    }

    private String formatter(String message) {
        return "<<".concat(message).concat(">>");
    }
}
