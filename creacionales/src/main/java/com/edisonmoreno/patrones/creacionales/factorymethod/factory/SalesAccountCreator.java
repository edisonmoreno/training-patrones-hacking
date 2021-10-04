package com.edisonmoreno.patrones.creacionales.factorymethod.factory;

import com.edisonmoreno.patrones.creacionales.factorymethod.SalesAccount;
import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

public class SalesAccountCreator extends AccountBase {
    @Override
    public AccountingAccount create() {
        return new SalesAccount();
    }
}