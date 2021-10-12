package com.edisonmoreno.patrones.comportamiento.command.interfaz;

import com.edisonmoreno.patrones.comportamiento.command.Product;

public interface Command {
    void execute(Product product);
}
