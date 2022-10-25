import java.time.LocalDate;

public class Main {

    //Task
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " является високосным ");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    //
    public static void checkingOS(int OS, int deviceYear) {
        int currentYear = 2022;
        if (OS == 0 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (OS == 0 && deviceYear < currentYear) {
            System.out.println(" Установите lite версию приложения для IOS по ссылке");
        } else if (OS == 1 && deviceYear >= currentYear) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (OS == 1 && deviceYear < currentYear) {
            System.out.println(" Установите lite версию приложения для Android по ссылке");
        }
    }

    //
    public static void delivery(int deliveryDistance, int daysDelivery) {
        if (deliveryDistance > 20) {
            daysDelivery++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            daysDelivery++;
            System.out.println("Потребуется дней: " + daysDelivery);

        }
    }
    public static void main(String[] args){
        printIsLeapYear(2020);
        checkingOS(1, 2020);
        delivery(95, 1);

    }
}



