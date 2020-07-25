package com.company.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Project master = new Project(1, "SuperProject", "Source sourceCode = new SourceCode();");

        System.out.println(master);

       // ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = (Project) master.clone();
        System.out.println("\n==============\n");
        System.out.println(masterClone);
    }
}
