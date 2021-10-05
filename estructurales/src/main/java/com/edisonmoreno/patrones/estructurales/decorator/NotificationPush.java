package com.edisonmoreno.patrones.estructurales.decorator;

import com.edisonmoreno.patrones.estructurales.decorator.DTO.MessageDTO;
import com.edisonmoreno.patrones.estructurales.decorator.interfaz.NotificationSource;

public class NotificationPush implements NotificationSource {
    private String name;

    public NotificationPush(String name) {
        this.name = name;
    }

    @Override
    public void send(MessageDTO message) {
        System.out.println("*** Notification Push ***");
        System.out.println("*** name: " + this.name);
        System.out.println("*** message: " + message.toString());
        System.out.println();
    }
}
