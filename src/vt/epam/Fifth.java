package vt.epam;

import static java.lang.Math.max;

public class Fifth {
    public static void main(String[] args) {
        System.out.println("5. Дана целочисленная таблица А[n]. Найти наименьшее число K элементов, которые можно \n" +
                "выкинуть из данной последовательности, так чтобы осталась возрастающая подпоследовательность.\n");

        int n = 0;
        while (!(n > 0)) {
            System.out.print("Введите размерность массива: ");
            n = InputScan.scanInt();
        }

        System.out.print("Введите элементы массива: ");
        int[] array = InputScan.scanIntArray(n);
        System.out.println(searchingMinNumber(array));
    }

    private static int searchingMinNumber(int[] array) {
        if (array == null) {
            return -1;
        }

        int[] b = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            b[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (array[j] < array[i]) {
                    b[i] = max(b[i], 1 + b[j]);
                }
            }
        }

        int res = b[0];
        for (int i = 0; i < array.length; i++) {
            res = max(res, b[i]);
        }

        return array.length - res;
    }
}
