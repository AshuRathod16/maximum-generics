package com.bridgelabz;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Welcome to maximum string program");
        //creating object
        Maximum obj = new Maximum();
        System.out.println("Maximum string among the three string is: " + obj.compareTo());
    }

    //compareTo method for finding max String
    public String compareTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three strings: ");
        String a = scanner.nextLine();
        System.out.println(a);

        String b = scanner.nextLine();
        System.out.println(b);

        String c = scanner.nextLine();
        System.out.println(c);

        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;

        }
        return max;
    }

}

