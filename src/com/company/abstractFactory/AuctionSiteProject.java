package com.company.abstractFactory;

import com.company.abstractFactory.banking.BankingTeamFactory;
import com.company.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getPM();

        System.out.println("Creating auction project");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
