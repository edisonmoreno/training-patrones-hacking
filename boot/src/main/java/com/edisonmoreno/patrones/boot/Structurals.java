package com.edisonmoreno.patrones.boot;

import com.edisonmoreno.patrones.estructurales.decorator.DTO.MessageDTO;
import com.edisonmoreno.patrones.estructurales.decorator.NotificationFormatterDecorator;
import com.edisonmoreno.patrones.estructurales.decorator.NotificationPush;
import com.edisonmoreno.patrones.estructurales.decorator.NotificationUpperDecorator;
import com.edisonmoreno.patrones.estructurales.decorator.base.NotificationBaseDecorator;

public class Structurals {

    public Structurals() {
        System.out.println();
        System.out.println("*******************");
        System.out.println("*** Structurals ***");
        System.out.println("*******************");

        this.printDecorator();
    }

    public void printDecorator() {
        System.out.println("    1. Decorator");
        System.out.println("    =====================");

        NotificationBaseDecorator notificationBaseDecorator = new NotificationBaseDecorator(
                new NotificationFormatterDecorator(
                        new NotificationUpperDecorator(
                                new NotificationPush("Edison Moreno"))));

        NotificationPush notificationPush = new NotificationPush("Pedro Perez");

        MessageDTO oneMessage = new MessageDTO("Mensaje de notificación", "01 - Decorador paso a paso", "..\\\\imagen\\\\principal.png");
        notificationBaseDecorator.send(oneMessage);

        MessageDTO twoMessage = new MessageDTO("Mensaje de 02", "02 - Decorador simple", "..\\\\imagen\\\\principal-02.png");
        notificationPush.send(twoMessage);
    }
}
