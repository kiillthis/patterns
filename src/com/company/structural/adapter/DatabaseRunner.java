package com.company.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDB();

        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
