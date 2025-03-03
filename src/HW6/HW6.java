package HW6;

import java.util.Scanner;
import java.util.Arrays;

public class HW6 {
    public static void lesson6Task1() {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 чисел для заполнения массива:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                numbers[i] = 0;
            }
        }

        System.out.println("Измененный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void lesson6Task2() {
        int[] firstArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 чисел для заполнения первого массива:");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scanner.nextInt();
        }

        int[] secondArray = new int[firstArray.length + 1];
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        secondArray[secondArray.length - 1] = 0;

        System.out.println("Второй массив:");
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        
    }

    public static void lesson6Task3() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Введите 10 чисел для заполнения массива:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        numbers[maxIndex] = 1000;
        numbers[minIndex] = -1000;

        System.out.println("Измененный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void lesson6Task4() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Введите 10 чисел для заполнения массива:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Отсортированный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
