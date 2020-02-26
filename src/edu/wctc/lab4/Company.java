package edu.wctc.lab4;

public class Company {

    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee employee = new Employee(firstName, lastName, ssn);

        employee.doFirstTimeOrientation("A101");
        employee.printReport();
    }

}
