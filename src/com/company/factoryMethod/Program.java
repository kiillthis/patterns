package com.company.factoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("C#");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String speciality) {
        if(speciality.equalsIgnoreCase("Java")) {
            return new JavaFactory();
        } else if(speciality.equalsIgnoreCase("C++")) {
            return new CppFactory();
        } else if(speciality.equalsIgnoreCase("C#"))  {
            return new CsFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown specialty");
        }

    }
}
