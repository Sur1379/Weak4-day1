package com.company.Weak4Day1;

public class Employer {
    String name;
    int age;
    String workPlace;
    double salary;

    public Employer() {
    }

    public Employer(String name, int age, String workPlace, double salary) {
        this.name = name;
        this.age = age;
        this.workPlace = workPlace;
        this.salary = salary;
    }
     void printAll(){
         System.out.println(name +" "+ age +" "+ workPlace +" "+ salary);
     }

    public static void main(String[] args) {
       Employer employer = new Employer("Saq", 18, "ACA", 25000);
       Employer employer1 = new Employer("Suren", 25, "Tuvalu", 150000);
       employer.printAll();
       employer1.printAll();
    }
}

