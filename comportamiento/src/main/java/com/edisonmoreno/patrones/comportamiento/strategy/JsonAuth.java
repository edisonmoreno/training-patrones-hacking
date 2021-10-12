package com.edisonmoreno.patrones.comportamiento.strategy;

import com.edisonmoreno.patrones.comportamiento.strategy.interfaz.RouteStrategy;

public class JsonAuth implements RouteStrategy {
    @Override
    public String execute(String username, String password) {
        return "{ username: " + username + ", password:" + password + "}";
    }
}
