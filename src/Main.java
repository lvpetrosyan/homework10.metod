public class Main {
    public static void examYear(int year) {
        if (year % 4 == 0 && year % 400 != 0) {
            System.out.println("високосный год");
        } else System.out.println("невисокосный год");
    }

    public static void operatingSystem(int typeOS, int yearOld, int yearNow) {
        if (typeOS == 1 && yearOld < yearNow) {
            System.out.println("установите болле облегченную версию Андроид");
        } else if (typeOS == 1 && yearOld == yearNow) {
            System.out.println("установите версию приложения для Андроид");
        } else if (typeOS == 0 && yearOld < yearNow) {
            System.out.println("установите болле облегченную версию IOS");
        } else if (typeOS == 0 && yearOld == yearNow) {
            System.out.println("установите версию приложения для IOS");
        }
    }

    public static void bankDay(int day, int range) {
        if (range > 20 && range < 60) {
            day++;
        } else if (range > 60 && range < 100) {
            day++;
        } else if (range > 100) {
            System.out.println("не доставляется");
        }
        System.out.println("Потребуется дней: " + day);
    }

    public static void main(String[] args) {
        System.out.println("задание 1");
        int year = 1;
        examYear(year);

        System.out.println("задание 2");
        int typeOS = 0;
        int yearOld = 2020;
        int yearNow = 2022;
        operatingSystem(typeOS, yearOld, yearNow);

        System.out.println("задание 3");
        int day = 1;
        int range = 38;
        bankDay(day, range);
    }
}




