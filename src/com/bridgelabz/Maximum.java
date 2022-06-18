package com.bridgelabz;

import java.util.Scanner;
public class Maximum {

    //Generic method for comparing elements
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
     // main method
    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d \n ", 10, 20, 30, maximum(10, 20, 30));
        System.out.printf("Maximum of %f, %f and %f is %f \n ", 1.1, 2.2, 3.3, maximum(1.1, 2.2, 3.3));
        System.out.printf("Maximum of %s, %s and %s is %s \n ", "Apple", "Orange", "Banana", maximum("Apple", "Orange", "Banana"));
    }
}

