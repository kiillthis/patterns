package com.company.structural.bridge;

public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Stock development in progress");
        developer.writeCode();
    }
}
