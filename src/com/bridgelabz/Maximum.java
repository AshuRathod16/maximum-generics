package com.bridgelabz;

import java.util.Arrays;

//Generic Class
public class Maximum {
    public static  <T> T maximum(T...a) {

        Arrays.sort(a);
        return a[a.length - 1];
    }

    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to maximum generic program");
        System.out.println("Maximum among three integer is:" + maximum(10,35,-25,-40,48));
        System.out.println("Maximum among three float is:" + maximum(3.5f,4.7f,6.8f,2.9f,3.3f));
        System.out.println("Maximum among three string is:" + maximum("Apple", "Orange", "Banana", "Strawberry", "Peach"));
    }
}

