package com.edisonmoreno.patrones.boot;

import com.edisonmoreno.patrones.creacionales.builder.AccountingAccountDirector;
import com.edisonmoreno.patrones.creacionales.builder.CostAccountBuilder;
import com.edisonmoreno.patrones.creacionales.builder.InventoryAccountBuilder;
import com.edisonmoreno.patrones.creacionales.factorymethod.factory.*;
import com.edisonmoreno.patrones.creacionales.singleton.Config;

public class Creational {
    private static AccountBase accountBase;

    public Creational() {
        System.out.println();
        System.out.println("******************");
        System.out.println("*** Creational ***");
        System.out.println("******************");

        this.printFactoryMethod();
        this.printBuilder();
        this.printSingleton();
    }

    public void printFactoryMethod() {
        System.out.println("    1. FactoryMethod");
        System.out.println("    =====================");

        accountBase = new CostAccountCreator();
        System.out.println("CostAccountBuilder: " + accountBase.resolveAccount());

        accountBase = new InventoryAccountCreator();
        System.out.println("InventoryAccountBuilder: " + accountBase.resolveAccount());

        accountBase = new IncomeAccountCreator();
        System.out.println("IncomeAccount: " + accountBase.resolveAccount());

        accountBase = new SalesAccountCreator();
        System.out.println("SalesAccount: " + accountBase.resolveAccount());
    }

    public void printBuilder() {
        System.out.println("    2. Builder");
        System.out.println("    =====================");

        AccountingAccountDirector director = new AccountingAccountDirector();

        CostAccountBuilder costBuilder = new CostAccountBuilder();
        director.constructCostAccounting(costBuilder);
        System.out.println("costBuilder: ");
        System.out.println(costBuilder);

        InventoryAccountBuilder inventoryBuilder = new InventoryAccountBuilder();
        director.constructInventoryAccounting(inventoryBuilder);
        System.out.println("inventoryBuilder: ");
        System.out.println(inventoryBuilder);

    }

    public void printSingleton() {
        System.out.println("    3. Singleton");
        System.out.println("    =====================");

        System.out.println("create Instance with retry: 10");
        Config singleton = Config.getInstance(10);
        System.out.println("initial value retry: " + singleton.retryNumber);

        System.out.println("modify Instance with retry: 20");
        Config singletonSecondInstance = Config.getInstance(20);
        System.out.println("not alter value retry: " + singletonSecondInstance.retryNumber);

    }
}
