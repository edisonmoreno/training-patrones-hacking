package com.edisonmoreno.patrones.creacionales.builder;


import com.edisonmoreno.patrones.creacionales.builder.enumerations.AccountType;
import com.edisonmoreno.patrones.creacionales.builder.enumerations.ThirdType;

public class AccountingAccount {
    private String accountNumber;
    private AccountType accountType;
    private ThirdType thirdType;
    private String taxType;

    public AccountingAccount(String accountNumber, AccountType accountType, ThirdType thirdType, String taxType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.thirdType = thirdType;
        this.taxType = taxType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public ThirdType getThirdType() {
        return thirdType;
    }

    public String getTaxType() {
        return taxType;
    }
}
