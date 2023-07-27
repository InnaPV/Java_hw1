package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 345;
        String numberStr = Integer.toString(number);

        // Виводимо цифри на екран
        System.out.print("Число " + number + " -> ");
        for (int i = 0; i < numberStr.length(); i++) {
            System.out.print(numberStr.charAt(i));
            if (i < numberStr.length() - 1) {
                System.out.print(", ");
            }
        }
    }
}