package com.edisonmoreno.patrones.comportamiento.command;

import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void save(Product product) {
        System.out.println("Guardando producto " + product.getName());
        products.add(product);
    }

    public void delete(Product product) {
        System.out.println("Eliminado producto " + product.getName());
        products.remove(product);
    }
}
