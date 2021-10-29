package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
        //task5();
        //task6();
    }


    //task1

    public static void task1() {
        int year = 2020;
        boolean leapYear = isLeapYear(year);
        printIsLeapYear(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            //  return year % 4 == 0;
            return true;
        }
        return false;
    }

    private static void printIsLeapYear(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    // task2
    public static void task2() {
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        int deviceYear = 2015;
        //int currentYear = LocalDate.now().getYear();
        boolean lightNeeded = isLightNeeded(deviceYear);
        if (clientOS == 1) {
            if (lightNeeded) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (lightNeeded) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    private static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean isLightNeeded(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear) {
            return true;
        }
        return false;
    }

// task3

    public static void task3() {
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + deliveryTerms(deliveryDistance));
    }

    private static int deliveryTerms(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            result++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            result++;
        }
        return result;
    }

    //task4
    public static void task4() {
        String string = "aabccddefgghiijjkk";
        isThereDouble(string);
    }

    private static void isThereDouble(String string) {
        char[] chars = string.toCharArray();
        boolean found = false;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                found = true;
                System.out.println("В строке есть дубли: " + chars[i]);
                break;
            } else if (found) {
                System.out.println("В строке нет дублей");
            }
        }
    }


    //task5
    private static void task5 () {
        int [] arr = {3,2,1,6,5};
        reverseArr (arr);
    }

    public static void reverseArr (int [] arr) {
        for (int i= arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }


}