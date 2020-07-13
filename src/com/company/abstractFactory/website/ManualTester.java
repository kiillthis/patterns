package com.company.abstractFactory.website;

import com.company.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual QA tests code");
    }
}
