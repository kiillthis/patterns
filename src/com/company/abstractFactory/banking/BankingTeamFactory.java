package com.company.abstractFactory.banking;

import com.company.abstractFactory.Developer;
import com.company.abstractFactory.ProjectManager;
import com.company.abstractFactory.ProjectTeamFactory;
import com.company.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingPM();
    }
}
