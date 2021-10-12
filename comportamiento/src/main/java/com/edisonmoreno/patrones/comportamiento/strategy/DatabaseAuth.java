package com.edisonmoreno.patrones.comportamiento.strategy;

import com.edisonmoreno.patrones.comportamiento.strategy.interfaz.RouteStrategy;

public class DatabaseAuth implements RouteStrategy {
    @Override
    public String execute(String username, String password) {
        return "db-auth://" + username + ":" + password;
    }
}
