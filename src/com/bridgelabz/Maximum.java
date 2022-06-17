package com.bridgelabz;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        //creating object
        Maximum object = new Maximum();
        System.out.println("Maximum among three int is : " + object.compareTo());
    }

    // compareTo method for checking max int
    public Float compareTo() {
        Scanner scanner = new Scanner(System.in);
        // User Input
        System.out.println("Enter three float number");
        float p = scanner.nextFloat();
        float q = scanner.nextFloat();
        float r = scanner.nextFloat();
        float maximum = p;

        if (p > q && p > r) {
            maximum = p;
        } else if (q > p && q > r) {
            maximum = q;

        } else {
            maximum = r;
        }
        return maximum;
    }
}

