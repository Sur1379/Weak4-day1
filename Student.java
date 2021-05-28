package com.company.Weak4Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    int age;
    String name;
    int weight;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }


    public static void main(String[] args) {
        Student student1 = new Student(22, "Suren", 80);
        Student student2 = new Student(21, "Saqo", 66);
        Student student3 = new Student(25, "Davo", 75);
        System.out.println("For age sort---press 1 \nFor name sort---press 2 \nFor weight sort press 3");
        Scanner scanner = new Scanner(System.in);
        Student[] array = new Student[3];
        array[0] = student1;
        array[1] = student2;
        array[2] = student3;
        Sort sort = new Sort();
        int N = scanner.nextInt();
        if (N == 1) {
            System.out.println(Arrays.toString(sort.sort(array)));

        } else if (N == 2) {
            System.out.println(Arrays.toString(sort.sort(array, "a")));
        } else if (N == 3) {
            System.out.println(Arrays.toString(sort.sort(array, N)));
        } else {
            System.out.println("Illegal choice");
        }
    }
}
