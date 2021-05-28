package com.company.Weak4Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic {
    int[] array;

//    public Arithmetic() {
//    }

    public Arithmetic(int[] array) {
        this.array = array;
    }

    int[] bubbleSort(int[] array) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
        } while (count > 0);


        return array;
    }

    void binarySearch(int[] array, int N) {
        int i = array.length / 2;
        int left = 0;
        int right = array.length - 1;
        int count = 0;
        while (array[i] != N && N >= left && N <= right) {

            int midlle = ((left + right)) / 2;
            if (array[midlle] == N) {
                count++;
                i = midlle;
            } else if (array[midlle] > N) {
                right = midlle - 1;
            } else {
                left = midlle + 1;
            }

        }
        if (count == 0 && array[i] != N) {
            System.out.println("There is no that number");
        } else {
            System.out.println("The number index is - " + i);
        }

    }

    int min(int[] array) {
        return array[0];
    }

    int max(int[] array) {
        return array[array.length - 1];
    }

    int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    boolean checkArithmeticProgression(int[] array) {
        int count = 0;
        int d = array[1] - array[0];
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] - d == array[i - 1]) {
                count++;
            }
        }
        boolean b1;
        if (count == array.length - 1) {
            b1 = true;
        } else {
            b1 = false;
        }
        return b1;
    }

    void options(int[] array) {
        System.out.println("Bubble sort -- press 1 \nQuick sort -- press 2 \nBinary search -- press 3 " +
                "\nMaximum -- press 4 \nMinimum -- press 5 \nAverage -- press 6 \nCheck arithmetic-- press 7 ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            bubbleSort(array);
            System.out.println(Arrays.toString(array));
        } else if (x == 2) {

        } else if (x == 3) {
            bubbleSort(array);
            System.out.println("Input required number");
            x = scanner.nextInt();
            binarySearch(array, x);
        } else if (x == 4) {
            bubbleSort(array);
            System.out.println("Max number is - " + max(array));
        } else if (x == 5) {
            bubbleSort(array);
            System.out.println("Min number is - " + min(array));
        } else if (x == 6) {
            System.out.println("Average value is - " + average(array));
        }else if (x == 7) {
            bubbleSort(array);
            if(checkArithmeticProgression(array) == true){
                System.out.println("Your array have arithmetic progression");
            }
            else {
                System.out.println("Your array doesn’t have arithmetic progression");
            }
        }

    }

    public static void main(String[] args) {
        int start = (int)System.currentTimeMillis();
        int[] array = {1, 5, 8, 4, 9, 7, 6, 2, 3};
        Arithmetic arithmetic = new Arithmetic(array);
        System.out.println(Arrays.toString(array));
        arithmetic.options(array);
        int stop = (int)System.currentTimeMillis();
        System.out.println(stop - start);

    }
}


