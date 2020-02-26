package edu.wctc.method.demo.poor;

public class Dog2 {
    private int age;
    public Dog2(int age){
        validateAge(age);
        this.age = age;
    }
    public void setAge(int age){
        validateAge(age);
        this.age = age;
    }
    private  void validateAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age cant be negative.");
        }
    }
}
