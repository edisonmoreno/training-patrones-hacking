package com.edisonmoreno.patrones.comportamiento.observer;

public class Editor {
    public EventManager manager;
    private Product product;

    public Editor() {
        manager = new EventManager();
    }

    public void saveProduct(int id, String name) {
        this.product = new Product(id, name);
        manager.notify("save", product);
    }

    public void deleteProduct(int id) {
        this.product = new Product(id, "");
        manager.notify("delete", product);
    }
}
