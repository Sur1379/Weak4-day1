package com.company.Weak4Day1;

import java.util.Arrays;

public class Sort {
    Student[] sort(Student[] array) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].age > array[i + 1].age) {
                    Student temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
        } while (count > 0);


        return array;
    }

    Student[] sort(Student[] array,String str ) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].name.compareTo(array[i + 1].name) > 0) {
                    Student temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
        } while (count > 0);

        return array;
    }

    Student[] sort(Student[] array, int N) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].weight > array[i + 1].weight) {
                    Student temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
        } while (count > 0);

        return array;
    }
}
