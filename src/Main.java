public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        int moneySaving = 15000;
        int totalSaving = 0;
        int m = 0;
        while (totalSaving < 2_459_000) {
            m++;
            totalSaving = totalSaving + totalSaving / 100;
            totalSaving = totalSaving + moneySaving;
        }
        System.out.printf("Месяц %s - сумма накоплений равна %s. %n", m, totalSaving);

        System.out.println("\nЗадание 2");
        int i = 0;
        while (i >= 0 && i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 3");
        int population = 12_000_000;
        int fertility = 17 * population / 1000;
        int deaths = 8 * population / 1000;
        int populationGrowth = fertility - deaths;
        int year = 2024;
        while (year < 2034) {
            year++;
            population = population + populationGrowth;
            System.out.printf("Год %s, численность населения составляет %s. %n", year, population);
        }
        System.out.println("\nЗадание 4");
        int money = 15000;
        int saving = 0;
        int month = 0;
        while (saving < 12_000_000) {
            month++;
            saving = saving + money;
            saving = saving + (saving * 7 / 100);
            System.out.printf("Месяц %s - сумма накоплений равна %s. %n", month, saving);
        }
        System.out.println("\nЗадание 5");
        money = 15000;
        saving = 0;
        month = 0;
        while (saving < 12_000_000) {
            month++;
            saving = saving + money;
            saving = saving + (saving * 7 / 100);
            if (month % 6 == 0) {
                System.out.printf("Месяц %s - сумма накоплений равна %s. %n", month, saving);
            }
        }
        System.out.println("\nЗадание 6");
        money = 15000;
        saving = 0;
        m = 0;
        int time = 9 * 12;
        while (m <= time) {
            m++;
            saving = saving + money;
            saving = saving + (saving * 7 / 100);
            if (m % 6 == 0) {
                System.out.printf("Месяц %s - сумма накоплений равна %s. %n", m, saving);
            }
        }
        System.out.println("\nЗадание 7");
        int firstFriday = 5;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница " + firstFriday + " число. Нужно подготовить отчет.");
            firstFriday += 7;
        }
        System.out.println("\nЗадание 8");
        int yearOfComing = 1824;
        int date = 2024;

        while (yearOfComing >= date - 200 && yearOfComing <= date + 100){
            yearOfComing++;
            if (yearOfComing % 79 == 0) {
                System.out.println(yearOfComing);

            }
        }
    }
}












