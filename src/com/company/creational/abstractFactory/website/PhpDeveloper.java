package com.company.creational.abstractFactory.website;

import com.company.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev writes php code");
    }
}
