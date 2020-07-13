package com.company.factoryMethod;

public class CsFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CsDeveloper();
    }
}
