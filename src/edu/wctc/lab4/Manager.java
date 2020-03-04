package edu.wctc.lab4;

public class Manager {
    Employee employee;

    public void hireEmployee(String firstName, String lastName, String ssn){
        this.employee = new Employee(firstName, lastName, ssn);


    }
    public void arrageOrientation(){
        employee.doFirstTimeOrientation("A101");
    }

    public void getReport(){
        employee.printReport();
    }
}
