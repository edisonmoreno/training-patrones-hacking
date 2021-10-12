package com.edisonmoreno.patrones.comportamiento.command;

import com.edisonmoreno.patrones.comportamiento.command.interfaz.Command;

public class SaveCommand implements Command {
    private ProductService productService;

    public SaveCommand(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void execute(Product product) {
        productService.save(product);
    }
}
