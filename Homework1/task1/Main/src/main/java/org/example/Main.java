package org.example;

public class Main {
    public static void main(String[] args) {
        // Примитивные типы
        char charVar = 'G';
        int intVar = 89;
        byte byteVar = 4;
        short shortVar = 56;
        float floatVar = 4.7333436f;
        double doubleVar = 4.355453532;
        long longVar = 12121;

        // Не примитивные типы (обертки)
        Character characterVar = 'G';
        Integer integerVar = 89;
        Byte byteObj = 4;
        Short shortObj = 56;
        Float floatObj = 4.7333436f;
        Double doubleObj = 4.355453532;
        Long longObj = 12121L;

        // Вывод в консоль
        System.out.println("char: " + charVar);
        System.out.println("int: " + intVar);
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("long: " + longVar);

        System.out.println("Character: " + characterVar);
        System.out.println("Integer: " + integerVar);
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Long: " + longObj);
    }
}