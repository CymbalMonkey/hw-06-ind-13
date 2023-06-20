public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task10_2();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");

        int deposit = 29000;
        int savings = 0;
        for (int i = 0; i < 12; i = i + 1) {
            savings = savings + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Итого " + savings);
    }

    public static void task9 () {
        System.out.println("Задача 9");

        int deposit = 29000;
        int savings = 0;
        for (int i = 0; i < 12; i = i + 1) {
            savings = savings + savings / 100;
            savings = savings + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Итого " + savings);
    }

    public static void task10 () {
        System.out.println("Задача 10");

        int multiplierFixed = 2;
        int multiplierChangeable = 0;
        int product = 0;
        for (int i = 0; i < 10; i = i + 1) {
            multiplierChangeable = multiplierChangeable + 1;
            product = multiplierChangeable * multiplierFixed;
            System.out.println(multiplierFixed + "*" + multiplierChangeable + "=" + product);
        }
    }

    public static void task10_2 () {
        System.out.println("Задача 10_2");

        int multiplierFixed = 2;
        int product = 0;
        for (int i = 1; i < 11; i = i + 1) {
            product = i * multiplierFixed;
            System.out.println(multiplierFixed + "*" + i + "=" + product);
        }
    }
}