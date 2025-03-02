package HW5;

import java.util.Scanner;

public class HW5 {
    public static void lesson5Task1() {
        System.out.println("Задание 1");

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void lesson5Task2() {
        System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);

       System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int sum = 0;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int current = num1;
        while (current <= num2) {
            sum += current;
            current++;
        }

        System.out.println("Сумма всех чисел от " + num1 + " до " + num2 + " равна: " + sum);

    }

    public static void lesson5Task3() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, которое не заканчивается на 0: ");
        int number = scanner.nextInt();

        int reversNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversNumber = reversNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Число в обратном порядке: " + reversNumber);

    }

    public static void lesson5Task4() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, которое не заканчивается на 0: ");
        int number = scanner.nextInt();

        System.out.print("Четные цифры: ");
        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            tempNumber /= 10;
        }

        System.out.println();

        System.out.print("Нечетные цифры: ");
        tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
            tempNumber /= 10;
        }

        System.out.println();

    }

}
