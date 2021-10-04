package com.edisonmoreno.patrones.creacionales.builder;

import com.edisonmoreno.patrones.creacionales.builder.enumerations.AccountType;
import com.edisonmoreno.patrones.creacionales.builder.enumerations.ThirdType;

public class AccountingAccountDirector {
    public void constructCostAccounting(CostAccountBuilder builder) {
        builder.setAccountNumber("2050");
        builder.setAccountType(AccountType.DEBIT);
        builder.setThirdType(ThirdType.PROVIDER);
        builder.setTaxType("IVA");
    }

    public void constructInventoryAccounting(InventoryAccountBuilder builder) {
        builder.setAccountNumber("1020");
        builder.setAccountType(AccountType.CREDIT);
        builder.setThirdType(ThirdType.PROVIDER);
        builder.setTaxType("IVA");
    }
}
