package com.edisonmoreno.patrones.comportamiento.strategy;

import com.edisonmoreno.patrones.comportamiento.strategy.interfaz.RouteStrategy;

public class AuthenticationContext {
    RouteStrategy strategy;

    public RouteStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String username, String password) {
        return strategy.execute(username, password);
    }

}
