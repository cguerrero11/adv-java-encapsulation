package edu.wctc.lab4;

public class Company {

    public Company() {
        Manager hiringmanager = new Manager();
        hiringmanager.hireEmployee("Peter", "Piper", "333-33-3333");

        hiringmanager.arrageOrientation();
        hiringmanager.getReport();
    }

}
