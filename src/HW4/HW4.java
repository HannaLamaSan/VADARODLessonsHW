package HW4;
import java.util.Scanner;

public class HW4 {
    public static void leson4Task1() {
            System.out.println("Задание 1");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            System.out.print("Введите третье число: ");
            int num3 = scanner.nextInt();

            if (num1 % 2 == 0) {
                System.out.println(num1);
            }

            if (num2 % 2 == 0) {
                System.out.println(num2);
            }

            if (num3 % 2 == 0) {
                System.out.println(num3);

            }

    }

    public static void leson4Task2() {
        System.out.println("Задание 2");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        if (num1 % 2 == 0 && num1 % 5 == 0) {
            System.out.println(num1);
        }

        if (num2 % 2 == 0 && num2 % 5 == 0) {
            System.out.println(num2);
        }

        if (num3 % 2 == 0 && num3 % 5 == 0) {
            System.out.println(num3);
        }

    }

    public static void leson4Task3() {
        System.out.println("Задание 3");

        Scanner scanner = new Scanner(System.in);

        // Вводим значение x с командной строки
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        // Вычисляем результат деления
        double result = 15 / x;

        // Используем оператор switch-case для вывода сообщений
        switch ((int) result) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу: " + result);
                break;
        }
    }


}