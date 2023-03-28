import java.util.Scanner;

import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        task1(scanner);
        task2(scanner);
        task3(scanner);
        scanner.close();
    }
    public static String checkLeapYear(int AYear) {
        if (AYear % 4 == 0 && AYear % 100 != 0 || AYear % 400 == 0) {
            return AYear + " год - високосный год.";
        } else {
            return AYear + " год - не високосный год. ";
        }
    }
    public static String checkDevice(int OS, int deviceYear) {
        if (OS == 0) {
            if (deviceYear <= 2015) {
                return ("« Установите облегченную версию приложения для iOS по ссылке »");
            } else {
                return ("« Установите версию приложения для iOS по ссылке »");
            }
        }
        if (OS == 1) {
            if ((deviceYear <= 2015)) {
                return ("« Установите облегченную версию приложения для Android по ссылке »");
            } else {
                return ("« Установите версию приложения для Android по ссылке »");
            }
        }
        if (OS != 0 && OS != 1) {
            return("Другие ОС не поддерживаются");
        }
        return null;
    }
    public static String checkDistance(int distance) {
        int deliveryDistanceDay = 1;
        if (distance>=100) {
            return ("Доставка не осуществляется");
        } else if (distance > 20) {
            deliveryDistanceDay++;
        }
        if (distance > 60) {
            deliveryDistanceDay++;
        }
        return ("Доставка карты займет : " + deliveryDistanceDay + " дня");
    }


    public static void task1 (Scanner scanner){
        System.out.println("Задача 1");
        System.out.print("Введите год : ");
        int year = scanner.nextInt();
        String checking = checkLeapYear(year);
        System.out.println(checking);
    }
    public static void task2 (Scanner scanner){
        System.out.println("Задача 2");
        System.out.print("Введите операционную систему Вашего телефона, где 0 это IOS или 1 это Android : ");
        int clientOS = scanner.nextInt();
        System.out.print("Введите год выпуска Вашего телефона : ");
        int clientDeviceYear = scanner.nextInt();
        String checking = checkDevice(clientOS,clientDeviceYear);
        System.out.println(checking);
    }

    public static void task3 (Scanner scanner) {
        System.out.println("Задача 3");
        System.out.print("Введите расстояние доставки в километрах: ");
        int deliveryDistance = scanner.nextInt();
        String checking = checkDistance(deliveryDistance);
        System.out.println(checking);
    }
}

