import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int year = 2010;
        leapYear(year);

        System.out.println("Задание 2");
        int clientOS = 5;
        int clientDeviceYear = 2025;
        mobileAppVersion(clientOS, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 100;
        deliveryCountDay(deliveryDistance);
    }

    public static void printSeparator() {
        System.out.println("===================");
    }

    public static void leapYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " — високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " — не високосный год");
        } else if (year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
        printSeparator();
    }

    public static void mobileAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            System.out.println();
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            System.out.println();
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println();
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println();
        } else if (clientOS != 0 && clientOS != 1) {
            System.out.println("Операционная система телефона введена не корректно. Введите 0 или 1");
        }
        if (clientDeviceYear > currentYear) {
            System.out.println("Вы из будущего");
        }
        printSeparator();
    }

    public static void deliveryCountDay(int deliveryDistance) {
        int deliveryInterval = 40;
        int countDay = (deliveryDistance - 20) / deliveryInterval + 2;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else {
            System.out.println("Потребуется дней: " + countDay);
        }
        printSeparator();

    }
}
