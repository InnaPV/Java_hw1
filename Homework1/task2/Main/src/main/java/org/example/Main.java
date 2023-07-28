package org.example;

public class Main {
    public static void main(String[] args) {
        int value = 345;


        int a1 = value / 100;
        int a2 = (value % 100) / 10;
        int a3 = value % 10;


        System.out.println("Число " + value + " -> " + a1 + ", " + a2 + ", " + a3);
                   }
}
