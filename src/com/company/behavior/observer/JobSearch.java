package com.company.behavior.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");

        Observer firstSub = new Subscriber("John");
        Observer secondSub = new Subscriber("Max");

        jobSite.addObserver(firstSub);
        jobSite.addObserver(secondSub);

        jobSite.addVacancy("Third java position");

        jobSite.removeVacancy("First java position");
    }
}
