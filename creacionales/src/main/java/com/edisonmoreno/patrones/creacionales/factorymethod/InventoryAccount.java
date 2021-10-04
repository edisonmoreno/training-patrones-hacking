package com.edisonmoreno.patrones.creacionales.factorymethod;

import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

public class InventoryAccount implements AccountingAccount {
    @Override
    public String getAccount() {
        return "4010-Inventory-" + Math.random() * 10;
    }
}
