package com.edisonmoreno.patrones.creacionales.factorymethod.factory;

import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

public abstract class AccountBase {
    public String resolveAccount() {
        AccountingAccount accountingAccount = create();
        return accountingAccount.getAccount();
    }

    public abstract AccountingAccount create();
}
