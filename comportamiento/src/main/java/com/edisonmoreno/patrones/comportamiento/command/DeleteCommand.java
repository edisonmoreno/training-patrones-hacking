package com.edisonmoreno.patrones.comportamiento.command;

import com.edisonmoreno.patrones.comportamiento.command.interfaz.Command;

public class DeleteCommand implements Command {
    private ProductService productService;

    public DeleteCommand(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void execute(Product product) {
        productService.delete(product);
    }
}
