package com.edisonmoreno.patrones.boot;

import com.edisonmoreno.patrones.comportamiento.command.DeleteCommand;
import com.edisonmoreno.patrones.comportamiento.command.Product;
import com.edisonmoreno.patrones.comportamiento.command.ProductService;
import com.edisonmoreno.patrones.comportamiento.command.SaveCommand;
import com.edisonmoreno.patrones.comportamiento.command.interfaz.Command;
import com.edisonmoreno.patrones.comportamiento.observer.DeleteListener;
import com.edisonmoreno.patrones.comportamiento.observer.Editor;
import com.edisonmoreno.patrones.comportamiento.observer.SaveListener;
import com.edisonmoreno.patrones.comportamiento.observer.interfaz.EventListener;
import com.edisonmoreno.patrones.comportamiento.strategy.AuthenticationContext;
import com.edisonmoreno.patrones.comportamiento.strategy.DatabaseAuth;
import com.edisonmoreno.patrones.comportamiento.strategy.JsonAuth;
import com.edisonmoreno.patrones.comportamiento.strategy.XMLAuth;

import java.util.Random;

public class Behavioral {
    public Behavioral() {
        System.out.println();
        System.out.println("******************");
        System.out.println("*** Behavioral ***");
        System.out.println("******************");

        this.printStrategy("DB");
        this.printStrategy("XML");
        this.printStrategy("JSON");

        this.printCommand();

        this.printObserver();
    }

    public void printStrategy(String mode) {
        System.out.println("    1. Strategy => mode:" + mode);
        System.out.println("    =====================");

        AuthenticationContext authenticationContext = new AuthenticationContext();

        if ("DB".equals(mode)) {
            authenticationContext.setStrategy(new DatabaseAuth());
        }

        if ("XML".equals(mode)) {
            authenticationContext.setStrategy(new XMLAuth());
        }

        if ("JSON".equals(mode)) {
            authenticationContext.setStrategy(new JsonAuth());
        }

        String result = authenticationContext.executeStrategy("juan.cardona23", "abcd456/*-/*");

        System.out.println("printStrategy: " + result);
    }

    public void printCommand() {
        System.out.println("    2. Command");
        System.out.println("    =====================");

        ProductService productService = new ProductService();
        int id = new Random().nextInt(1000);
        Product product = new Product(id, "Product " + id);

        Command saveProduct = new SaveCommand(productService);
        saveProduct.execute(product);

        Command deleteProduct = new DeleteCommand(productService);
        deleteProduct.execute(product);
    }

    public void printObserver() {
        System.out.println("    3. Observer");
        System.out.println("    =====================");

        Editor editor = new Editor();

        EventListener saveProcess = new SaveListener("Guardar");
        editor.manager.subscribe("save", saveProcess);

        EventListener deleteProcess = new DeleteListener("Eliminar");
        editor.manager.subscribe("delete", deleteProcess);

        int id = new Random().nextInt(1000);
        editor.saveProduct(id, "Product " + id);

        editor.deleteProduct(id);

    }
}
