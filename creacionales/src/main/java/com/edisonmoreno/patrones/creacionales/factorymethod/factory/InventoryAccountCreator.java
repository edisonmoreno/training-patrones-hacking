package com.edisonmoreno.patrones.creacionales.factorymethod.factory;

import com.edisonmoreno.patrones.creacionales.factorymethod.InventoryAccount;
import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

public class InventoryAccountCreator extends AccountBase {
    @Override
    public AccountingAccount create() {
        return new InventoryAccount();
    }
}
