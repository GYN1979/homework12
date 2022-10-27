import java.time.LocalDate;

public class Main {
    //Task1
    private static void printyearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным ");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    //Task2
    public static void checkOS(int OS, int deviceYear) {
        int currentYear = 2022;
        if (OS == 0 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (OS == 0 && deviceYear < currentYear) {
            System.out.println(" Установите lite версию приложения для IOS по ссылке");
        } else if (OS == 1 && deviceYear >= currentYear) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else {
            System.out.println(" Установите lite версию приложения для Android по ссылке");
        }
    }

    //Task3
    public static void calculateDeliveryDay(int deliveryDistance, int daysDelivery) {
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            daysDelivery++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            daysDelivery++;
            System.out.println("Потребуется дней: " + daysDelivery);

        } else if (deliveryDistance > 100) {
            System.out.println(" Не обслуживаем");
        }
    }
        public static void main (String[]args){
            printyearIsLeap(2021);
            checkOS(1, 2020);
            calculateDeliveryDay(110, 1);

        }
    }




