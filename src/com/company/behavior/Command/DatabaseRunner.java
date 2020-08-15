package com.company.behavior.Command;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
