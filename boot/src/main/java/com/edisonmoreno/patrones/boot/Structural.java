package com.edisonmoreno.patrones.boot;

import com.edisonmoreno.patrones.estructurales.decorator.DTO.MessageDTO;
import com.edisonmoreno.patrones.estructurales.decorator.NotificationFormatterDecorator;
import com.edisonmoreno.patrones.estructurales.decorator.NotificationPush;
import com.edisonmoreno.patrones.estructurales.decorator.NotificationUpperDecorator;
import com.edisonmoreno.patrones.estructurales.decorator.base.NotificationBaseDecorator;
import com.edisonmoreno.patrones.estructurales.facade.DataExport;
import com.edisonmoreno.patrones.estructurales.facade.TypeFormatEnum;
import com.edisonmoreno.patrones.estructurales.proxy.Document;

import java.util.Arrays;
import java.util.List;

public class Structural {

    public Structural() {
        System.out.println();
        System.out.println("*******************");
        System.out.println("*** Structural ***");
        System.out.println("*******************");

        this.printDecorator();
        this.printFacade();
        this.printProxy();
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

    public void printFacade() {
        System.out.println("    2. Facade");
        System.out.println("    =====================");

        DataExport dataExport = new DataExport();
        List<String> dataSource = Arrays.asList("Record1", "2-Info-Data", "MetaData:3", "4List");

        String result = "";
        result = dataExport.getFile(dataSource, TypeFormatEnum.PDF);
        System.out.println("PDF: " + result);

        result = dataExport.getFile(dataSource, TypeFormatEnum.CSV);
        System.out.println("CSV: " + result);

        result = dataExport.getFile(dataSource, TypeFormatEnum.IMAGE);
        System.out.println("IMG: " + result);
    }

    public void printProxy() {
        System.out.println("    3. Proxy");
        System.out.println("    =====================");

        Document doc = new Document("Presupuesto.pptx");
        try {
            Thread.sleep(3000); // Pausa de 3Seg
            doc.doScroll();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }


    }
}
