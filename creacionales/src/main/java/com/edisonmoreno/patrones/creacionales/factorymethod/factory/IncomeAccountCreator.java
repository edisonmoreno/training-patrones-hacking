package com.edisonmoreno.patrones.creacionales.factorymethod.factory;

import com.edisonmoreno.patrones.creacionales.factorymethod.IncomeAccount;
import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

public class IncomeAccountCreator extends AccountBase {
    @Override
    public AccountingAccount create() {
        return new IncomeAccount();
    }
}
