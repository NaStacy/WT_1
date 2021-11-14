package vt.epam;

import static java.lang.Math.*;

public class First {
    public static void main(String[] args) {
        System.out.println("Решить задачу.\n" +
                "1. Найти значение заданного выражения.");
        int x, y;
        double up, down, res;
        System.out.print("Введите x: ");
        x = InputScan.scanInt();
        System.out.print("Введите y: ");
        y = InputScan.scanInt();
        System.out.println("Результат: " + calculate(x, y));
    }

    private static double calculate(double x, double y) {
        return 1 + (pow(sin(x + y), 2))
                / (2 + abs(x - 2 * x / (1 + pow(x, 2) * pow(y, 2))) + x);

    }
}
