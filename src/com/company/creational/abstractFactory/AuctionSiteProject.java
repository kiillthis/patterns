package com.company.creational.abstractFactory;

import com.company.creational.abstractFactory.website.WebsiteTeamFactory;

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
