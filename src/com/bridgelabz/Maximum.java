package com.bridgelabz;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        //creating object
        Maximum object = new Maximum();
        System.out.println("Maximum among three int is : " + object.compareTo());
    }

    // compareTo method for checking max int
    public Integer compareTo() {
        Scanner scanner = new Scanner(System.in);
        // User Input
        System.out.println("Enter three number");
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        int maximum = p;

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

