package vt.epam;

public class Forth {
    public static void main(String[] args) {
        System.out.println("4. Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?\n" +
                "Если да, то вывести номера этих элементов.\n");

        int N;
        System.out.println("Введите число размерность массива:");
        N = InputScan.scanInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int temp;

        // считывает число
        for (int j = 0; j <= N; j++) {
            if (array[j] == 1) {
                j++;
            }

            boolean isPrime = false;
            // проверяем число на простоту
            for (int i = 2; i <= j / 2; i++) {
                temp = array[j] % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            // если переменная isPrime равна true, то число простое
            if (isPrime) {
                System.out.print(j + 1 + ". ");
                System.out.println(array[j]);
            }
        }
    }
}

