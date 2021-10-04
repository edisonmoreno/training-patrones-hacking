package com.edisonmoreno.patrones.creacionales.factorymethod;

import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

import java.util.UUID;

public class CostAccount implements AccountingAccount {
    @Override
    public String getAccount() {
        return "1020-Cost " + UUID.randomUUID().toString();
    }

}
