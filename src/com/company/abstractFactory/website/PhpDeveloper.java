package com.company.abstractFactory.website;

import com.company.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev writes php code");
    }
}
