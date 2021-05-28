package com.company.Weak4Day1;

import java.util.Scanner;

public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudent;
    int minxAgeOfStudent;

    public University() {
    }

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudent, int minxAgeOfStudent) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.minxAgeOfStudent = minxAgeOfStudent;
    }

    void printInfo() {
        System.out.println(name + " " + countOfStudents + " " + maxCountOfStudents + " "
                + maxAgeOfStudent + " " + minxAgeOfStudent);
    }

    boolean checkAge(int age) {
        boolean b1;
        if (age <= maxAgeOfStudent && age >= minxAgeOfStudent) {
            b1 = true;
        } else {
            b1 = false;
        }
        return b1;
    }

    void admission() {
        System.out.println("Applied Mathematics -- press 1 \nComputer science -- press 2 " +
                "\nLanguages science -- press 3");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 1 || x > 3) {
            System.out.println("Illegal choice");
        } else {
            System.out.println("Input your age");
            int age = scanner.nextInt();
            if (checkAge(age) == true) {
                System.out.println(register(countOfStudents));
            } else {
                System.out.println("You can't register");
            }
        }
    }

    int register(int countOfStudents) {
        countOfStudents++;
        return countOfStudents;
    }

    public static void main(String[] args) {
        University university = new University("EPH", 100,
                125, 23, 18);
        Scanner scanner = new Scanner(System.in);
        university.printInfo();
        System.out.println("Input your age");
        int age = scanner.nextInt();
        if (university.checkAge(age) == true) {
            System.out.println("You can register");
            university.admission();
        } else {
            System.out.println("You cant register");
        }


    }
}
