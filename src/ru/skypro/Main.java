package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        // task4();
        //task5();
        task6();
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
        printResult(clientOS, deviceYear);
    }


    private static int getClientOS(String name) {
        return name.equals("iOS") ? 0 : 1;
    }

    private static boolean isLightNeeded(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return (deviceYear < currentYear) ? true : false;
    }

    private static void printResult(int clientOS, int deviceYear) {
        boolean lightNeeded = isLightNeeded(deviceYear);
        StringBuilder sb = new StringBuilder();
        sb.append("Установите ");
        if (lightNeeded) {
            sb.append("облегченную ");
        }
        sb.append("версию для ");
        if (clientOS == 0) {
            sb.append("iOS");
        } else {
            sb.append("Android");
        }
        System.out.println(sb.toString());
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
        char prevChar = Character.MAX_VALUE;
        for (char i : chars) {
            if (i == prevChar) {
                System.out.println("Найден дубль в символе " + i);
                return;
            }
            prevChar = i;
        }
        System.out.println("В строке нет дублей");
    }


    //task5
    private static void task5() {
        int[] arr = {3, 2, 1, 6, 5};
        reverseArr(arr);
    }

    public static void reverseArr(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    private static void task6() {
        int[] arr = generateRandomArray();
        System.out.println("Исходный массив " + Arrays.toString(arr));
        double avg = findAvgFrom(arr);
        System.out.println("Среднее значение массива = " + avg);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static double findAvg(int sum, int elementAmount) {
        return sum / (double) elementAmount;
    }

    private static double findAvgFrom(int[] arr) {
        int sum = findSum(arr);
        return findAvg(sum, arr.length);
    }
}