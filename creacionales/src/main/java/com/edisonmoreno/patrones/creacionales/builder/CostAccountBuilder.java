package com.edisonmoreno.patrones.creacionales.builder;

import com.edisonmoreno.patrones.creacionales.builder.enumerations.AccountType;
import com.edisonmoreno.patrones.creacionales.builder.enumerations.ThirdType;
import com.edisonmoreno.patrones.creacionales.builder.interfaz.AccountBuilder;

public class CostAccountBuilder implements AccountBuilder {
    private String accountNumber;
    private AccountType accountType;
    private ThirdType thirdType;
    private String taxType;

    @Override
    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    @Override
    public void setAccountType(AccountType type) {
        this.accountType = type;
    }

    @Override
    public void setThirdType(ThirdType thirdType) {
        this.thirdType = thirdType;
    }

    @Override
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public AccountingAccount builder() {
        return new AccountingAccount(accountNumber, accountType, thirdType, taxType);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("accountNumber=%s |", accountNumber));
        result.append(String.format("accountType=%s |", accountType.toString()));
        result.append(String.format("thirdType=%s |", thirdType.toString()));
        result.append(String.format("taxType=%s |", taxType.toString()));
        return result.toString();
    }
}
