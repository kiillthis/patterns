package com.company.abstractFactory.banking;

import com.company.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking project");
    }
}
