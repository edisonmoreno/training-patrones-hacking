package com.edisonmoreno.patrones.creacionales.factorymethod;

import com.edisonmoreno.patrones.creacionales.factorymethod.interfaz.AccountingAccount;

public class IncomeAccount implements AccountingAccount {
    @Override
    public String getAccount() {
        return "2050-Income";
    }
}
