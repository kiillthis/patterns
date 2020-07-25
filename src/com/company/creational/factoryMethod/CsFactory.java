package com.company.creational.factoryMethod;

public class CsFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CsDeveloper();
    }
}
