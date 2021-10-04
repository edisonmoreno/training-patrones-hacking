package com.edisonmoreno.patrones.creacionales.factorymethod;

import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

public class SalesAccount implements AccountingAccount {
    @Override
    public String getAccount() {
        return "3020-Sales";
    }
}
