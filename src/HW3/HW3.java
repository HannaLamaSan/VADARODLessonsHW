package HW3;

public class HW3 {
            public static void taskOne() {
            System.out.println("Задание 1");

            int x = (98 - 25) * 6;

            System.out.println("Значение x: " + x);
        }

     public static void taskTwo() {
        System.out.println("Задание 2");

            int x = 8;
            int y = 9;
            int z = 12;

            x += 5;
            y *= 9;
            z -= 6;

            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            System.out.println("Значение z: " + z);
        }

    public static void taskThree() {
        System.out.println("Задание 3");

            int a = 35;
            int b = 65;

            int c = (a > b) ? 5 : 10;

            System.out.println("Значение c: " +c);
        }

    public static void taskFour() {
        System.out.println("Задание 4");

        int x = 5;
        int y = 2;

        x++;
        y--;

        int c = x * y;

        System.out.println("Значение c: " + c); // 12
        System.out.println("Значение x: " + x); // 6
        System.out.println("Значение y: " + y); // 1
    }
}
