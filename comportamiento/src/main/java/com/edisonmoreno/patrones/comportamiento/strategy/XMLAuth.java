package com.edisonmoreno.patrones.comportamiento.strategy;

import com.edisonmoreno.patrones.comportamiento.strategy.interfaz.RouteStrategy;

public class XMLAuth implements RouteStrategy {
    @Override
    public String execute(String username, String password) {
        return "<XML username=" + username + " password=" + password + "/>";
    }
}
