package com.company.abstractFactory.website;

import com.company.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web PM manages web project");
    }
}
