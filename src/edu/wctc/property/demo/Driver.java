package edu.wctc.property.demo;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Enter cylinders: ");
        System.out.println("Must be between " + Engine2.MIN_CYLINDERS + " and " + Engine2.MAX_CYLINDERS + ".");
        Engine2 s = new Engine2(6);
    }
}
