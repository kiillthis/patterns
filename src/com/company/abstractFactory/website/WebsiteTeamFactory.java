package com.company.abstractFactory.website;

import com.company.abstractFactory.Developer;
import com.company.abstractFactory.ProjectManager;
import com.company.abstractFactory.ProjectTeamFactory;
import com.company.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new WebsitePM();
    }
}
