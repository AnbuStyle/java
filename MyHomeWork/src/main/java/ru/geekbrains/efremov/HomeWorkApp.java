package ru.geekbrains.efremov;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() { // данный метод выполнен не совсем по д/з, т.к 0 - не явл.
                                        // положительным числом, сделал по своему
        int t = -10;
        int g = 5;

        if (t + g > 0) {
            System.out.println("Число положительное");
        }
        if (t + g == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void printColor() {

        int value = 100;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {   //все методы прогнал через дебаггер, все проходит корректно

        int a = 1;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }

    }

}
