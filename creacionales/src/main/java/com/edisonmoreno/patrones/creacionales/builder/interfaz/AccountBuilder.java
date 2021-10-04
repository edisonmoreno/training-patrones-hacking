package com.edisonmoreno.patrones.creacionales.builder.interfaz;

import com.edisonmoreno.patrones.creacionales.builder.enumerations.AccountType;
import com.edisonmoreno.patrones.creacionales.builder.enumerations.ThirdType;

public interface AccountBuilder {
    void setAccountNumber(String number);

    void setAccountType(AccountType type);

    void setThirdType(ThirdType thirdType);

    void setTaxType(String taxType);
}
